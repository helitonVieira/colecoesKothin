package one.heliton.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 3854.53
    salarios[1] = 1000.53
    salarios[2] = 8500.50

    salarios.forEach { println(it) }

    println("-------------------------------")

    salarios.forEachIndexed { index, salario ->
    salarios[index] = salario * 1.1
    println(salarios[index])
    }

    println("-------------------------------")

    val salarios2 = doubleArrayOf( 1000.65,3500.98,2587.54)
    salarios2.sort()
    salarios2.forEach { println(it) }



}