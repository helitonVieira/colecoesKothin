package one.heliton.collections

fun main() {
    val joao = Funcionario("Joao",6200.95,"CLT")
    val maria = Funcionario("Maria",1200.95,"PJ")
    val gabriel = Funcionario("Gabriel",3200.95,"CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(gabriel.nome,gabriel)

    println(repositorio.findById(joao.nome))
    println("------------------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{println(it)}

}