package br.com.projetofinalmobile

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Tela5DcpActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela5dcp)

        val btnVoltarTela5 = findViewById<Button>(R.id.btnVoltarTela5)
        val btnSalvarTela5 = findViewById<Button>(R.id.btnSalvarTela5)

        btnVoltarTela5.setOnClickListener {
            val intent = Intent(this, Tela4DoencaCardiovascularActivity::class.java)
            startActivity(intent)
        }

        btnSalvarTela5.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}