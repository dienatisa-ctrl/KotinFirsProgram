fun main(args: Array<String>){
    //Split() and joinTostring()
    //morse code decoder
    //the string which we want to decode
    val s = ".. -.-. - ... --- -.-. .. .- .-.."
    println("the original message: $s")

    //the string with the decoded message
    var message = ""

    //array definition
    val alphabetChars = "abcdefghijklmnopqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "-- ..")

    //splitting the string into morse characters
    val characters = s.split("")

    //iterating over morse characters
    for (morseChar in characters) {
        val index = morseChar.indexOf(morseChar)
        //character was found
        if (index != -1) {
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}
