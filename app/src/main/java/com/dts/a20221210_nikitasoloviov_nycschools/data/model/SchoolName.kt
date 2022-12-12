package com.dts.a20221210_nikitasoloviov_nycschools.data.model

import com.google.gson.annotations.SerializedName

data class SchoolName(
    @SerializedName("school_name")
    val  schoolName :String,
    val dbn : String,
    val location : String
)
