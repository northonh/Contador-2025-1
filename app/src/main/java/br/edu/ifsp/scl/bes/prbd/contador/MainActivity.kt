package br.edu.ifsp.scl.bes.prbd.contador

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import br.edu.ifsp.scl.bes.prbd.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activityMainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Nenhuma referência às views deve vir antes da chamada de setContentView
        setContentView(activityMainBinding.root)

        with (activityMainBinding) {
            inicialCb.setOnClickListener {
                contador = (it as CheckBox).text.toString().toInt()
            }

            // Usando um lambda para setar o OnClickListener do Button
            cliqueBt.setOnClickListener {
                contadorTv.text = (++contador).toString()
            }
        }
    }
}