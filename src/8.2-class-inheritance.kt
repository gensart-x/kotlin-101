// class inheritance

/**
 * the class that will be the parent needs to be added as an open class the child class not need to,
 * if the child is only a child of the parent
 */
open class Animal {
    open fun sayHello() {
        println("Hello!")
    }

    open fun eat() {
        println("I am eating...")
    }

    fun sleep() {
        println("Zzz...")
    }
}

class Dog(private val name: String) : Animal() {
    override fun sayHello() {
        super.sayHello()
        println("Woof! I am ${this.name}")
    }
}

fun main() {
    val shiba = Dog(name="Shiba")

    shiba.sayHello()

    shiba.eat()
    shiba.sleep()
}
