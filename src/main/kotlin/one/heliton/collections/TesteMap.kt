package one.heliton.collections

fun main() {
    val pair: Pair <String,Double> = Pair("Joao",1000.0)
    val map1 = mapOf(pair)

    map1.forEach{(k,v) -> println("chave: $k = valor: $v")}

    //outra forma
    println("--------------------------")

    val map2 = mapOf(
        "Pedro" to 2543.65,
        "Raquel" to 542.85
        )

    map2.forEach{(k,v) -> println("chave: $k = valor: $v")}
}