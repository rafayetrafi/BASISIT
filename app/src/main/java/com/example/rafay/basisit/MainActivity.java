package com.example.rafay.basisit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etEmail;
    EditText etPassword;
    EditText etAge;

    CheckBox cbJava;
    CheckBox cbPython;
    CheckBox cbC;
    CheckBox cbPHP;

    RadioGroup rgGender;
    RadioGroup rgTypeOfSalary;

    RadioButton rbMale;
    RadioButton rbFemale;
    RadioButton rbSalaryBased;
    RadioButton rbHourlyBased;

    Spinner spinner;

    Button btnRegistration;

    ArrayList <String> selectLocation = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etAge = findViewById(R.id.etAge);

        cbJava = findViewById(R.id.cbJava);
        cbPython = findViewById(R.id.cbPython);
        cbC = findViewById(R.id.cbC);
        cbPHP = findViewById(R.id.cbPHP);

        rgGender = findViewById(R.id.rgGender);
        rgTypeOfSalary = findViewById(R.id.rgTypeOfSalary);

        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        rbSalaryBased = findViewById(R.id.rbBasedSalary);
        rbHourlyBased = findViewById(R.id.rbHourlySalary);

        spinner = findViewById(R.id.spinner);

        btnRegistration = findViewById(R.id.btnRegister);



        Locations();

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,selectLocation);

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String testLocation = selectLocation.get(position);

                Toast.makeText(MainActivity.this, testLocation, Toast.LENGTH_SHORT).show();


                //Test Comment Nothing

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }


    public void Locations()

    {
        selectLocation.add("Select Location");
        selectLocation.add("Dhaka");
        selectLocation.add("Chattagram");
        selectLocation.add("Rajshahi");
        selectLocation.add("Sylhet");
        selectLocation.add("Rangpur");
        selectLocation.add("Noakhali");
    }
}
