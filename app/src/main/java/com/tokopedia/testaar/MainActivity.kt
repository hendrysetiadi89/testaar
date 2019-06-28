package com.tokopedia.testaar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tokopedia.mylibrary.Anjing
import com.tokopedia.mylibrary.Ayam

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Anjing().berjalan(this)
        Ayam().bertelur(this)
    }
}
