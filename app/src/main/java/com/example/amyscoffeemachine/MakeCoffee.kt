package com.example.amyscoffeemachine

fun main(){
    makeCoffee(1)
    makeCoffee(2)
    makeCoffee(30)

}

fun makeCoffee(sugarCount: Int){

    if (sugarCount == 1){
        println("Coffee with 1 spoon of sugar")
    }else{
        println("Coffee with $sugarCount spoons of sugar")
    }
}