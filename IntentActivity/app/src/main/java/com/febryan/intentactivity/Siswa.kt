package com.febryan.intentactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Siswa(
    var nama : String,
    var umur : Int,
    var gender : Char,
    var lulus : Boolean,
    var tinggi : Double
) : Parcelable
