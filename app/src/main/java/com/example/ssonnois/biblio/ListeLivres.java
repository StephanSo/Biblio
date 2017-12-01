package com.example.ssonnois.biblio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ListeLivres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_livres);

        Bundle b = getIntent().getExtras();
        String choix = b.getString("Choix");
        TextView txtMsg = (TextView) findViewById(R.id.txtMsg);
        txtMsg.setText("Voici la liste des "+ choix);
    }
}
