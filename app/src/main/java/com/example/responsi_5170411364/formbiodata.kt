package com.example.responsi_364

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.responsi_5170411364.R
import kotlinx.android.synthetic.main.biodata.*
import kotlinx.android.synthetic.main.register.*

class formbiodata : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        val bundle = intent.extras
        val getEmail = bundle?.get("Email")
        val getName = bundle?.get("Nama")
        val getHobi = bundle?.get("Hobi")
        val getUmur = bundle?.get("Umur")
        val getJk = bundle?.get("Jk")
        val getUsername =bundle?.get("Username")
        val getPassword = bundle?.get("Password")

        Hobi.text = getHobi.toString()
        Nama.text = getName.toString()
        Umur.text = getHobi.toString()
        Email.text= getEmail.toString()
        Username.text= getUsername.toString()
        Password.text= getPassword.toString()
        Jk.text= getJk.toString()

    }
}
