package com.mimo.pigeon.learningkotlinandroid.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class City(
    val name: String = "",
    val country: String = ""
) : Parcelable