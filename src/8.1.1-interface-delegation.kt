interface Vehicle {
    fun horn()
}

// Class that implementing Vehicle interface normally
class Porsche(val name: String) : Vehicle {
    override fun horn() = println("Honk!")

    fun showName() = println("My name is $name")
}

// Class that implementing using interface delegation
// with "by" keyword. It will delegate the implementation of the Vehicle interface
class Lamborghini(vehicle: Vehicle) : Vehicle by vehicle {
    fun showVersion() {
        println("Current version: rev1.0-arcanist")
    }
}

fun main() {
    val porsche = Porsche("Porsche I")
    val lamborghini = Lamborghini(porsche)

    porsche.horn()
    lamborghini.horn() // this is possible!

    lamborghini.showVersion()
}
