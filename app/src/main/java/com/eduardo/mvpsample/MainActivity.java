package com.eduardo.mvpsample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, Contrato.View {

    TextView tvResult;
    EditText etEntry;
    Button btnCalculate;

    private Contrato.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initXML();
        initVars();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_calculate:
                calculate();
                break;
        }
    }

    private void initXML(){
        etEntry = findViewById(R.id.et_entry);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(this);
    }

    private void initVars(){
        presenter = new OperacionPresenter(this);
    }

    private void calculate(){
        presenter.alCuadradoPresenter(etEntry.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }
}


//Steps
/*
1. MainActivity
2. Crear Contrato, Presenter, Model, solo completar Contrato
3. MainActivity - Contrato
4. Presenter
5. Model
6. MainActivity - Contrato
 */