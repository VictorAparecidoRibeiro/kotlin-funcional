package br.com.estudos.bytebank.teste

import br.com.estudos.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua vergueiro",
        complemento = "Alura",
        cep = "00000-0700"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println(
        "${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())}"
    )
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor
}