package ca.jac.a05a_studentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText editText1, editText2,editText3;
    Button btnAddStudent, btnDeleteAllStudent, btnShowAllStudent, btnEditStudent;
    List<Student> listStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }
    private void initialize(){
        listStudents = new ArrayList<Student>();
        
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        btnAddStudent=findViewById(R.id.btnAddStudent);
            btnAddStudent.setOnClickListener(this);
        btnDeleteAllStudent=findViewById(R.id.btnDeleteAllStudent);
            btnDeleteAllStudent.setOnClickListener(this);
        btnEditStudent=findViewById(R.id.btnEditStudent);
            btnEditStudent.setOnClickListener(this);
        btnShowAllStudent=findViewById(R.id.btnShowAllStudent);
            btnShowAllStudent.setOnClickListener(this);
    }

    public void displayStuInfo(View view) {
        String editText1_string = editText1.getText().toString();
        String editText2_string = editText2.getText().toString();
        String editText3_string = editText3.getText().toString();

        String outputString = "----The Student Info----\n\n" +
                                "Student Id: " + editText1_string + "\n" +
                                "      Name: " + editText2_string + "\n" +
                                "       Age: " + editText3_string;

        Student student = new Student(editText1_string,editText2_string,editText3_string);
        Student student1 = new Student(editText1_string,editText2_string,editText3_string);
        Student student2 = new Student("12399","John", "25");

        listStudents.add(student);
        listStudents.add(student1);
        listStudents.add(student2);

        //        Toast toast;
        //        {
        //            toast = Toast.makeText(
        //                    this,
        //                    student.toString(),
        //                    Toast.LENGTH_LONG
        //            );
        //        }
        //
        //        toast.show();


        Intent myIntent = new Intent(this,DisplayPage.class);
        myIntent.putExtra("outputString",outputString);

        Bundle bundle = new Bundle();
        bundle.putSerializable("serializableStudentKey", (Serializable) listStudents);
        myIntent.putExtra("studentKey",bundle);

        startActivity(myIntent);


    }
    
    

    public void finish(View view){
        finish();
    }
    
    @Override
    public void onClick(View viewOnClick){
        switch(viewOnClick.getId()){
            case R.id.btnAddStudent:
                addStudent();
                break;
            case R.id.btnEditStudent:
                editStudent();
                break;
            case R.id.btnDeleteAllStudent:
                deleteAllStudent();
                break;
            case R.id.btnShowAllStudent:
                showAllStudent();
                break;
        }
    }

    private void showAllStudent() {
        passIntent();
    }

    private void deleteAllStudent() {
        listStudents.clear();
        passIntent();

    }

    private void editStudent() {
        String editText1_string = editText1.getText().toString();
        String editText2_string = editText2.getText().toString();
        String editText3_string = editText3.getText().toString();


        for (int i=0;i<listStudents.size();i++) {
            if(listStudents.get(i).studentId.equals(editText1_string)){
                listStudents.set(i, new Student(editText1_string,editText2_string,editText3_string));
            }
        }
        passIntent();
    }

    private void addStudent() {
        String editText1_string = editText1.getText().toString();
        String editText2_string = editText2.getText().toString();
        String editText3_string = editText3.getText().toString();

        int count=0;
        for (Student listStudent : listStudents) {
            if(!listStudent.studentId.equals(editText1_string))count++;
        }
        if(count==listStudents.size()){
        Student student = new Student(editText1_string,editText2_string,editText3_string);
        listStudents.add(student);
        passIntent();
        };

    }

    public void passIntent(){
        Intent myIntent = new Intent(this,DisplayPage.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("serializableStudentKey", (Serializable) listStudents);
        myIntent.putExtra("studentKey",bundle);

        startActivity(myIntent);

    }
}