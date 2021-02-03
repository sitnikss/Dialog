package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnFon;
    ConstraintLayout constraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFon=(Button)findViewById(R.id.button_fon);
        constraintLayout=(ConstraintLayout) findViewById(R.id.constl);
        context=MainActivity.this;

        btnFon.setOnClickListener(this);

        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        final CharSequence[] items={"Красный","Зелёный","Жёлтый"};

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item){
                    case 0:
                        constraintLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, "Красный", Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        constraintLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context, "Зелёный", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        constraintLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(context, "Жёлтый", Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        AlertDialog alertDialog=builder.create();
                alertDialog.show();
    }
}