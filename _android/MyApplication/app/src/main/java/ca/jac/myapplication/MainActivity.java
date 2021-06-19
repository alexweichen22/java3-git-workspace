package ca.jac.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {

        radioGroup = findViewById(R.id.radioGroup);
        imageView = findViewById(R.id.imageView);
    }

    public void runMe(View view){
        int selectedRadioBtn = radioGroup.getCheckedRadioButtonId();
        switch(selectedRadioBtn){
            case R.id.rbtn1:
                imageView.setImageResource(R.drawable.aaa);
                break;
            case R.id.rbtn2:
                imageView.setImageResource(R.drawable.bbb);
                break;
            case R.id.rbtn3:
                imageView.setImageResource(R.drawable.ccc);
                break;
        }
    }
}