package com.android.takehomeassignment06_yushug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view) {
        EditText amountEditText = findViewById(R.id.amount_edit_text);
        EditText taxPercentageEditText = findViewById(R.id.tax_percentage_edit_text);
        EditText tipPercentageEditText = findViewById(R.id.tip_percentage_edit_text);

        String amountString = amountEditText.getText().toString();
        if ("".equals(amountString)) {
            return;
        }
        String taxPercentageString = taxPercentageEditText.getText().toString();
        if ("".equals(taxPercentageString)) {
            return;
        }
        String tipPercentageString = tipPercentageEditText.getText().toString();
        if ("".equals(tipPercentageString)) {
            return;
        }

        double amount = Double.parseDouble(amountString);
        double taxPercentage = Double.parseDouble(taxPercentageString);
        double tipPercentage = Double.parseDouble(tipPercentageString);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(getResources().getString(R.string.amount_extra), amount);
        intent.putExtra(getResources().getString(R.string.tax_percentage_extra), taxPercentage);
        intent.putExtra(getResources().getString(R.string.tip_percentage_extra), tipPercentage);

        startActivity(intent);
    }
}
