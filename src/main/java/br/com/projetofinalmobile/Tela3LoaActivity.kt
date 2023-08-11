package br.com.projetofinalmobile

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Tela3LoaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3loa)

        val btnVoltarTela3 = findViewById<Button>(R.id.btnVoltarTela3)
        val btnSeguinteTela3 = findViewById<Button>(R.id.btnSeguinteTela3)

        btnVoltarTela3.setOnClickListener {
            val intent = Intent(this, Tela2FatorDeRiscoActivity::class.java)
            startActivity(intent)
        }

        btnSeguinteTela3.setOnClickListener{
            val intent = Intent(this, Tela4DoencaCardiovascularActivity::class.java)
            startActivity(intent)
        }

    }
}