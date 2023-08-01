package com.omrilhn.advancedfunctionskotlin

fun main()
{
    val myNumList = listOf<Int>(1,3,5,7,9)

    val allCheck = myNumList.all{it < 6} //Check all and return bool value
    val anyCheck = myNumList.any{it>5} //Check whether there is any value that is greater than 5
    val totalCount = myNumList.count{it > 5}//Element count greater than 5
    val findNum = myNumList.find{it > 5}//find first element which is greater than 5
    val findLastNum = myNumList.findLast { it>5 } //Find last element which is greater than5

    val myPredicate =  {num:Int -> num > 5}
    val allCheckWithPredicate = myNumList.all(myPredicate)
    println(allCheckWithPredicate)
}