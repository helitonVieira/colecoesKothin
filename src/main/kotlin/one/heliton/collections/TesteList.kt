package one.heliton.collections

fun main() {

    val joao = Funcionario("Joao",6200.95,"CLT")
    val maria = Funcionario("Maria",1200.95,"PJ")
    val gabriel = Funcionario("Gabriel",3200.95,"CLT")

    val funcionarios = listOf(joao,maria,gabriel)

    funcionarios.forEach{println(it)}
    println("------------find Busca especifica ----------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("------------ sortBy escolher porque ordenar ----------------")
    funcionarios
        .sortedBy { it.salario } // ordenar por salario
        .forEach{println(it)}

    println("------------ sortBy escolher porque ordenar ----------------")
    funcionarios
        .groupBy { it.tipoContratacao }// agrupa por tipo contratacao
        .forEach{println(it)}
}

