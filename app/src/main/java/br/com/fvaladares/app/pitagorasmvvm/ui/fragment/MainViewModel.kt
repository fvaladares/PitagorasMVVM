package br.com.fvaladares.app.pitagorasmvvm.ui.fragment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.fvaladares.app.pitagorasmvvm.data.AlunoAPiMock
import br.com.fvaladares.app.pitagorasmvvm.model.Aluno

class MainViewModel : ViewModel() {
    private val _listaAlunos = MutableLiveData<List<Aluno>>()
    val listaAlunos: LiveData<List<Aluno>> = _listaAlunos
    private val nome = ""


    fun obterListaAlunos() {
        _listaAlunos.value = AlunoAPiMock.alunos()
        Log.v("PITAGORAS", "Lista de alunos obtida.")
    }
}