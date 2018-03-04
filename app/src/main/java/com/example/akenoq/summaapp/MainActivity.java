package com.example.akenoq.summaapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


/*
    implements View.OnClickListener - для навешивания слушателей

 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadArticle(View view) {
        System.out.print("aaa");
    }

    public void subscribeArticle(View view) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_settings:
                // вызываем вторую активность
                // создаем обьект intent(контент, класс второй активности)
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                // стартуем вторую активность
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
//    public void find_my_summa (View view) {
//        EditText t1 = (EditText) findViewById(R.id.ttt_1);
//        EditText t2 = (EditText) findViewById(R.id.ttt_2);
//        int n1 = Integer.parseInt(t1.getText().toString());
//        String s2 = t2.getText().toString();
//        int n2 = Integer.parseInt(s2);
//        int sum = n1 + n2;
//        String ans = Integer.toString(sum);
//        TextView v1 = (TextView) findViewById(R.id.vvv_1);
//        v1.setText(ans);
//    }

