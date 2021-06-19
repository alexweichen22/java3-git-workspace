package ca.jac.a05a_studentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DisplayPage extends AppCompatActivity {

    EditText editTextDisplay, editTextOperand1, editTextOperand2;
    RadioGroup radioGroupOperator;
    ArrayList<Student> studentArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_page);
        initialize();
        myGetIntent();
    }

    private void initialize() {

        editTextDisplay = findViewById(R.id.displayStudentInfo);
        editTextOperand1=findViewById(R.id.editTextOperand1);
        editTextOperand2=findViewById(R.id.editTextOperand2);
        radioGroupOperator=findViewById(R.id.radioGroupOperator);
    }


    public void myGetIntent(){
        Intent receivedIntent = getIntent();
        //String displayString = receivedIntent.getStringExtra("outputString");
        //editTextDisplay.setText(displayString);

        Bundle myBundle = receivedIntent.getBundleExtra("studentKey");
        Serializable serialStudent = myBundle.getSerializable("serializableStudentKey");
        String output = "";
        studentArray = (ArrayList<Student>)serialStudent;
        for(Student oneStudent : studentArray){
            output += oneStudent + "\n";
        }
        //editTextDisplay.setText(serialStudent.toString());

        editTextDisplay.setText(output);
    }
        public void sortById(View view){
            String output = "";
            Comparator<Student> compareById = (Student s1,Student s2)->s1.getStudentId().compareTo(s2.getStudentId());
            Collections.sort(studentArray,compareById);
            for(Student oneStudent : studentArray){
                output += oneStudent + "\n";
            }
            editTextDisplay.setText(output);

    }

    public void closeDisplay(View view){
        finish();
    }



    public void doSomeMath(View view){
        //int buttonId = view.getId();
        int selectedOperator = radioGroupOperator.getCheckedRadioButtonId();
        float operand1 = Float.parseFloat(editTextOperand1.getText().toString());
        float operand2 = Float.parseFloat(editTextOperand2.getText().toString());
        float result = 0;
        switch (selectedOperator){
            case R.id.rbtnAdd:
                result = operand1 + operand2;
                break;
            case R.id.rbtnSubtract:
                result = operand1 - operand2;
                break;
            case R.id.rbtnMultiply:
                result = operand1 * operand2;
                break;
            case R.id.rbtnDivide:
                result = operand1 / operand2;
                break;
        }

        Toast toast = Toast.makeText(
                this,
                String.valueOf(result),
                Toast.LENGTH_LONG
        );
        toast.show();

        Intent mathIntent = new Intent(this,CaculateResult.class);
        mathIntent.putExtra("result",result);
        startActivity(mathIntent);

        //finish();
    }
}