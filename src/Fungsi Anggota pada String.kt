import java.util.Locale
import java.util.Locale.getDefault

fun main(args: Array<String>){
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    //toUpperCase() and toLowerCase()
    var config = "Fullsacreen shaDows autosave"
    config = config.lowercase(getDefault())
    println("Will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on?")
    println(config.contains("shadows"))
    println("will sound be turned off?")
    println(config.contains("nosound"))
    println("would the player like to use autosave?")
    println(config.contains("autosave"))

    //replace()
    var strjava = "java is the best!"
    strjava = strjava.replace("java","kotlin")
    println(s)
    println("$strjava is ${strjava.length} characters long.")

    //substring()
    println("I would not banish all of these Internets." .substring(2, 7))

    //compareTo()
    println("alpha".compareTo("bravo"))
}