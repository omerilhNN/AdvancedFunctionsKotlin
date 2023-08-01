package com.omrilhn.advancedfunctionskotlin

fun main()
{
    val myNumList = listOf<Int>(1,3,5,7,9)

    /*val smallNumberList = myNumList.filter { num -> num< 6 } //FILTER numbers that are smaller than 6
    for (num in smallNumberList)
    {
        println(num)
    }*/
    val smallNumberList = myNumList.filter { it < 6  } //FILTER numbers that are smaller than 6
    for (num in smallNumberList) {
        println(num)
    }
    // Map - transform list elements into another form

    val squaredNumbers =    myNumList.map{num -> num*num}
    for(num in squaredNumbers)
    {
        println(num)
    }
    val filterAndMapCombined = myNumList.filter{it < 6}.map{it*it} //First filter then squared numbers (1*1,3*3,5*5)
    for(num in filterAndMapCombined)
    {
        println(num)
    }
    val events = listOf<Event>(
        Event("Christmas","New Year",20),
        Event("Halloween","R&B",23),
        Event("Duman ","Rock",19)

    )
    val filteredEvents = events.filter { events -> events.hour < 23 }
        .map{it.name} //Filter and map events which starts before 23.pm
    for(element in filteredEvents)
    {
        println(element)
    }

}
data class Event(val name:String,val concept:String,val hour:Int)