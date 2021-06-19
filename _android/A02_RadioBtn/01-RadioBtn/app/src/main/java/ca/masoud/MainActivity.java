package ca.masoud;

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

    public void runMe(View view) {
        int selectedRadioBtn = radioGroup.getCheckedRadioButtonId();

        switch (selectedRadioBtn){
            case R.id.radioBtn_1:
                imageView.setImageResource(R.drawable.goofy_confused);
                break;
            case R.id.radioBtn_2:
                imageView.setImageResource(R.drawable.eddy);
                break;
            case R.id.radioBtn_3:
                imageView.setImageResource(R.drawable.double_d);
                break;
        }
    }
}