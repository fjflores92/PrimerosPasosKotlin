fun main(args: Array<String>) {
    println("Hola Mundo")

    println("Valores primitivos sin emplear variables")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    /* En kotlin todo es un objeto */
    val a = 7
    val b = 2

    /* Como valores primitivos (Mala práctica) */
    println("Variables como valores primitivos")
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

    /* Como objetos (Buena práctica) */
    println("Variables como objetos")
    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println(a.rem(b))

    /* Strings */
    val nombreCompleto: String = "Francisco \nFlores"
    println("Mi nombre es: $nombreCompleto")

    val apodo: String = "Paquirri"
    println("Yo soy: $apodo")

    val parrafo: String = """
        ** Aja la baraja
        ** perro del mal
        ** saca las frías
    """.trimIndent()

    println(parrafo.trimMargin("** "))


    /*
    Kotlin tenemos unas funciones dedicadas a la conversión de tipos:
    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()

    A continuación te muestro una lista de las posibles conversiones que podemos hacer:

    String a Int e Int a String
    Long a Int e Int a Long
    String to Int, and Int to String Conversion
    Double a Int e Int a Double
    Long a Double y Double a Long
    Char a Int e Int a Char
    String a Long y Long a String
    String a Array y Array a String
    String a Boolean y Boolean a String
    String a Byte y Byte a String
    Int a Byte y Byte a Int
    */

    /* Rangos */

    val delUnoAlCien: IntRange = 1..100
    for (i in 1..5) {
        println(i)
    }

    val deLaAaLaC: CharRange = 'a'..'z'
    for (caracter in deLaAaLaC) {
        println(caracter)
    }

    //if operadores lógicos booleano true o false
    val numero = 2
    if (numero.equals(5)) {
        println("Sí son iguales")
    } else {
        println("No, no son iguales")
    }

    //when switch case
    when (numero) {
        in 1..5 -> println("Sí está entre 1 y 5")
        in 1..3 -> println("Sí está entre 1 y 3")
        else -> println("No está en alguno de los anteriores")
    }

    var i = 1

    //while
    while (i < 1 ) {
        println("mensaje: $i")
        i++
    }

    i = 1
    do {
        println("mensaje dowhile: $i")
        i++
    } while (i < 1)

    var diasDeLaSemana = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    for (day in diasDeLaSemana) {
        println(day)
    }

    for ( (index,day) in diasDeLaSemana.withIndex() ) {
        println("$index: $day")
    }

    diasDeLaSemana.forEach{
        println(it)
    }

    for (i in 1..3) {
        println("\ni: $i")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) continue
            println("j: $j")
        }
    }

    fun elvisOperator(): Int? {
        var lista:List<Int>?=emptyList()
        return lista?.size?:0
    }

    //Llamada Segura
    var cadena: String? = null
    var longitud: Int? = cadena?.length //null
    println("Longitud: $longitud")

    //Operador Elvis
    var teclado: String? = null
    val longitudTeclado: Int = teclado?.length ?: 0
    println("Longitud Teclado: $longitudTeclado")

    val listaConNulos: List<Int?> = listOf<Int?>(7,null,null,4)
    println("Lista con Null: ${listaConNulos}")

    val listaSinNulos: List<Int?> = listaConNulos.filterNotNull()
    println(listaSinNulos)

    //Array
    val paises:Array<String> = arrayOf(
            "India",
            "Mexico",
            "Colombia",
            "Argentina",
            "Chile",
            "Peru"
    )

    val dias:Array<String> = arrayOf<String>(
            "Lunes",
            "Martes",
            "Miercoles"
    )

    val numeros = intArrayOf(6,6,23,9,2,3,2)

    for (numero in numeros) {
        println(numero)
    }

    var sum = 0
    for (num in numeros) {
        sum += num
    }

    val average = sum / numeros.size
    println("Promedio: $average")

    var arregloDeObjetos = arrayOf(1,2,3)
    var arregloDePrimitivos : IntArray = arregloDeObjetos.toIntArray()

    val suma = arregloDeObjetos.sum()
    println("La suma del arreglo es: $suma")

    // Agregar elemento al arreglo
    arregloDeObjetos = arregloDeObjetos.plus(4)
    for (a in arregloDeObjetos){
        println("Array: $a" )
    }

    val nuevoArregloDeObjetos = arregloDeObjetos.reversedArray()
    for (a in nuevoArregloDeObjetos){
        println("Array reversa: $a")
    }

    nuevoArregloDeObjetos.reverse()
    for (a in arregloDeObjetos){
        println("Array reversa: $a")
    }

    var x = 5
    println("¿x es igual a 5? ${x == 5}")
    var mensaje = "El valor de x es: $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")

}