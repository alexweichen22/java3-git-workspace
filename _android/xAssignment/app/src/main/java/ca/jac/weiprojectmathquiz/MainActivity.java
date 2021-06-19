package ca.jac.weiprojectmathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

import ca.jac.weiprojectmathquiz.model.Course;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener{
    final static int REQUEST_CODE1 = 1;

    Button buttonPassIntent;
    Course course;
    ArrayList<Course> listCourses;
    ArrayAdapter<Course> coursesAdapterMain;
    ListView listViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {

        listCourses = new ArrayList<>();
        buttonPassIntent = findViewById(R.id.buttonPassIntent);
        Course course1 = new Course((new Random()).nextInt(1000), "HTML","Adam", "IPD-11");
        Course course2 = new Course((new Random()).nextInt(1000), "CSS","Bob", "IPD-12");
        Course course3 = new Course((new Random()).nextInt(1000), "JAVASCRIPT","Carol", "IPD-13");
        Course course4 = new Course((new Random()).nextInt(1000), "JAVA","Donia", "IPD-14");
        listCourses.add(course1);
        listCourses.add(course2);
        listCourses.add(course3);
        listCourses.add(course4);

        listViewMain = findViewById(R.id.listViewMain);
        listViewMain.setOnItemLongClickListener(this);
        listViewMain.setOnItemClickListener(this);

        coursesAdapterMain =new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listCourses);
        listViewMain.setAdapter(coursesAdapterMain);



    }



    public void passIntent(View view) {

        Bundle bundle = new Bundle();
        bundle.putSerializable("serializableCourseKey", listCourses);

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("bundleCourseKey",bundle);

        startActivityForResult(intent,REQUEST_CODE1);
    }


    public void addCourse(){
        Course courseToAdd = new Course((new Random()).nextInt(1000), "PHP", "Edward", "IPD-25");
        listCourses.add(courseToAdd);
        coursesAdapterMain.notifyDataSetInvalidated();
        listViewMain.setAdapter(coursesAdapterMain);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        return false;
    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}