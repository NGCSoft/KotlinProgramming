
/*
*   1. 'with' function
*   2. 'apply' function
* */
fun main(args: Array<String>) {

    var person = Perrson()

    with(person) {
        name = "Ammi"
        age = 23
    }

    person.apply {
        name = "Ammi"
        age = 23
    }.startRun()

    println(person.name)
    println(person.age)
}

class Perrson {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("Now I am ready to run")
    }
}