package ca.masoud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

import ca.masoud.model.Student;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextStudentID, editTextName, editTextAge;
    Button btnClear, btnAdd, btnRemove, btnShowAll;

    ArrayList<Student> listOfStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {

        listOfStudents = new ArrayList<>();

        editTextStudentID = findViewById(R.id.editTextStudentID);
        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);

        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnRemove = findViewById(R.id.btnRemove);
        btnRemove.setOnClickListener(this);

        btnShowAll = findViewById(R.id.btnShowAll);
        btnShowAll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnClear:
                clearEditText();
                break;
            case R.id.btnAdd:
                addToArrayList();
                break;
            case R.id.btnRemove:
                processRemove();
                break;
            case R.id.btnShowAll:
                processShowAll();
                break;
        }
    }

    private void clearEditText() {
        editTextStudentID.setText(null);
        editTextName.setText(null);
        editTextAge.setText(null);
    }

    private void addToArrayList() {

        int studentId = Integer.parseInt(editTextStudentID.getText().toString());
        String name = editTextName.getText().toString();
        int age = Integer.parseInt(editTextAge.getText().toString());

        Student student = new Student(studentId, name, age);
        listOfStudents.add(student);

        Toast.makeText(this,
                student.getName() +
                        " added successfully. Array size: " +
                        listOfStudents.size(),
                Toast.LENGTH_SHORT).show();

        clearEditText();
    }

    private void processRemove() {

        int studentID = Integer.parseInt(editTextStudentID.getText().toString());

        boolean find = false;
        Iterator<Student> iterator = listOfStudents.iterator();

        while (!find && iterator.hasNext()) {
            Student oneStudent = iterator.next();
            if (oneStudent.getStudentID() == studentID) {
                iterator.remove();
                find = true;
            }
        }

        if (find)
            Toast.makeText(this, "The student with the id: " +
                            studentID + " is deleted successfully",
                    Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "The student with the id: " +
                            studentID + " does not exist.",
                    Toast.LENGTH_LONG).show();
    }

    private void processShowAll() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("bundleExtra", listOfStudents);

        Intent intent = new Intent(this, ShowResultActivity.class);
        intent.putExtra("intentExtra", bundle);
        startActivity(intent);
    }
}