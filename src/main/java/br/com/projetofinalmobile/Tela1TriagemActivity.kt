package br.com.projetofinalmobile

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class Tela1TriagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1triagem)


        val btnVoltarTela1 = findViewById<Button>(R.id.btnVoltarTela1)
        val btnSeguinteTela1 = findViewById<Button>(R.id.btnSeguinteTela1)

        btnVoltarTela1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnSeguinteTela1.setOnClickListener{
            val intent = Intent(this, Tela2FatorDeRiscoActivity::class.java)
            startActivity(intent)
        }

    }
}