package n3

/**
 * Description: Application calculates sum of ages of all users and finds the eldest user
 * Task: Refactor, use Kotlin style constructions. Calculate average age of users.
 */

@SuppressWarnings("all")
fun main(args: Array<String>) {

    val u = mutableListOf<User>()
    u.add(User("Pavel", 50))
    u.add(User("Suresh", 50))
    u.add(User("Robin", 50))

    var s = 0
    val j = 0

    var MAX_AGE = 0

    u.forEach {
        MAX_AGE = if (it.age > MAX_AGE) it.age else MAX_AGE
        s += it.age
    }

    println("The eldest user is " + u[j].name)
    println("Sum of all ages is " + s)
    println("Average age is $MAX_AGE")
}
