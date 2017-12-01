package com.example.ssonnois.biblio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import metier.Importation;
import metier.Livre;
import metier.LivreAdapter;

public class ListeLivres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_livres);

        Bundle b = getIntent().getExtras();
        String choix = b.getString("Choix");
        TextView txtMsg = (TextView) findViewById(R.id.txtMsg);
        txtMsg.setText("Voici la liste des "+ choix);

        Importation tacheImport = new Importation();
        tacheImport.execute("http://10.0.2.2:3000/android");
        ListView liste = (ListView) findViewById(R.id.listeLivres);
        try{
            ArrayList<Livre> listeImportee = tacheImport.get();
            if(listeImportee!= null){
                LivreAdapter adapter;
                adapter=new LivreAdapter(getApplicationContext(),listeImportee);
                liste.setAdapter(adapter);
            }
            else{
                Log.i("Parseur","Problème lors de la lecture du fichier");
            }
        } catch (InterruptedException e) {
            Log.i("Parseur", "Interruption lecture fichier"+e.getMessage());
        } catch (ExecutionException e) {
            Log.i("Parseur", "Erreur execution"+ e.getMessage());
        }







    }
}
