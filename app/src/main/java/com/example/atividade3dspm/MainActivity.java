package com.example.atividade3dspm;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        textView1.setText("Valor total:R$"+total);
    }

    public void remover(View view){
        TextView textView = findViewById(R.id.qdt);
        qtd--;
        float total=(qtd*prec);
        textView.setText(""+qtd);
        TextView textView1 = findViewById(R.id.tot);
        textView1.setText("Valor total:R$"+total);
    }

    public void setpreco(View view){
        if(findViewById(R.id.caf1).isSelected() == true){
            prec = 3;
        }
        else if(findViewById(R.id.caf2).isSelected() == true){
            prec = 4;
        }
        else if(findViewById(R.id.caf3).isSelected() == true){
            prec = 5;
        }

    }

}