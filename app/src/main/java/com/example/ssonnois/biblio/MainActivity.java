package com.example.ssonnois.biblio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnVoirListeLivre = (Button) findViewById(R.id.btnVoirListeLivre);
        btnVoirListeLivre.setOnClickListener(observateurClickBouton);


    }


    private View.OnClickListener observateurClickBouton = new View.OnClickListener(){
        public void onClick(View v){
            switch(v.getId()){
                case R.id.btnVoirListeLivre:
                    Intent i = new Intent(getApplication(), ListeLivres.class);
                    i.putExtra("Choix","Livre");
                    startActivity(i);
                    break;
            }
        }
    };
}
