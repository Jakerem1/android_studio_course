package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnClick (View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText editTxtFirstName = findViewById(R.id.editTxtFirstName);
        EditText editTxtLastName = findViewById(R.id.editTxtLastName);
        EditText editTxtEmail = findViewById(R.id.editTxtEmail);

        txtFirstName.setText("First Name: " + editTxtFirstName.getText().toString());
        txtLastName.setText("Last Name: " + editTxtLastName.getText().toString());
        txtEmail.setText("Email: " + editTxtEmail.getText().toString());
    }
}