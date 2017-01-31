package com.mobiles.diego.clase1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    private TextView text;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.text=(TextView)this.findViewById(R.id.textView3);
        this.b=(Button)this.findViewById(R.id.button3);
        Intent i=this.getIntent();

        this.text.setText(i.getStringExtra("texto"));

    }

    public void goBack(View v){
        Intent i=new Intent();
        i.putExtra("regreso","MENSAJE DE ACTIVIDAD 2");
        setResult(Activity.RESULT_OK,i);
        finish();
    }
}
