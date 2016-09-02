package br.cefetmg.aula1208;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarTela1(View v){
        // Abre a Tela1
        Intent it = new Intent(this, Tela1Activity.class);
        startActivity(it);
    }

    public void chamarTela2(View v){
        // Abre a Tela2
        Intent it = new Intent(this, Tela2Activity.class);
        startActivity(it);
    }

}
