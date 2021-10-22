package br.com.fvaladares.app.pitagorasmvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import br.com.fvaladares.app.pitagorasmvvm.ui.fragment.ListaAlunosFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<ListaAlunosFragment>(R.id.containerMain)
            }
        }
    }
}