package br.com.fvaladares.app.pitagorasmvvm.data

import br.com.fvaladares.app.pitagorasmvvm.model.Aluno

object AlunoAPiMock {
    fun alunos() = listOf(
        Aluno(
            ra = "1234",
            nome = "Bruna",
            email = "bruna@gmail.com"
        ),
        Aluno(
            ra = "1235",
            nome = "Caetano",
            email = "caetano@gmail.com"
        ),
        Aluno(
            ra = "1214",
            nome = "Daniel",
            email = "daniel@gmail.com"
        ),
        Aluno(
            ra = "1224",
            nome = "Leonardo",
            email = "leonardo@gmail.com"
        ),
        Aluno(
            ra = "1230",
            nome = "Jarderson",
            email = "jaderson@gmail.com"
        ),
        Aluno(
            ra = "1239",
            nome = "Luiz Henrique",
            email = "luizh@gmail.com"
        ),
        Aluno(
            ra = "1238",
            nome = "Miguel",
            email = "migul@gmail.com"
        ),
    )
}