package one.heliton.collections

fun main() {
    val salarios = arrayOf(
        2000.toBigDecimal(),
        3000.toBigDecimal(),
        4000.toBigDecimal())

    println("--------------------------------")
    println(salarios.somatoria())

    println("--------------------------------")
    println(salarios.media())
}