// Singleton object is usually useful if you want to create a fast-access object that can be used

// this is a an object example
object MyBasicObject {
    val name = "MyBasicObject"

    fun doSomething() {
        println("I am doing something rn!")
    }
}

fun main() {
    // you can act it as an static class
    println("My name is ${MyBasicObject.name}")
    MyBasicObject.doSomething()

    // or even assign the object to a variable
    val myAnotherObject =
            object {
                val name = "myAnotherObject"

                fun doSomething() {
                    println("I am doing something rn in another object!")
                }
            }

    println(myAnotherObject.name)
    myAnotherObject.doSomething()

    MyInterfacedObject.doSomething()
    MyClassedObject.doSomething()
}

// or even implement an interface
interface MyInterface {
    fun doSomething()
}

object MyInterfacedObject : MyInterface {
    override fun doSomething() {
        println("I am doing something rn in interfaced object!")
    }
}

// or even extend a class into it
open class MyClass {
    open fun doSomething() {
        println("I am doing something rn!")
    }
}

object MyClassedObject : MyClass() {
    override fun doSomething() {
        println("I am doing another thing in classed object")
    }
}
