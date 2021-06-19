package ca.jac.weiprojectmathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

import ca.jac.weiprojectmathquiz.model.Course;

public class DetailActivity extends AppCompatActivity {
    EditText editTextMultiLine, editTextTeacher;
    Button buttonGoBack, buttonModify;
    Course courseReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initialize();
        getMyIntent();
        setEditTextDisplay();
    }

    private void initialize() {
        editTextMultiLine = findViewById(R.id.editTextTextMultiLine);
        editTextTeacher = findViewById(R.id.editTextTeacher);
        buttonGoBack = findViewById(R.id.buttonGoBack);
        buttonModify = findViewById(R.id.buttonModify);
    }

    private void getMyIntent() {
        Bundle myReceivedBundle = getIntent().getBundleExtra("CourseIntentKey");
        Serializable serialCourseItem = myReceivedBundle.getSerializable("CourseBundleKey");
        courseReceived = (Course)serialCourseItem;
    }
    private void setEditTextDisplay() {
        editTextMultiLine.setText(courseReceived.toString(), TextView.BufferType.EDITABLE);
        editTextTeacher.setText(courseReceived.getTeacherName());
    }

    public void goBack(View view) {
       goBackToResultPage();
    }

    public void goBackToResultPage(){
        Intent intent = new Intent(DetailActivity.this,ResultActivity.class);
        startActivity(intent);
    }
    public void modifyCourse(View view) {
        courseReceived.setTeacherName(editTextTeacher.getText().toString());
        setEditTextDisplay();
    }
}