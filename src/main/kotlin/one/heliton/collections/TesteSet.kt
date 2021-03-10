package one.heliton.collections

fun main() {
    val joao = Funcionario("Joao",6200.95,"CLT")
    val maria = Funcionario("Maria",1200.95,"PJ")
    val gabriel = Funcionario("Gabriel",3200.95,"CLT")

    //set funciona como conjunto nao lista
    val funcionarios1 = setOf(joao,gabriel)
    val funcionarios2 = setOf(maria)

    //fazer a uniao conj1 com conj2 igual banco de dados
    val resultUniao = funcionarios1.union(funcionarios2)
    resultUniao.forEach{println(it)}

    //subtract retira do conjunto
    val funcionario3 = setOf(joao,maria,gabriel)
    val resultSubstract = funcionario3.subtract(funcionarios2) //retira do conjunto
    resultUniao.forEach{println(it)}

    //intersect traz o que é comum
    val resultIntersect = funcionario3.intersect(funcionarios2) //intersect traz o que é comum entre os 2 conj
    resultUniao.forEach{println(it)}
}