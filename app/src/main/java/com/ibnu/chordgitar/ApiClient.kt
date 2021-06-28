package com.ibnu.chordgitar

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    fun getApiClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://hadi-api.herokuapp.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}