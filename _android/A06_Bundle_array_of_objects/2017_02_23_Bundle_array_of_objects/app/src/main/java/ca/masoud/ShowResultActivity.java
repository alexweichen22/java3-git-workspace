package ca.masoud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

import ca.masoud.model.Student;

public class ShowResultActivity extends AppCompatActivity {

    TextView textViewResult;
    ArrayList<Student> listOfStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        initialize();
    }

    private void initialize() {
        textViewResult = findViewById(R.id.textViewStudents);

        Bundle bundle = getIntent().getBundleExtra("intentExtra");
        Serializable bundledListOfStudents = bundle.getSerializable("bundleExtra");

        listOfStudents = (ArrayList<Student>) bundledListOfStudents;

        showListOfStudents(listOfStudents);
    }

    private void showListOfStudents(ArrayList<Student> listOfStudents) {
        String str = "";
        for (Student oneStudent : listOfStudents) {
            str = str + oneStudent;
        }

        textViewResult.setText(str);
    }
}
