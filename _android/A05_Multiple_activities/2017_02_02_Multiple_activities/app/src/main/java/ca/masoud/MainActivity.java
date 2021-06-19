package ca.masoud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    RadioGroup radioGroupOperation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        radioGroupOperation = findViewById(R.id.rgOperation);
    }

    public void operate(View view) {
        int btnId = view.getId();

        switch (btnId) {
            case R.id.showResultBtn:
                getUserInput();
                break;
            case R.id.finishBtn:
                finish();
                break;
        }
    }

    private void getUserInput() {
        float operand1 = Float.parseFloat(editText1.getText().toString());
        float operand2 = Float.parseFloat(editText2.getText().toString());

        int checkedRadioButtonId = radioGroupOperation.getCheckedRadioButtonId();

        float result = calculateResult(operand1, operand2, checkedRadioButtonId);

        goToResultActivity(result);
    }

    private float calculateResult(float operand1, float operand2, int checkedRadioButtonId) {
        float result = 0;

        // Do calculation based on radio button selected item
        switch (checkedRadioButtonId) {
            case R.id.rbAdd:
                result = operand1 + operand2;
                break;
            case R.id.rbMultiply:
                result = operand1 * operand2;
                break;
            case R.id.rbDivide:
                result = operand1 / operand2;
                break;
            case R.id.rbSubstract:
                result = operand1 - operand2;
                break;
            default:
                result = operand1 + operand2;
        }
        return result;
    }

    private void goToResultActivity(float result) {
        // Go to the next page
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("result", result);
        System.out.println("------------------------- " + result);
        startActivity(intent);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
