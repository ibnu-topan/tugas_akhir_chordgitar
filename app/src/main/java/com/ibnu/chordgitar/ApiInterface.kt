package com.ibnu.chordgitar

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("chord")
    fun getChordGitar(
        @Query("q") strJudulLagu: String
    ): Call<String>

}