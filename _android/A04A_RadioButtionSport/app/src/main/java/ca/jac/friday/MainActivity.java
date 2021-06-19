package ca.jac.friday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    RadioGroup radioGroupSex,radioGroupSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        editTextName = findViewById(R.id.editTextName);
        radioGroupSex = findViewById(R.id.radioGroupSex);
        radioGroupSport = findViewById(R.id.radioGroupSport);
    }

    public void showInfo(View view){
        String editTextName_string = editTextName.getText().toString();
        String radioGroupSex_string = "Sex Not Selected. ";
        String radioGroupSport_string = "Sport Not Selected. ";
        int selectedRadioBtnSex = radioGroupSex.getCheckedRadioButtonId();
        int selectedRadioBtnSport = radioGroupSport.getCheckedRadioButtonId();
        switch(selectedRadioBtnSex){
            case R.id.radioButtonFemale:
                radioGroupSex_string = "Female";
                break;
            case R.id.radioButtonMale:
                radioGroupSex_string = "Male";
                break;
        }
        switch(selectedRadioBtnSport){
            case R.id.radioButtonSoccer:
                radioGroupSex_string = "Soccer";
                break;
            case R.id.radioButtonHockey:
                radioGroupSex_string = "Hockey";
                break;
            case R.id.radioButtonHandball:
                radioGroupSex_string = "Handball";
                break;
        }

        String outputString = "Name: " + editTextName_string
                                + "\nSex: " + radioGroupSex_string
                                + "\nSport: " + radioGroupSport_string;

        Toast.makeText(
                this,
                outputString,
                Toast.LENGTH_LONG
        ).show();

    }
}