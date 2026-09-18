package com.condomanger.api.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "tb_usuarios")
class Usuario (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?,
    @Column(unique = true )
    var email: String,
    var senha: String

)