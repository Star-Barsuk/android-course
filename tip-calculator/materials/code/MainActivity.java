package com.example.tipcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 1. Создать переменные
        EditText input_amount;
        EditText input_percent;
        Button btn_calculate;
        TextView output_tip;
        TextView output_total;

        // 2. Связать переменные и элементы интерфейса
        input_amount = findViewById(R.id.etAmount);
        input_percent = findViewById(R.id.etTip);
        btn_calculate = findViewById(R.id.button);
        output_tip = findViewById(R.id.tvTip);
        output_total = findViewById(R.id.tvTotal);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_amount = input_amount.getText().toString();
                String text_percent = input_percent.getText().toString();

                double amount = Double.parseDouble(text_amount);
                double percent = Double.parseDouble(text_percent);

                double tip = amount * percent / 100;
                double total = amount + tip;

                output_tip.setText("" + tip);
                output_total.setText("" + total);
            }
        });

    }
}