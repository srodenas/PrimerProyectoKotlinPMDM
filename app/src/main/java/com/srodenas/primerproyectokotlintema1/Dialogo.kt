package com.srodenas.primerproyectokotlintema1

class Dialogo(){

    private lateinit var listener: OperacionesCliente  //ya se cargará

    fun setListener (mListener : OperacionesCliente){  //carga el listener
        listener = mListener

    }

    fun mostrar() {  //función que lanza el dialogo y captura los datos.
        //simulamos la captura de datos
        val id = "4"
        val nombre = "Pepito"
        println ("Simulando la captura de datos, para la inserción de un cliente")
        listener.add(id, nombre)  //llama al listener.
    }
}