fun main() {

    val likes = 101;
    val numberString = likes.toString();
    val numArray = numberString.toCharArray();
    val fastNumber = numArray[numArray.size - 1].digitToInt();
    val ending = if (fastNumber == 1) "человеку" else "людям"
    println("Понравилось $likes $ending")
}