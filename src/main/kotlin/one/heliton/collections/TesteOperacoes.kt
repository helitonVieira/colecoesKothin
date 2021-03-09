package one.heliton.collections

fun main() {
    val salarios = doubleArrayOf( 1000.65,3500.98,2587.54)
    //salarios.sort()
    //salarios.forEach { println(it) }
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Media do salario: ${salarios.average()}")

    println("----------filter-------------")
    val salarioMaior2000 = salarios.filter { it > 2000 }
    salarioMaior2000.forEach { println(it) }
}