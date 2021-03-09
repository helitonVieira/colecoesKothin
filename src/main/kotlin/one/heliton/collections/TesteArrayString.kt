package one.heliton.collections

fun main() {
    val nomes = Array<String>(3){""}//padrao pede uma (qtd) e uma inicializaçao {""}
    nomes[0] = "MARIA"
    nomes[1] = "JOAO"
    nomes[2] = "NILDA"

    for (nome in nomes){
        println(nome)
    }
    println("------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    //Outra forma de declarar direto no array

    val nomes2 = arrayOf("Zuleica","Marta","Aline")
    println("------------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}