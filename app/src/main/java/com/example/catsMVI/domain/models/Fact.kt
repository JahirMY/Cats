package com.example.catsMVI.domain.models

import com.google.gson.annotations.SerializedName

data class Fact(
    @SerializedName("_id") val id: String,
    @SerializedName("text") val text: String
)
