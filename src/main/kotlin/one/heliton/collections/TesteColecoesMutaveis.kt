package one.heliton.collections

fun main() {
    val joao = Funcionario("Joao",6200.95,"CLT")
    val maria = Funcionario("Maria",1200.95,"PJ")
    val gabriel = Funcionario("Gabriel",3200.95,"CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("------multação pode ser alterado-------")
    funcionarios.add(gabriel)
    funcionarios.remove(maria)
    funcionarios.forEach{println(it)}

    println("------mutableSetOf set tem consepcao de valor unico nao pode ter 2 igual ------")
    val funcionarios2 = mutableSetOf(joao, maria)
    funcionarios2.forEach{println(it)}

    println("------multação pode ser alterado-------")
    funcionarios2.add(gabriel)
    funcionarios2.remove(maria)
    funcionarios2.forEach{println(it)}





}