package br.edu.ifsp.scl.bes.prbd.contador

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    private lateinit var cliqueBt: Button
    private lateinit var contadorTv: TextView
    private lateinit var inicialEt: EditText
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Nenhuma referência às views deve vir antes da chamada de setContentView
        setContentView(R.layout.activity_main)

        cliqueBt = findViewById(R.id.cliqueBt)
        contadorTv = findViewById(R.id.contadorTv)
        // Perceba que usamos uma forma diferente para nomear o id do EditText.
        inicialEt = findViewById(R.id.inicial_et)

/*        inicialEt.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // NSA
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                // NSA
            }

            override fun afterTextChanged(p0: Editable?) {
                contador = p0.toString().toInt()
            }
        })*/

        // A linha abaixo é equivalente ao modo Java de setar um TextChangedListener acima.
        inicialEt.addTextChangedListener { contador = it.toString().toInt() }

        // Usando um lambda para setar o OnClickListener do Button
        cliqueBt.setOnClickListener { contadorTv.text = (++contador).toString() }
    }
}