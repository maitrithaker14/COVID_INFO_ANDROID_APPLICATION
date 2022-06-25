package com.nopalyer.covidapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private val myfile = "kotlinsharedpreference"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var input_id = this.findViewById<TextInputEditText>(R.id.log_email)
        var input_pass = this.findViewById<TextInputEditText>(R.id.pass)



        var save = findViewById<Button>(R.id.btn_log)
      //  var view = findViewById<Button>(R.id.view)
      //  var clear = findViewById<Button>(R.id.clear)

        val sharedPreferences: SharedPreferences = this.getSharedPreferences( myfile, Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()

        save.setOnClickListener(){
            val id:String = (input_id.text.toString())
            val name:String = input_pass.text.toString()
            editor.putString("id_input",id)
            editor.putString("name_input",name)
            editor.apply()
            editor.commit()
            val toast = Toast.makeText(applicationContext,"Login Succesfully",Toast.LENGTH_LONG).show()
        }
        btn_next.setOnClickListener(){
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}