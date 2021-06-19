package ca.masoud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTest2 extends AppCompatActivity
        implements View.OnClickListener {

    Button test2_Ok_Btn, test2_Cancel_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        initialize();
    }

    private void initialize() {
        test2_Ok_Btn = findViewById(R.id.test2_Ok_Btn);
        test2_Ok_Btn.setOnClickListener(this);

        test2_Cancel_Btn = findViewById(R.id.test2_Cancel_Btn);
        test2_Cancel_Btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.test2_Ok_Btn:
                goOk();
                break;

            case R.id.test2_Cancel_Btn:
                goCancel();
                break;
        }
    }

    private void goOk() {
        String strResult = "Ok result from test2";

        //------------------------------------ Create an intent and putExtra result string
        Intent intent = new Intent();
        intent.putExtra("return_result_from_test2", strResult);

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
}
