package com.felipe.kanban.data.model

import android.os.Parcelable
import com.example.pedidos_tela.Status
import kotlinx.android.parcel.Parcelize



@Parcelize
data class Pedido(
    val id: String,
    val restaurante: String,
    val quantidade: Int,
    val produto: String,
    val status: Status = Status.Ativo
) : Parcelable