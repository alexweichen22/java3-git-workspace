package ca.masoud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    RadioGroup radioGroupSex, radioGroupSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        editText = findViewById(R.id.editText);

        //------------------------------------- Create a reference to Radio Groups
        radioGroupSex = findViewById(R.id.radioGroupSex);
        radioGroupSport = findViewById(R.id.radioGroupSport);
    }

    public void showMe(View view) {
        //------------------------------------- Read EditText value
        String name = editText.getText().toString();

        //------------------------------------- Read Radio Group value
        int selected_sex_radio_btn = radioGroupSex.getCheckedRadioButtonId();
        int selected_sport_radio_btn = radioGroupSport.getCheckedRadioButtonId();

        //------------------------------------- Sex
        String strSex;

        if (selected_sex_radio_btn == R.id.radioFemale)
            strSex = "Female";
        else
            strSex = "Male";
        //String radioButtonText = ((RadioButton)findViewById(R.id.radioMail)).getText().toString();

        //------------------------------------- Sport
        String strSport = null;

        switch (selected_sport_radio_btn) {
            case R.id.radioSoccer:
                strSport = "Soccer";
                break;
            case R.id.radioHockey:
                strSport = "Hockey";
                break;
            case R.id.radioHandball:
                strSport = "Handball";
                break;
        }

        String strToToast = "My name is:   " + name + "\n" +
                "I'm:   " + strSex + "\n" +
                "My favourite sport is:   " + strSport;

        Toast.makeText(this, strToToast, Toast.LENGTH_LONG).show();
    }
}
