package com.example.humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 名前を太郎、年齢28歳で、趣味映画のHumanのインスタンスを作る
        val human1 = Human("太郎", 28,"映画")
        human1.say()  // 「私の名前は太郎です。年は28歳です。」
        human1.think() // 「私は映画について考える。」

        // 名前を花子、年齢45歳で、趣味散歩のHumanのインスタンスを作る
        val human2 = Human("花子", 45,"散歩")
        human2.say()  // 「私の名前は花子です。年は45歳です。」
        human2.think()   // 「私は散歩について考える。」
    }
}
