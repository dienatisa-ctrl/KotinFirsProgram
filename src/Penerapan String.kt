import java.util.Locale
import java.util.Locale.getDefault

fun main(args: Array<String>){
    //character accurrence in a sentence analysis
    //the string that we want to analyze
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo werel lather, wash, and repead."
    println(s)
    s = s.lowercase(getDefault())

    //counters initialization
    var vawelCount = 0
    var consonantCount = 0

    //definition of character groups
    val vowels ="aeiouy"
    val consonants ="bcdsdfghj"

    //main loop
    for (c in s){
        if (vowels.contains(c)){
            var vowelCount = null
            vowelCount
        }else if (consonants.contains(c)){
            consonantCount++
        }
    }
    println("Vowels: $vawelCount")
    println("consonants: $consonantCount")
    println("other characters: ${s.length-(vawelCount + consonantCount)}")
}
