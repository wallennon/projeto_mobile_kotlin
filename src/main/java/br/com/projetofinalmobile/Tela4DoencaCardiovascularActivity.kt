package br.com.projetofinalmobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class Tela4DoencaCardiovascularActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4doencacardiovascular)

        val btnVoltarTela4 = findViewById<Button>(R.id.btnVoltarTela4)
        val btnSeguinteTela4 = findViewById<Button>(R.id.btnSeguinteTela4)

        btnVoltarTela4.setOnClickListener {
            val intent = Intent(this, Tela3LoaActivity::class.java)
            startActivity(intent)
        }

        btnSeguinteTela4.setOnClickListener{
            val intent = Intent(this, Tela5DcpActivity::class.java)
            startActivity(intent)
        }

    }
}