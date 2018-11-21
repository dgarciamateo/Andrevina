package com.example.ylw_03.myapplicationprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button boton;
    private EditText text;
    private TextView label, label2;
    private int intentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int numeroRandom = (int)(Math.random()*100+1);
        boton = (Button) findViewById(R.id.adivina);
        text = (EditText) findViewById(R.id.tf);
        intentos = 0;

        label2 = (TextView) findViewById(R.id.label2);


        label2.setText("Pista, el numero es: "+numeroRandom);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String numero = text.getText().toString();
                int num = Integer.parseInt(numero);

                if(numeroRandom==num){
                    intentos++;
                    Toast.makeText(getApplicationContext(), "HAS ACERTADO",Toast.LENGTH_SHORT).show();
                }else{
                    intentos++;
                    text.setText("");
                    if(num>numeroRandom){

                        Toast.makeText(getApplicationContext(), "El numero es menor",Toast.LENGTH_SHORT).show();

                    }else{

                        Toast.makeText(getApplicationContext(), "El numero es mayor",Toast.LENGTH_SHORT).show();

                    }

                }


            }
        });

    }



}
