package br.edu.ifsp.scl.bes.prbd.contador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var cliqueBt: Button
    private lateinit var contadorTv: TextView
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Nenhuma referência às views deve vir antes da chamada de setContentView
        setContentView(R.layout.activity_main)

        cliqueBt = findViewById(R.id.cliqueBt)
        contadorTv = findViewById(R.id.contadorTv)

        // Usando um lambda para setar o OnClickListener do Button
        cliqueBt.setOnClickListener { contadorTv.text = (++contador).toString() }
    }
}