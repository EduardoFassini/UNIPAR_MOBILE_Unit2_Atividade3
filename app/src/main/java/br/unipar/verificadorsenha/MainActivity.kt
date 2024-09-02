package br.unipar.verificadorsenha

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inputSenha = findViewById<EditText>(R.id.editSenha)
        val resposta = findViewById<TextView>(R.id.labelResposta)
        val btnVerificar = findViewById<TextView>(R.id.btnVerificar)

        btnVerificar.setOnClickListener {
            val verificacao = inputSenha.text.toString()

            if (verificacao == "1234") {
                resposta.setText("Senha Correta")
            } else {
                resposta.setText("Senha Incorreta")
            }
        }

    }
}