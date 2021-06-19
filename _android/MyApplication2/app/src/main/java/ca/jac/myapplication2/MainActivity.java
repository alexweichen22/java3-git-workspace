package ca.jac.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
    }

    // on-click
    public void doSum(View view){
        //3-1
        String editText1_string = editText1.getText().toString();
        String editText2_string = editText2.getText().toString();

        //3-2 calculation
        int editText1_int = Integer.parseInt(editText1_string);
        int editText2_int = Integer.parseInt(editText2_string);

        int sum = editText1_int + editText2_int;
        String resultStr = "---" + sum + "---";
        //int sum1 = 5;

        //3-3
        Toast toast = Toast.makeText(
                  this,
                String.valueOf(sum),
                Toast.LENGTH_LONG
                );
        toast.show();
    }
}