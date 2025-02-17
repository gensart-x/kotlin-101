fun main() {
    // you can assign values to variables, directly
    val languageName = "Kotlin"
    val languageVersion = 125

    // or, statically typed
    val languageName2: String = "Kotlin"
    val languageVersion2: Int = 125

    // val is used if the value is not going to change
    // var is used if the value is going to change
    var fruit = "apple"
    fruit = "grape"

    // if you try this, it will return an error
    val fruit2 = "apple"
    fruit2 = "grape"

    // you can provide null-handling with question mark (?)
    var fridge: String? = null
    fridge = "apple"
}
