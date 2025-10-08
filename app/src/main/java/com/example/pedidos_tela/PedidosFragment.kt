package com.example.pedidos_tela

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pedidos_tela.databinding.FragmentPedidosBinding
import com.felipe.kanban.data.model.Pedido
import com.felipe.kanban.data.model.Produto

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

        val produtos1 = listOf(
            Produto("Açaí Grande", 1, R.drawable.produto_default),
            Produto("Granola", 2, R.drawable.produto_default)
        )
        val produtos2 = listOf(
            Produto("Hambúrguer", 1, R.drawable.produto_default)
        )

        val pedidos = listOf(
            Pedido("1", "Restaurante A", produtos1, Status.Ativo, "12:00"),
            Pedido("2", "Restaurante B", produtos2, Status.Ativo,"15:00")
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = PedidosAdapter(pedidos)
    }
}

