package br.com.luan.possenai;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Churrasco churrasco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberPicker pessoasNP = (NumberPicker) findViewById(R.id.pessoasNumberPicker);

        pessoasNP.setMinValue(0);
        pessoasNP.setMaxValue(1000);
        pessoasNP.setWrapSelectorWheel(false);
        pessoasNP.setValue(0);
        pessoasNP.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
    }

    public void salvarPessoas(View v){
        NumberPicker campoPessoas = (NumberPicker) findViewById(R.id.pessoasNumberPicker);

        SharedPreferences p = PreferenceManager.getDefaultSharedPreferences(this);

        churrasco = new Churrasco();
        churrasco.setCarne(Integer.parseInt(p.getString("carne_text", "300")));
        churrasco.setRefrigerante(Integer.parseInt(p.getString("refri_text", "500")));
        churrasco.setLinguica(Integer.parseInt(p.getString("linguica_text", "2")));
        churrasco.setPessoas(campoPessoas.getValue());

        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("churrasco", (Serializable) churrasco);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add("Configurações").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent irParaConfig = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(irParaConfig);
                return true;
            }
        });

        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if(id == R.id.action_settings){
//            Toast.makeText(this, "Configurações", Toast.LENGTH_LONG).show();
//            return true;
//        }
//
//        if(id == R.id.action_others){
//            Toast.makeText(this, "Others", Toast.LENGTH_LONG).show();
//            return true;
//        }
//
//        if(id == R.id.menu_categories){
//            Intent intent = new Intent(this, CategoriesActivity.class);
//
//            intent.putExtra("mensagem", "teste bundle");
//
//            startActivity(intent);
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }


}
