package br.com.projetofinalmobile

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Tela2FatorDeRiscoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2fatorderisco)


        val btnVoltarTela2 = findViewById<Button>(R.id.btnVoltarTela2)
        val btnSeguinteTela2 = findViewById<Button>(R.id.btnSeguinteTela2)

        btnVoltarTela2.setOnClickListener {
            val intent = Intent(this, Tela1TriagemActivity::class.java)
            startActivity(intent)
        }

        btnSeguinteTela2.setOnClickListener{
            val intent = Intent(this, Tela3LoaActivity::class.java)
            startActivity(intent)
        }

    }
}