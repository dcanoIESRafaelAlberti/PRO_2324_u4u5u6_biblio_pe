package org.pebiblioteca

interface Prestable{
    fun prestar(libro: Libro)

    fun devolver(libro: Libro)
}


abstract class ElementoBiblioteca(open var id: Int, open var titulo: String, open var estado: Estado = Estado.DISPONIBLE) {
}