package com.example.amyscoffeemachine

fun main(){
    makeCoffee(0, "Eduardo")
    makeCoffee(1, "Lucelia")
    makeCoffee(2, "Jimmy")
    makeCoffee(3, "Lucinda")
    makeCoffee(5, "Helena")

}

fun makeCoffee(sugarCount: Int, name: String){

    if (sugarCount == 1){
        println("Coffee with 1 spoon of sugar for $name")
    }else if(sugarCount == 0){
        println("Coffee with no sugar for $name")
    }else{
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}