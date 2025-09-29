package com.example.pedidos_tela

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pedidos_tela.databinding.FragmentPedidosBinding
import com.felipe.kanban.data.model.Pedido

class PedidosFragment : Fragment() {

    private var _binding: FragmentPedidosBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPedidosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pedidos = listOf(
            Pedido("1", "Restaurante A", 2, "Pizza", Status.Ativo),
            Pedido("2", "Restaurante B", 1, "Hambúrguer", Status.Ativo),
            Pedido("3", "Restaurante C", 3, "Sushi", Status.Encerrado)
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = PedidosAdapter(pedidos)
    }
}
