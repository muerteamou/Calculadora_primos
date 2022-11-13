package com.example.calculadora_primos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    EditText et1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.numerosPrimos);

        tv = findViewById(R.id.resultado);

    }

    public void calcularPrimos(View view) {

        int primos = Integer.parseInt(et1.getText().toString());
        int primoC = primos;

        ArrayList<Integer> listaPrimos = new ArrayList<>();
        listaPrimos.add(1);
        int i = 1;


        while (primos > 0) {
            if (esPrimo(i)) {
                listaPrimos.add(i);
                primos--;
            }
            i++;
        }
        tv.setText(String.valueOf(listaPrimos.get(primoC - 1)));
    }




    public static boolean esPrimo(int x) {
        int contador = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                contador++;
            }
        }
        if (contador != 2)
            return false;
        else
            return true;

    }

}