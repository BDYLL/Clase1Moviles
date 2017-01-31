package com.mobiles.diego.clase1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button1,button2;
    private static final int MAIN2_REQUEST_CODE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = (TextView)this.findViewById(R.id.textView);
        this.editText=(EditText)this.findViewById(R.id.editText);
        this.button1=(Button)this.findViewById(R.id.button);
        this.button2=(Button)this.findViewById(R.id.button2);

        this.textView.setText("WAT UP");
        this.editText.setText("OH SNAP");
        this.button1.setText("OPRIME");
        this.button2.setText("WAS");

        this.button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast.makeText(getApplicationContext(),"ANONYMOUS",Toast.LENGTH_SHORT).show();
            }

        });

    }

    public void whatever(View view){
        Toast.makeText(this,"WAT",Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,Main2Activity.class);

        intent.putExtra("texto",this.editText.getText().toString());
        startActivityForResult(intent,MAIN2_REQUEST_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        Log.d("MAINACTIVITY","REQUEST CODE: "+requestCode);

        if(requestCode == MAIN2_REQUEST_CODE && resultCode== Activity.RESULT_OK){
            Toast.makeText(this,data.getStringExtra("regreso"),Toast.LENGTH_SHORT).show();
        }

    }

}
