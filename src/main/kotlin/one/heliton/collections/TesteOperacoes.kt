package one.heliton.collections

fun main() {
    val salarios = doubleArrayOf( 1000.65,3500.98,2587.54)
    //salarios.sort()
    //salarios.forEach { println(it) }
    println("Maior salario: ${salarios.max()}") //antigo
    println("Maior salario: ${salarios.maxOrNull()}") //recomendado novo
    println("Menor salario: ${salarios.minOrNull()}")
    println("Menor salario: ${salarios.min()}") // antigo
    println("Media do salario: ${salarios.average()}")

    println("----------filter-------------")
    val salarioMaior2000 = salarios.filter { it > 2000 }
    salarioMaior2000.forEach { println(it) }

    println("----------range salario entre 2000 e 5000 -------------")
     println( salarios.count())
    println( salarios.count{it in 2000.0..5000.0}) //qtd de salario entre 2000 e 5000

    println( salarios.find {it == 1000.65}) //busca valor expecifico ex: buscar uma conta bancaria null se nao existir

    println( salarios.any {it == 1000.65}) //retorna true ou false

}