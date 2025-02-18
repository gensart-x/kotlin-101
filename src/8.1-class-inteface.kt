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
