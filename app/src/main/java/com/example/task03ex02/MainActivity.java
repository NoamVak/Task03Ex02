package com.example.task03ex02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd=new Random();
    TextView tvCount,tvTF,tvNum1,tvNum2;
    Button btn1,btn2,btn3,btn4,btn5;
    int num1,num2;
    float counter1=0,counter2=0,counter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        tvCount=(TextView)findViewById(R.id.tvCount);
        tvNum1=(TextView)findViewById(R.id.tvNum1);
        tvNum2=(TextView)findViewById(R.id.tvNum2);
        tvTF=(TextView)findViewById(R.id.tvTF);
    }

    public void Clear(View view) {
        tvCount.setText("Counter");
        tvTF.setText("True/False");
        tvNum1.setText("1st Number");
        tvNum2.setText("2nd Number");
        counter1=0;
        counter2=0;
    }

    public void Go(View view) {
        num1=rnd.nextInt(100)+1;
        num2=rnd.nextInt(100)+1;
        tvNum1.setText(num1+" ");
        tvNum2.setText(num2+" ");

    }

    public void Big(View view) {
        counter1++;
        if (num1>num2){
            tvTF.setText("True");
            counter2++;
        }
        else tvTF.setText("False");
        counter3=(counter2/counter1)*100;
        tvCount.setText(counter3+"%");
    }

    public void Equal(View view) {
        counter1++;
        if (num1==num2){
            tvTF.setText("True");
            counter2++;
        }
        else tvTF.setText("False");
        counter3=(counter2/counter1)*100;
        tvCount.setText(counter3+"%");
    }

    public void Small(View view) {
        counter1++;
        if (num1<num2){
            tvTF.setText("True");
            counter2++;
        }
        else tvTF.setText("False");
        counter3=(counter2/counter1)*100;
        tvCount.setText(counter3+"%");
    }
}
