package br.com.thiengo.flexboxlayouttestes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EscolheTesteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolhe_teste);
    }

    public void testeAtributos( View view ){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity( intent );
    }

    public void testeFlexboxLayoutManager( View view ){
        Intent intent = new Intent(this, ImagesActivity.class);
        startActivity( intent );
    }
}
