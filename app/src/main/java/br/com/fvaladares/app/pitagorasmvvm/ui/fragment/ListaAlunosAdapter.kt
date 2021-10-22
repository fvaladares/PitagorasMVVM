package br.com.fvaladares.app.pitagorasmvvm.ui.fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fvaladares.app.pitagorasmvvm.R
import br.com.fvaladares.app.pitagorasmvvm.databinding.ItemListaAlunosBinding
import br.com.fvaladares.app.pitagorasmvvm.model.Aluno
import br.com.fvaladares.app.pitagorasmvvm.ui.fragment.ListaAlunosAdapter.ViewHolder

class ListaAlunosAdapter(
    private val listaAlunos: List<Aluno>,
    private val context: Context
) : RecyclerView.Adapter<ViewHolder>() {
    private lateinit var binding: ItemListaAlunosBinding

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    // Create new views (invoked by the layout manager
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        binding = ItemListaAlunosBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.apply {
            binding.apply {
                tvRaAluno.text = context.resources.getString(R.string.ra, listaAlunos[position].ra)
                tvNomeAluno.text =
                    context.resources.getString(R.string.aluno_a, listaAlunos[position].nome)
            }
        }
    }

    override fun getItemCount() = listaAlunos.size
}