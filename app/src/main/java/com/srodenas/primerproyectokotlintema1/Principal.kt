package com.srodenas.primerproyectokotlintema1

class MyActivity: OperacionesCliente {

    private  var clientes : MutableList<Cliente>  //Ya lo inicializaré más adelante

    init{
        clientes = Repo.listClientes.toMutableList()  //cargo los datos desde el repositorio
    }

    fun init(){
        println ("Simulando click en el botón para abrir el diálogo y captura de datos")
        Thread.sleep(2000)  //Simulamos que tarde lo que tarde
        onButtonClick()  //
        println ("Muestro todos los registros")
        clientes.forEach{
            println (it)
        }
        println ("Fin")
    }


    // Función que simula el click de un botón
    fun onButtonClick(){
        val dialogo = Dialogo()
        dialogo.setListener(this)
        dialogo.mostrar()

    }

    override fun add(id: String, nombre: String): Cliente {
        val nuevo = Cliente (id, nombre)
        clientes.add(nuevo)
        println ("Cliente añadido con id= $id y nombre= $nombre")
        return nuevo
    }

}

fun main(){
    val p = MyActivity()
    p.init()

}