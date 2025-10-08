package com.felipe.kanban.data.model
import com.example.pedidos_tela.Status
data class Pedido(
    val id: String,
    val restaurante: String,
    val produtos: List<Produto>,
    val status: Status,
    val horario: String
)