package br.com.fvaladares.app.pitagorasmvvm.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.fvaladares.app.pitagorasmvvm.databinding.FragmentListaAlunosBinding


class ListaAlunosFragment : Fragment() {
    private val sharedViewModel: MainViewModel by activityViewModels()
    private lateinit var binding: FragmentListaAlunosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedViewModel.obterListaAlunos()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListaAlunosBinding.inflate(
            layoutInflater,
            container,
            false
        )
        criarObservers()
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun criarObservers() {
        criarListaAlunosObserver()
    }

    private fun criarListaAlunosObserver() {
        sharedViewModel.listaAlunos.observe(viewLifecycleOwner, {
            exibirListaAlunos()
        })
    }

    private fun exibirListaAlunos() {
        val adapter = ListaAlunosAdapter(
            listaAlunos = sharedViewModel.listaAlunos.value ?: listOf(),
            context = requireContext()
        )

        binding.rvListaAlunos.layoutManager = LinearLayoutManager(context)
        binding.rvListaAlunos.adapter = adapter
    }
}