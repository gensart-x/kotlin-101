import java.time.Year

// class with defined property value
class Student {
    var name = "Lucy"
    var semester = 5
    var gpa = 3.2
}

// class with arguments, the arguments will be needed when creating the object, except the default
// value
class Person(val name: String, val age: Int = 0)

class Employee(val name: String, val yearEntry: Int) {

    // this is a constructor method. when the object is created, this method will be called
    // automatically
    init {
        println(
                "$name is an employee since $yearEntry and has been working for ${Year.now().value - yearEntry} years"
        )
    }

    // this is class method, if no visibility modifier is defined, it will default to public
    fun calculateSalary() {
        val salary = 1000 * (Year.now().value - yearEntry)
        println("$name's salary currently is $$salary")
    }
}

fun main(args: Array<String>) {
    val student = Student()
    println(student.name)
    println(student.semester)

    val person = Person("Lucy", 18)
    println(person.name)
    println(person.age)

    val employee = Employee("Reva", 2020)
    employee.calculateSalary()

    println(employee.name)
}
