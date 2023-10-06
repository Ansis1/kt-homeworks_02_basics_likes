package ru.netology

fun main() {

    val likes = 22;
    val numberString = likes.toString();
    val numArray = numberString.toCharArray();
    val arrSize = numArray.size
    val preFastNumberIsOne = if (arrSize > 1 && numArray[arrSize - 2].digitToInt() == 1) true else false;
    val fastNumberIsOne = (numArray[arrSize - 1].digitToInt()) == 1;
    val ending = if (!fastNumberIsOne || (preFastNumberIsOne && fastNumberIsOne)) "людям" else "человеку"
    println("Понравилось $likes $ending")

}