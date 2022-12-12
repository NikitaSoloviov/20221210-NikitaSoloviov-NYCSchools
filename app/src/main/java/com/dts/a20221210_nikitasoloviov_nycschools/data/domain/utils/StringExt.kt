package com.dts.a20221210_nikitasoloviov_nycschools.data.domain.utils

fun String?.asException(): Exception {
    return Exception(this ?: "Msg is null")
}