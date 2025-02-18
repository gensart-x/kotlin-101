interface Human {
    val name: String
    val age: Int
    fun sayHello()
}

// class that implements the interface, everything that listed on Human must be implemented on
// Worker
class Worker(override val name: String, override val age: Int) : Human {
    override fun sayHello() {
        println("Hello, my name is $name")
    }
}

// class even able to inherit multiple interfaces
interface Flyable {
    fun fly()
}

interface Swimmer {
    fun swim()
}

class Duck : Flyable, Swimmer {
    override fun fly(): Unit = println("I'm flying")

    override fun swim(): Unit = println("I'm swimming")
}

fun main() {
    val worker1 = Worker("Jason", 25)
    worker1.sayHello()

    val duck1 = Duck()
    duck1.fly()
    duck1.swim()
}
