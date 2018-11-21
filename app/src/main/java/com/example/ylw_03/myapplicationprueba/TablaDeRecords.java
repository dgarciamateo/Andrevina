package com.example.ylw_03.myapplicationprueba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TablaDeRecords extends AppCompatActivity {

    private List<Jugador> players;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabla_records);

        players = new ArrayList<>();
        readFile();
        final TextView tablaRecords = findViewById(R.id.tV);
        tablaRecords.setText("");
        if(players.size()>0){
            Collections.sort(players);
            for (Jugador jug: players) {
                tablaRecords.setText(tablaRecords.getText() + jug.toString());
            }
        }else{

            tablaRecords.setText(tablaRecords.getText() + "No hay datos registrados");
        }
    }

    private void readFile(){
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(openFileInput("jugadors.txt")));

            String texto;
            while((texto = br.readLine())!=null){
                String[] cadena = texto.split(",");
                players.add(new Jugador(cadena[0],Integer.parseInt(cadena[1])));
            }
            br.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
