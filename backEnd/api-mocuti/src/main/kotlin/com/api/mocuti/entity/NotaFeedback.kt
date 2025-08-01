package com.api.mocuti.entity

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import jakarta.validation.constraints.Size

@Entity
data class NotaFeedback(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "id_nota_feedback")
    var id: Int? = null,

    @Column(nullable = true)
    var tipoNota: String? = null
) {
}