
fun calculateFuel(mass: Int): Int {
    return (mass / 3) - 2
}

fun calculateCompoundFuel(mass: Int): Int {
    val fuel = calculateFuel(mass)
    return if(fuel > 0) {
        fuel + calculateCompoundFuel(fuel)
    } else {
        0
    }
}