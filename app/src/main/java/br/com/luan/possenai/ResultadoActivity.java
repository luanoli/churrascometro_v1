package br.com.luan.possenai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    Churrasco churrasco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();

        if(intent.hasExtra("churrasco")){

            churrasco = (Churrasco) intent.getSerializableExtra("churrasco");

            new Thread(new Runnable() {
                @Override
                public void run() {

                    final ListaCompras lista = churrasco.calcularListaCompras();

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {

                            TextView resultCarne = (TextView) findViewById(R.id.resultadoCarneTextView);
                            TextView resultLinguica = (TextView) findViewById(R.id.resultadoLinguicaTextView);
                            TextView resultRefrigerante = (TextView) findViewById(R.id.resultadoRefriTextView);

                            resultCarne.setText(lista.getQuantidadeCarne().toString() + " gramas de carne");
                            resultLinguica.setText(lista.getQuantidadeLinguica().toString() + " linguiças");
                            resultRefrigerante.setText(lista.getQuantidadeRefri().toString() + " ml de refrigerante");

                        }
                    });
                }
            }).start();





        }


    }


}
