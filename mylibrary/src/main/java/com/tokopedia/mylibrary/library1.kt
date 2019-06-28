package com.tokopedia.mylibrary

import android.content.Context
import android.util.Log

open class Hewan(var kaki:Int){

}

class Ayam() : Hewan(2){
    fun bertelur(context: Context){
        Log.i("TEST", context.getString(R.string.library1))
    }
}


class Anjing() : Hewan(4){
    fun berjalan(context: Context){
        Log.i("TEST", context.getString(R.string.walk))
    }
}
