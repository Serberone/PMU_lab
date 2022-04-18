package com.example.pmu_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
//import org.jetbrains.anko.doAsync
import org.json.JSONObject
import java.net.URL

class MainActivity2 : AppCompatActivity() {

    private var user_field: EditText? = null
    private var btn: Button? = null
    private var info: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        user_field = findViewById(R.id.user_field)
        btn = findViewById(R.id.btn)
        info = findViewById(R.id.info)

        btn?.setOnClickListener {
            if (user_field?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this, "Введите город!",  Toast.LENGTH_SHORT).show()
            else {
                var city: String = user_field!!.text.toString()
                var key: String = "4a75e6448128f9ea6f6a21ed51c2a213"
                var url: String = "http://api.openweathermap.org/data/2.5/weather?q=$city&appid=$key&units=metric&lang=ru"


                //doAsync
                val apiResponse = URL(url).readText()
                val weather = JSONObject(apiResponse).getJSONArray("weather")
                val desc = weather.getJSONObject(0).getString("description")
                val main = JSONObject(apiResponse).getJSONObject("main")
                val temp = main.getString("temp")

                info?.text = "Температура: $temp\n$desc"
            }
        }
    }
}