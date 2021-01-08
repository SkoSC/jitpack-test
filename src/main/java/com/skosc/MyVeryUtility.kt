package com.skosc

class MyVeryUtility {

    fun add(vararg ints: Int) = ints.reduce { a, b -> a + b }
}