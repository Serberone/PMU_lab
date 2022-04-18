package com.example.pmu_lab

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun whyLight(view: View) {
        val myToast = Toast.makeText(this, "Посветить, если темно", Toast.LENGTH_SHORT)
        myToast.show() }

    fun activity2(view: View) {
        val Act2 = Intent (this, MainActivity2::class.java)
        startActivity(Act2)
    }

    fun activityMaps(view: View) {
        val Act3 = Intent (this, MainActivity3::class.java)
        startActivity(Act3)
    }

    fun aboutApp(view: View) {
        val myToast = Toast.makeText(this, "Приложение находится в разработке", Toast.LENGTH_SHORT)
        myToast.show() }
}