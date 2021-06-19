package ca.masoud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Result extends AppCompatActivity {

    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        initialize();
        myGetIntent();
    }

    private void initialize() {
        editTextResult = findViewById(R.id.editTextResult);
    }

    private void myGetIntent() {
        // 1- Get Intent and extract Float value from it by mentioned key "calculation"
        float result = getIntent().getFloatExtra("result", 0f);

        // 2- Convert received Float number to String to be able to show it in new activity
        String strResult = String.valueOf(result);
        editTextResult.setText(strResult);
    }

    public void goBack(View view) {
        finish();
    }
}
