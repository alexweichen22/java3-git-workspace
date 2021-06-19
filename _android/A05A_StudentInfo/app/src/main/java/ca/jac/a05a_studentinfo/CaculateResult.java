package ca.jac.a05a_studentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CaculateResult extends AppCompatActivity {

    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculate_result);
        initialize();
        mathIntent();

    }

    private void initialize() {
        editTextResult = findViewById(R.id.editTextResult);
    }
    private void mathIntent() {
        Intent receivedIntent = getIntent();
        float receivedResult = receivedIntent.getFloatExtra("result",0f);
        editTextResult.setText(String.valueOf(receivedResult));

    }

    public void closeCaculateResult(View view) {
        finish();
    }
}