package com.srodenas.primerproyectokotlintema1

class Dialogo(){
    private lateinit var onClienteAdd: (String, String)-> Unit   //referencia a una función
    /*
    Se podía haber declarado de la forma private var onClienteAdd: ((String, String):Unit) ? = null

    En mostrar:  //Nos aseguramos que la variable tiene una referencia a una función.
        ....
        onClienteAdd?.let{
            onClienteAdd (id, nombre)
        }

     */


    fun setOnClienteAddListener( add: (String, String) -> Unit) {
        onClienteAdd = add
    }



    fun mostrar() {  //función que lanza el dialogo y captura los datos.
        //simulamos la captura de datos
        val id = "4"
        val nombre = "Pepito"
        println ("Simulando la captura de datos, para la inserción de un cliente")
        onClienteAdd (id, nombre)  //llamada de orden superior.
    }
}