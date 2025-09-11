fun main(args: Array<String>){
    //The caesar cipher
    //variable initialization
    val s ="blackholesarewheregoddividedbyzero"
    println("original message: $s")
    var message = ""
    var shift = 1

    //loop interating ober character
    for (c in s){
        var i = c.toInt()
        i += shift
        if (i > 'z'.toInt()){
            i -= 26
        }
        val char = i.toChar()
        message += char
    }
    //printing
    println("Encrypted message: $message")
}
