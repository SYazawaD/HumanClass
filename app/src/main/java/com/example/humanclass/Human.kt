package com.example.humanclass

import android.util.Log

open class Human :Animal,Thinkable{
    var hobby: String

    //プロパティ
    constructor(name:String , age:Int, hobby: String) :super(name,age){
        this.hobby =hobby
    }

    //「私の名前は〜〜です。年は〜〜歳です。」
    override fun say() {
        Log.d("Kotlintest",  "「私の名前は"+this.name + "です。年は"+this.age+"歳です。」" )
    }

    //「私は〜〜について考える。」
    override fun think(){
        Log.d("Kotlintest",  "「私は"+hobby+"について考える。」" )

    }
}