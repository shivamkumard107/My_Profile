package com.example.shivamkumar.myprofile

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var photo: ImageView? = null
    var eduButton: Button? = null
    var training: Button?= null
    var project: Button? = null
    var Skills: Button? = null
    var addDetails: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        photo = findViewById(R.id.profilePhoto)
        photo?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, ProfilePhoto::class.java)
            startActivity(clickIntent)
        })
        eduButton = findViewById(R.id.education)
        eduButton?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, Education::class.java)
            startActivity(clickIntent)
        })
        training = findViewById(R.id.Training)
        training?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, Trainings::class.java)
            startActivity(clickIntent)
        })
        project = findViewById(R.id.Projects)
        project?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, Projects::class.java)
            startActivity(clickIntent)
        })
        Skills = findViewById(R.id.Skills)
        Skills?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,com.example.shivamkumar.myprofile.Skills:: class.java)
            startActivity(clickIntent)
        })
        addDetails = findViewById(R.id.Additional_Details)
        addDetails?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity,com.example.shivamkumar.myprofile.AdditionalDetails::class.java)
            startActivity(clickIntent)
        })


    }
}
