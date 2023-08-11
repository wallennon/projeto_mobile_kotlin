package br.com.projetofinalmobile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tela1TriagemActivity: Tela1TriagemActivity
    lateinit var tela2FatorDeRiscoActivity: Tela2FatorDeRiscoActivity
    lateinit var tela3LoaActivity: Tela3LoaActivity
    lateinit var tela4DoencaCardiovascularActivity: Tela4DoencaCardiovascularActivity
    lateinit var tela5DcpActivity: Tela5DcpActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem Vindo(a) ao Sertão Cuidado!", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)

        val btnTriagem = findViewById<Button>(R.id.btnTriagem)
        val btnFatorDeRisco = findViewById<Button>(R.id.btnFatorDeRisco)
        val btnLoa = findViewById<Button>(R.id.btnLoa)
        val btnDoencaCardiovascular = findViewById<Button>(R.id.btnDoencaCardiovascular)
        val btnDcp = findViewById<Button>(R.id.btnDcp)



        btnTriagem.setOnClickListener {
            val intent = Intent(this, Tela1TriagemActivity::class.java)
            startActivity(intent)
        }
        btnFatorDeRisco.setOnClickListener {
            val intent = Intent(this, Tela2FatorDeRiscoActivity::class.java)
            startActivity(intent)
        }
        btnLoa.setOnClickListener {
            val intent = Intent(this, Tela3LoaActivity::class.java)
            startActivity(intent)
        }
        btnDoencaCardiovascular.setOnClickListener {
            val intent = Intent(this, Tela4DoencaCardiovascularActivity::class.java)
            startActivity(intent)
        }
        btnDcp.setOnClickListener {
            val intent = Intent(this, Tela5DcpActivity::class.java)
            startActivity(intent)
        }

    }
}