package com.example.responsi_5170411364

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.dassboard.*

class dasboard_ac : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        val bundle = intent.extras
        val getEmail = bundle?.get("Email")
        val getName = bundle?.get("Nama")
        val getHobi = bundle?.get("Hobi")
        val getUmur = bundle?.get("Umur")
        val getJk = bundle?.get("Jk")
        val getUsername =bundle?.get("Username")
        val getPassword = bundle?.get("Password")

        Hobi1.text = getHobi.toString()
        Nama1.text = getName.toString()
        Umur1.text = getHobi.toString()
        Email1.text= getEmail.toString()
        username1.text= getUsername.toString()
        password.text= getPassword.toString()
        Jk1.text= getJk.toString()
    }
}
