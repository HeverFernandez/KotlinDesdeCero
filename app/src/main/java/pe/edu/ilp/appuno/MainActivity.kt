package pe.edu.ilp.appuno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*  Lección 01
        Log.d("MainActivity","Método onCreate")
        //Funcion suma
        var sumaValores = suma(25,50,80)
        println("La suma es : $sumaValores")
        //Funcion resta
        var restaResult = resta(50,21)
        println("La resta es: $restaResult")
        //Funcion que retorna el mayor valor
        var mayorResult = mayor(257,69);
        println("El mayor valor es: $mayorResult")
 */
        //Lección 02
        //fwhen()
        //edadPersonas();

        //Lección 03
        //farray()

        //Lección 04
        //fmaps()

        //Lección 05
        floops()
    }

    //Funciones
    fun suma(a:Int,b:Int,c:Int):Int{
        return a+b+c;
    }
    fun resta(a:Int,b:Int):Int{
        return a-b;
    }
    //Operadores condicionales
    // > mayor que;
    // < menor que
    // Mayor o igual que (>=)
    // Menor o igual que (=<)
    // Igualdad (==)
    // Desigualdad (!=)
    fun mayor(a:Int,b:Int):Int{
        var mayorValor:Int
        /*
        if (a>b){
            mayorValor = a
        }else{
            mayorValor = b
        }
        */
        return if(a > b) a else b;
    }

    fun fwhen(){
        //imprimir el idioma que habla un país
        val pais = "EEUU"

        when(pais){
            "Perú","Uruguay","Colombia","Argentina","Venezuela" -> {
                println("Su idioma es el español")
            }
            "Brasil" ->{
                println("Su idioma es portugués")
            }"EEUU" -> {
                println("Su idioma es el ingles")
            }"Portugal" -> {
                println("Su idioma es el portugués")
            }else ->{
                println("Idioma no reconocido")
            }
        }
    }

        //When con Int
        fun edadPersonas(){
            val edad = 150
            when(edad){
                1,2,3,4,5 ->{
                    println("La persona es un bebé")
                } in 6..11 ->{
                    println("La persona es un niño")
                }in 12..17 ->{
                    println("La persona es un adolescente")
                }in 18..69 ->{
                    println("La persona es un adulto")
                }in 70..99 ->{
                    println("La persona es un adulto mayor")
                }else -> {
                    println("La persona es longevo")
                }
            }
        }

/*
En esta sección vamos a hablar de los array
 */
    fun farray() {

    val nombre = "Hever"
    val apellido = "Fernandez"
    val institucion = "La pontificia"
    val edad = "32"

    //Crear un array
    val myArray = arrayListOf<String>()

    // Agregar datos a un array
    myArray.add(nombre)
    myArray.add(apellido)
    myArray.add(institucion)
    myArray.add(edad)
    //myArray.add(edad)
    //myArray.add(edad)

    println(myArray)

    //Añadir un conjunto de datos al array
    myArray.addAll(listOf("Hola", "Bienvenidos a la pontificia", "Suscribanse a nuestro canal"))
    println(myArray)

    //Acceso al valor de un elemento de un array
    val myCompania = myArray[2]
    println("La compañia donde labora es $myCompania")

    //Modificar valor de un elemento de un array
    myArray[0] = "DANTE"
    myArray[3] = "40"
    println(myArray)

    //Eliminar datos de un array
    myArray.removeAt(4)
    println(myArray)

    //Recorrer datos de un array
    myArray.forEach {
        println(it)
    }

    //Otras operaciones
    myArray.count()
    myArray.clear()
    myArray.first()
    myArray.last()
    myArray.sort()
    }

    /*
    En esta sección vamos a hablar de mapas, tambien llamados diccionarios
     */
    fun fmaps(){

        //Crear un nuevo Map <Clave, Valor>
        var myMap = mapOf<String,Int>()

        //Añadir elementos
        myMap = mutableMapOf("Laura" to 1, "Patricio" to 2,"Jorge" to 3,"Samy" to 4)
        println(myMap)

        //Añadir otro valor
        myMap["Pepito"] = 5
        myMap.put("Lilian",6)
        println(myMap)

        //Acceso a un dato de un MAP
        val dato = myMap["Jorge"]
        println("El valor de la clave solicitada es: $dato")
    }

    /*
    En esta sección vamos a desarrollar los loops, tambien llamados bucles o secuencias repetitivas
     */
    fun floops(){

        val myArray = listOf("Hola","Bienvenidos a pontificia","Suscribanse a nuestro canal","Ayacucho - Peru")
        val myMap = mutableMapOf("Laura" to 1, "Patricio" to 2,"Jorge" to 3,"Samy" to 4)

        //Recorrer los elementos de un array
        //For
        for (myDato in myArray){
            println(myDato)
        }

        //Recorrer los elementos de un Map
        for (myElemento in myMap){
            println("${myElemento.key} : ${myElemento.value}")
        }

        //Imprimir los primeros 10 números positivos y pares
        for (i in 0..5){
            val result = i*2
            println("Número : $result")
        }

        for(i in 0 until 5){
            println("valor : $i")
        }

        for (i in 1..10 step 2){
            println("Valor de 2 en 2 : $i")
        }

        for (i in 10 downTo 0 step 2){
            println("Valor impreso de manera inversa : $i")
        }

        //While se ejecuta mientras que la condición se cumpla
        var x = 0
        val valor = true
        while (x<10){
            println("Valor con WHILE : $x")
            x += 1
        }
    }

}



















