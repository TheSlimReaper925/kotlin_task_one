fun main() {
    var arrayOfNumbers = arrayOf<Int>(16, 123, 1531, 10, 1241, 214532, 2, 55, 2135)
    println(sumOfEvens(arrayOfNumbers))
    println(checkPalindrome("აი, რა მზის სიზმარია"))
    println(checkPalindrome("აი, დროშა, აშორდია,"))
    println(checkPalindrome("not palindrome"))
}

fun sumOfEvens(arrayOfNumbers: Array<Int>): Int{
    var sum = 0
    for (i in 0..arrayOfNumbers.size step 2){
        if(i < arrayOfNumbers.size) sum += arrayOfNumbers[i]
    }
    return sum
}
fun checkPalindrome(text: String): Boolean{
    var newText = text.replace("[!@#$%^&*=+()\\- ,.;'\"]".toRegex(), "")
    if (newText == newText.reversed()) return true
    return false
}