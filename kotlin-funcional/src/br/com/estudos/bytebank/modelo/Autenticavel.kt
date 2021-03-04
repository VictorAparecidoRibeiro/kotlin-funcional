package br.com.estudos.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}