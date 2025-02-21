package br.edu.ifsp.scl.bes.prbd.contador

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
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
            inicialSp.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
//                    contador = resources.getStringArray(R.array.valores_iniciais)[position].toInt()
                    contador = when(position) {
                        0 -> { 0 }
                        1 -> { 5 }
                        2 -> { 10 }
                        else -> { -1 }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // NSA
                }
            }

            // Usando um lambda para setar o OnClickListener do Button
            cliqueBt.setOnClickListener {
                contadorTv.text = (++contador).toString()
            }
        }
    }
}