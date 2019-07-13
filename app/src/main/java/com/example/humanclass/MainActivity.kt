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
        // 「私の名前は太郎です。年は28歳です。」
        human1.say()  //

        // 名前を太郎、年齢28歳で、趣味映画のHumanのインスタンスを作る
        val human2 = Human("太郎", 28,"映画")
        // 「私は映画について考える。」
        human2.think()  // ハチが吠えます（ログ出力）
    }
}
