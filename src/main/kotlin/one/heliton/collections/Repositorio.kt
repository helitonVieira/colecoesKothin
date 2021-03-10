package one.heliton.collections

class Repositorio <T> {

    private val map = mutableMapOf<String,T>()
    //função criação
    fun create(id: String, value:T){
        map[id] = value
    }
    // função remove
    fun remove(id: String)= map.remove(id)

    //função busca por id
    fun findById(id:String) = map[id]

    //função busca todos
    fun findAll()= map.values
}