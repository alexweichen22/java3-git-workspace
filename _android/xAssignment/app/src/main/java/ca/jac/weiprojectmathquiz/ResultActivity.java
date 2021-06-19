package ca.jac.weiprojectmathquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import ca.jac.weiprojectmathquiz.model.Course;

public class ResultActivity extends AppCompatActivity implements
        View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, DialogInterface.OnClickListener{
    ArrayList<Course> coursesArray, coursesArrayLocal;
    ListView listViewResults, listViewResultsLocal;
    ArrayAdapter<Course> coursesAdapter, coursesAdapterLocal;
    Button buttonAdd;

    AlertDialog alertDialog;
    AlertDialog.Builder alertDialog_Builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initialize();
        setAdapterForList();

    }


    private void initialize() {
        Bundle myBundleFromMain = getIntent().getBundleExtra("bundleCourseKey");
        Serializable myListQuestionsFromMain = myBundleFromMain.getSerializable("serializableCourseKey");
        coursesArray = (ArrayList<Course>)myListQuestionsFromMain;

        listViewResults = findViewById(R.id.listViewResults);
        listViewResults.setOnItemClickListener(this);
        listViewResults.setOnItemLongClickListener(this);
    }


    private void setAdapterForList() {
        coursesAdapter =new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                coursesArray);
        listViewResults.setAdapter(coursesAdapter);
    }



    private void toDetails(int i) {
        Bundle itemBundle = new Bundle();
        itemBundle.putSerializable("CourseBundleKey",coursesArray.get(i));
        Intent intentItem = new Intent(this,DetailActivity.class);
        intentItem.putExtra("CourseIntentKey",itemBundle);
        startActivity(intentItem);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                toDetails(position);
        }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        removeItem(position);
        return true;
    }

    private void removeItem(int position) {
        coursesArray.remove(position);
        coursesAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }

    @Override
    public void onClick(View v) {

    }




}