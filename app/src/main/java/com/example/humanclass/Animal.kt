package com.example.humanclass
import android.util.Log

abstract class Animal {
    //プロパティ
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    //抽象クラスメソッド
    abstract fun say()

}