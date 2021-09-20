package com.example.glassdoor.fragment

import android.app.ProgressDialog
import android.content.ContentValues
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.glassdoor.Api
import com.example.glassdoor.POJO.GlassResponse
import com.example.glassdoor.POJO.Glassdoor
import com.example.glassdoor.POJO.Review
import com.example.glassdoor.R
import com.example.glassdoor.adapter.ReviewListAdapter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ReviewFragment : Fragment() {
    internal var moAdapter: ReviewListAdapter? = null
    lateinit var recyclerView: RecyclerView

    fun newInstance(): ReviewFragment {
        return ReviewFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val iView = inflater!!.inflate(R.layout.fragment_interview, container, false)
        recyclerView = iView.findViewById<RecyclerView>(R.id.rvInterviewList)
        getReviewData()

        return iView
    }

    private fun getReviewData(): ArrayList<Review> {
        var rList = ArrayList<Review>()

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

                        var data: Review? = null
                        if(myresults != null){
                            for (i in 0 until myresults.size) {
                                var resultList = myresults.get(i)

                                data = resultList.review
                                Log.d(ContentValues.TAG, "Success:" + data)
                                if(data != null){
                                    rList.add(Review(data.advice,data.approvalStatus,data.careerOpportunitiesRating,data.cons,
                                    data.employerName,data.employmentStatus,data.headline,data.jobTitle,data.pros))

                                    moAdapter = ReviewListAdapter(rList)
                                    recyclerView.adapter = moAdapter
                                    recyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
                                }

                            }
                        }


                    }
                }
            }
        })

        return rList
    }

}