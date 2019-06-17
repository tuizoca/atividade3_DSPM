package com.example.atividade3dspm;


import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int qtd=0;
    float prec = 3;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void adicionar(View view){
        TextView textView = findViewById(R.id.qdt);
        qtd++;
        float total=(qtd*prec);
        textView.setText(""+qtd);
        TextView textView1 = findViewById(R.id.tot);
        textView1.setText("O pedido de "+qtd+" cafe(s) vai custar R$"+total);
    }

    public void remover(View view){
        TextView textView = findViewById(R.id.qdt);
        qtd--;
        float total=(qtd*prec);
        textView.setText(""+qtd);
        TextView textView1 = findViewById(R.id.tot);
        textView1.setText("O pedido de "+qtd+" cafe(s) vai custar R$"+total);
    }

    public void setpreco(View view){
        if(((RadioButton) findViewById(R.id.caf1)).isChecked() == true){
            prec = 3;
            float total = qtd*prec;
            TextView textView = findViewById(R.id.tot);
            textView.setText("O pedido de "+qtd+" cafe(s) vai custar R$"+total);

        }
        else if( ((RadioButton) findViewById(R.id.caf2)).isChecked() == true){
            prec = 4;
            float total = qtd*prec;
            TextView textView = findViewById(R.id.tot);
            textView.setText("O pedido de "+qtd+" cafe(s) vai custar R$"+total);
        }
        else if( ((RadioButton) findViewById(R.id.caf3)).isChecked() == true){
            prec = 5;
            float total = qtd*prec;
            TextView textView = findViewById(R.id.tot);
            textView.setText("O pedido de "+qtd+" cafe(s) vai custar R$"+total);
        }

    }


}