package com.example.shivamkumar.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Trainings : AppCompatActivity() {

    var InternshalaWebD_Certificate: Button? = null
    var AndroidInternshalaCertificate: Button? = null
    var JavaCertificate: Button? = null
    var SQLUdemy_Certificate : Button? = null
    var Android_UdemyCertificate: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainings)

        SQLUdemy_Certificate = findViewById(R.id.UdemySQLCert)
        SQLUdemy_Certificate?.setOnClickListener({
            var clickIntent = Intent(this@Trainings,Certificate_SQL_Udemy::class.java)
            startActivity(clickIntent)
        })
        InternshalaWebD_Certificate = findViewById(R.id.webDCert)
       InternshalaWebD_Certificate?.setOnClickListener({
            var clickIntent = Intent(this@Trainings, CertificateWebD_::class.java)
            startActivity(clickIntent)
        })
        AndroidInternshalaCertificate = findViewById(R.id.androidInternshalaCert)
        AndroidInternshalaCertificate?.setOnClickListener({
            var clickIntent = Intent(this@Trainings,CertificateAndroid_Internshala::class.java)
            startActivity(clickIntent)
        })
        JavaCertificate = findViewById(R.id.javaCert)
        JavaCertificate?.setOnClickListener({
            var clickIntent = Intent(this@Trainings,Certificate_Java::class.java )
            startActivity(clickIntent)
        })
        Android_UdemyCertificate = findViewById(R.id.UdemyAndroidCert)
        Android_UdemyCertificate?.setOnClickListener({
            var clickIntent = Intent(this@Trainings,Certificate_Android_Udemy::class.java)
            startActivity(clickIntent)
        })
    }
}
