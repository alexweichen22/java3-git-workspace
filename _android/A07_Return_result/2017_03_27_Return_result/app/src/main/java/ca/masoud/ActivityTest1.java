package ca.masoud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ActivityTest1 extends AppCompatActivity
        implements View.OnClickListener, TextWatcher {

    TextView textViewOperation;
    EditText editTextAnswer;
    Button btnGenerate, btnValidate, btnCancel;

    int rightResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        initialize();
    }

    private void initialize() {

        textViewOperation = findViewById(R.id.textViewOperation);
        editTextAnswer = findViewById(R.id.editTextAnswer);

        btnGenerate = findViewById(R.id.btnGenerate);
        btnGenerate.setOnClickListener(this);

        btnValidate = findViewById(R.id.btnValidate);
        btnValidate.setOnClickListener(this);

        btnCancel = findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(this);

        //------------------------------------------ Validation
        editTextAnswer.addTextChangedListener(this);

        btnValidate.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnGenerate:
                goGenerate();
                break;

            case R.id.btnValidate:
                goValidate();
                break;

            case R.id.btnCancel:
                goCancel();
                break;
        }
    }

    private void goGenerate() {
        Random random = new Random();
        int operand1 = random.nextInt(10);
        int operand2 = random.nextInt(10);
        rightResult = operand1 + operand2;

        String operation = operand1 + "+" + operand2 + "= ?";

        textViewOperation.setText(operation);
    }

    private void goValidate() {
        int integerUserAnswer = Integer.parseInt(editTextAnswer.getText().toString());

        String strResult;

        if (integerUserAnswer == rightResult) {
            strResult = "Right Answer!";
        } else {
            strResult = "Wrong Answer!";
        }

        //------------------------------------ Create an intent and putExtra result string
        Intent intent = new Intent();
        intent.putExtra("return_result_tag", strResult);

        //------------------------------------ Set Result for MainActivity
        setResult(RESULT_OK, intent);
        finish();
    }

    private void goCancel() {
        String strResult = "Operation canceled";

        //------------------------------------ Create an intent
        Intent intent = new Intent();
        intent.putExtra("cancel_tag", strResult);

        //------------------------------------ Set Result for MainActivity
        setResult(RESULT_CANCELED, intent);
        finish();
    }

    // TextWatcher Interface
    @Override
    public void afterTextChanged(Editable s) {
        try {
            int userAnswer = Integer.parseInt(editTextAnswer.getText().toString());
            if (userAnswer > 18) {
                Toast toastRange = Toast.makeText(this, "The total should be <= 18", Toast.LENGTH_SHORT);
                toastRange.setGravity(Gravity.TOP|Gravity.CENTER, 0, 500);
                toastRange.show();

                btnValidate.setEnabled(false);
            } else
                btnValidate.setEnabled(true);
        } catch (Exception e) {
            Toast toastException = Toast.makeText(this, "Enter a number data type", Toast.LENGTH_SHORT);
            toastException.setGravity(Gravity.TOP|Gravity.CENTER, 0, 500);
            toastException.show();
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}