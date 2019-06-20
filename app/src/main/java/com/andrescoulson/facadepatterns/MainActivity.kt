package com.andrescoulson.facadepatterns

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.andrescoulson.facadepatterns.facade.Facade
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val facade = Facade()
        text_facade.setText(facade.dispenseOrange())
    }
}
