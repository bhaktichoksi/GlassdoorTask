package com.example.glassdoor.fragment

import android.app.ProgressDialog
import android.content.ContentValues.TAG
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.glassdoor.Api
import com.example.glassdoor.POJO.GlassResponse
import com.example.glassdoor.POJO.Glassdoor
import com.example.glassdoor.POJO.Interview
import com.example.glassdoor.POJO.Result
import com.example.glassdoor.R
import com.example.glassdoor.adapter.InterviewListAdapter
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URI.create
import kotlin.io.println as println1

class InterviewFragment : Fragment() {

    internal var moAdapter: InterviewListAdapter? = null
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val iView = inflater!!.inflate(R.layout.fragment_interview, container, false)
        recyclerView = iView.findViewById<RecyclerView>(R.id.rvInterviewList)
        getInterviewData()

        return iView
    }

    private fun getInterviewData(): ArrayList<Interview> {
        var iList = ArrayList<Interview>()

        val progress = ProgressDialog.show(activity, null, null, true)
        progress.setContentView(R.layout.activity_progress_bar)
        progress.getWindow()?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val ROOT_URL = "https://raw.githubusercontent.com/vikrama/feed-json-sample/master/"
        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                    .baseUrl(ROOT_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }

        fun getApiService(): Api {
            return getRetrofitInstance().create(Api::class.java)
        }

        val api = getApiService()
        val call = api.getGlassdoors()

        call?.enqueue(object : Callback<Glassdoor> {
            override fun onFailure(call: Call<Glassdoor>, t: Throwable?) {

            }

            override fun onResponse(call: Call<Glassdoor>, response: Response<Glassdoor>) {
                progress.dismiss()
                if (response != null) {
                    if (response.isSuccessful) {
                        var dataG: String? = ""

                        val gson = Gson()
                        val type = object : TypeToken<GlassResponse>() {}.type
                        dataG = Gson().toJson(response.body().response)

                        val myresultList: GlassResponse = gson.fromJson(dataG, type)
                        var myresults = myresultList.results

                        var data: Interview? = null
                        if(myresults != null){
                            for (i in 0 until myresults.size) {
                                var resultList = myresults.get(i)

                                data = resultList.interview
                                Log.d(TAG, "Success:" + data)
                                if(data != null){
                                    iList.add(Interview(data.approvalStatus,data.employerName,data.interviewDate,data.jobTitle,data.location,data.outcome,
                                            data.processAnswer,data.processDifficulty,data.processInterviewExperience,data.processOverallExperience,data.questions))

                                    moAdapter = InterviewListAdapter(iList)
                                    recyclerView.adapter = moAdapter
                                    recyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
                                }

                            }
                        }


                    }
                }
            }
        })
        return iList
    }
}