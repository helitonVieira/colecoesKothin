package one.heliton.collections

fun main() {
    val values = IntArray(5)

    values[0] = 8
    values[1] = 5
    values[2] = 2
    values[3] = 9
    values[4] = 10

// 1 formato
    for (valor in values){
        println(valor)
    }
//2 formato
   /* values.forEach {
        println(it)
    }*/
//3 formato
    values.sort() //ordenar menor para maior
    for (index in values.indices){
        println(values[index])
    }
}