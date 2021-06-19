package ca.jac.weiprojectmathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;

import ca.jac.weiprojectmathquiz.model.Question;

public class ResultActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ArrayList<Question> questionsArray;
    ArrayList<Question> questionsArrayRight = new ArrayList<>();
    ArrayList<Question> questionsArrayWrong = new ArrayList<>();
    ArrayList<Question> questionsArraySortAsc = new ArrayList<>();
    ArrayList<Question> questionsArraySortDesc = new ArrayList<>();
    TextView textViewTitleResult, textViewScore;
    Spinner spinnerResultOption;
    ListView listViewResults;
    EditText editTextRegister;
    String[] listAnswerOptions = {"All","Right", "Wrong", "All-Sorted-Asc", "All-Sorted-Desc"};
    ArrayAdapter<String> answerAdapter;
    ArrayAdapter<Question> questionsAdapter;
    ArrayAdapter<Question> questionsAdapterRight;
    ArrayAdapter<Question> questionsAdapterWrong;
    ArrayAdapter<Question> questionsAdapterSortAsc;
    ArrayAdapter<Question> questionsAdapterSortDesc;
    Button buttonGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initialize();
        showScore();
    }

    private void initialize() {
        Bundle myBundleFromMain = getIntent().getBundleExtra("bundleQuestionsKey");
        Serializable myListQuestionsFromMain = myBundleFromMain.getSerializable("serializableQuestionsKey");
        questionsArray = (ArrayList<Question>)myListQuestionsFromMain;
        textViewTitleResult = findViewById(R.id.textViewTitleResult);
        textViewScore = findViewById(R.id.textViewScore);
        listViewResults = findViewById(R.id.listViewResults);
        editTextRegister = findViewById(R.id.editTextRegister);
        buttonGoBack = findViewById(R.id.buttonGoBack);
        spinnerResultOption = findViewById(R.id.spinnerResultOption);
        spinnerResultOption.setOnItemSelectedListener(this);
        answerAdapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                listAnswerOptions
        );
        spinnerResultOption.setAdapter(answerAdapter);
        setDefaultListViewAdapter();
        setAdaptersRightAndWrong();
    }

    private void setDefaultListViewAdapter() {
        // setup listview for All (default)
        questionsAdapter =new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                questionsArray);
        listViewResults.setAdapter(questionsAdapter);
    }

    private void setAdaptersRightAndWrong() {
        // set listview adapters for right and wrong questions
        for(Question question : questionsArray){
            if(question.getIsAnswerCorrect()){
                questionsArrayRight.add(question);
            }else{
                questionsArrayWrong.add(question);
            }
        }
        questionsAdapterRight =new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                questionsArrayRight);

        questionsAdapterWrong =new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                questionsArrayWrong);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:
                showAll();
                break;
            case 1:
                showRight();
                break;
            case 2:
                showWrong();
                break;
            case 3:
                showAllAsc();
                break;
            case 4:
                showAllDesc();
                break;
        }
    }

    // round float to x digits of decimal
    private static float roundFloat (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (float) Math.round(value * scale) / scale;
    }

    private void showScore() {
        int countRight = 0;
        for(Question question : questionsArray){
            if(question.getIsAnswerCorrect()){countRight++;}
        }
        float scorePercent = roundFloat(100.0f* (float)countRight / (float)questionsArray.size(),1);
        textViewScore.setText(String.valueOf(scorePercent) + "%", TextView.BufferType.EDITABLE );
    }

    private void showAll() {
        listViewResults.setAdapter(questionsAdapter);
    }

    private void showRight() {
        listViewResults.setAdapter(questionsAdapterRight);
    }

    private void showWrong() {
        listViewResults.setAdapter(questionsAdapterWrong);
    }

    private void showAllAsc() {
        questionsArraySortAsc.addAll(questionsArrayRight);
        questionsArraySortAsc.addAll(questionsArrayWrong);
        questionsAdapterSortAsc = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                questionsArraySortAsc
        );
        listViewResults.setAdapter(questionsAdapterSortAsc);
    }
    private void showAllDesc() {
        questionsArraySortDesc.addAll(questionsArrayWrong);
        questionsArraySortDesc.addAll(questionsArrayRight);
        questionsAdapterSortDesc = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                questionsArraySortDesc
        );
        listViewResults.setAdapter(questionsAdapterSortDesc);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }

    public void goToMainPage(View view){
        Intent intent = new Intent();
        intent.putExtra("registerNameKey",editTextRegister.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}