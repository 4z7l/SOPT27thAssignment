package com.igluesmik.sopt.data.model.network.response


import com.google.gson.annotations.SerializedName

data class ResponseSignIn(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
) {
    data class Data(
        @SerializedName("email")
        val email: String,
        @SerializedName("password")
        val password: String,
        @SerializedName("userName")
        val userName: String
    )
}