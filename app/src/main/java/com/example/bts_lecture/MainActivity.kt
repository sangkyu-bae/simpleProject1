package com.example.bts_lecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 클릭되었는지 확인
        val image1 =findViewById<ImageView>(R.id.btsImage1)
        val image2 =findViewById<ImageView>(R.id.btsImage2)
        val image3 =findViewById<ImageView>(R.id.btsImage3)
        val image4 =findViewById<ImageView>(R.id.btsImage4)
        val image5 =findViewById<ImageView>(R.id.btsImage5)
        val image6 =findViewById<ImageView>(R.id.btsImage6)
        val image7 =findViewById<ImageView>(R.id.btsImage7)


        image1.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
            //2. 화면이 클릭되면, 다음 화면 넘어가서, 크게 보여주기

            var intent =Intent(this, Bts1Activity::class.java)
            startActivity(intent)

        }


        image2.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
            //2. 화면이 클릭되면, 다음 화면 넘어가서, 크게 보여주기

            var intent =Intent(this, Bts2Activity::class.java)
            startActivity(intent)

        }

        image3.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
            //2. 화면이 클릭되면, 다음 화면 넘어가서, 크게 보여주기

            var intent =Intent(this, Bts3Activity::class.java)
            startActivity(intent)

        }
        image4.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
            //2. 화면이 클릭되면, 다음 화면 넘어가서, 크게 보여주기

            var intent =Intent(this, Bts4Activity::class.java)
            startActivity(intent)

        }
        image5.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
            //2. 화면이 클릭되면, 다음 화면 넘어가서, 크게 보여주기

            var intent =Intent(this, Bts5Activity::class.java)
            startActivity(intent)

        }
        image6.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
            //2. 화면이 클릭되면, 다음 화면 넘어가서, 크게 보여주기

            var intent =Intent(this, Bts6Activity::class.java)
            startActivity(intent)

        }
        image7.setOnClickListener {

            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()
            //2. 화면이 클릭되면, 다음 화면 넘어가서, 크게 보여주기

            var intent =Intent(this, Bts7Activity::class.java)
            startActivity(intent)

        }






    }
}