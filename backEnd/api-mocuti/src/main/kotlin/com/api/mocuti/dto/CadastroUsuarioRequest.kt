package com.api.mocuti.dto

import com.api.mocuti.entity.Cargo
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate


data class CadastroUsuarioRequest(
    val nomeCompleto: String,
    val cpf: String,
    val telefone: String?,
    @JsonFormat(pattern = "yyyy-MM-dd")
    val dataNascimento: LocalDate,
    val genero: String?,
    val email: String,
    val senha: String,
    val cargo: Int,
    val endereco: Int,
    val canalComunicacao: Int,
)