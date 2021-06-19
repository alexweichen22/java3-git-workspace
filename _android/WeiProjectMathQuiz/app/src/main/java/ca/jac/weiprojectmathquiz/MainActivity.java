package ca.jac.weiprojectmathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ca.jac.weiprojectmathquiz.model.Question;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final static int REQUEST_CODE1 = 1;

    TextView textViewTitle, textViewAnswer, textViewQuestion;
    EditText editTextMessage;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonDot, buttonNegative,
            buttonGenerate, buttonValidate, buttonClear,
            buttonScore, buttonMessage, buttonFinish;
    String receivedAnswer_string = "";
    String registerName = "";
    Question question;
    ArrayList<Question> listQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        listQuestions  = new ArrayList<>();
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);
        buttonDot = findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(this);
        buttonNegative = findViewById(R.id.buttonNegative);
        buttonNegative.setOnClickListener(this);
        buttonGenerate = findViewById(R.id.buttonGenerate);
        buttonGenerate.setOnClickListener(this);
        buttonValidate = findViewById(R.id.buttonValidate);
        buttonValidate.setOnClickListener(this);
        buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);
        buttonMessage = findViewById(R.id.buttonMessage);
        buttonMessage.setOnClickListener(this);
        buttonScore = findViewById(R.id.buttonScore);
        buttonScore.setOnClickListener(this);
        buttonFinish = findViewById(R.id.buttonFinish);
        buttonFinish.setOnClickListener(this);
        textViewTitle = findViewById(R.id.textViewTitle);
        textViewQuestion = findViewById(R.id.textViewQuestion);
        textViewAnswer = findViewById(R.id.textViewAnswer);
        editTextMessage = findViewById(R.id.editTextMessage);
        buttonFinish.setBackgroundColor(Color.WHITE);
        buttonFinish.setTextColor(Color.BLACK);
    }

    public void goToResultPage() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("serializableQuestionsKey",listQuestions);
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("bundleQuestionsKey",bundle);
        startActivityForResult(intent,REQUEST_CODE1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode == REQUEST_CODE1){
            if(resultCode == RESULT_OK){
                String receiveData = (String)data.getExtras().getSerializable("registerNameKey");
                textViewTitle.setText(receiveData,TextView.BufferType.EDITABLE);
            }
        }
    }
    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button0:
                    goAnswerTypeInNumber("0");
                    break;
                case R.id.button1:
                    goAnswerTypeInNumber("1");
                    break;
                case R.id.button2:
                    goAnswerTypeInNumber("2");
                    break;
                case R.id.button3:
                    goAnswerTypeInNumber("3");
                    break;
                case R.id.button4:
                    goAnswerTypeInNumber("4");
                    break;
                case R.id.button5:
                    goAnswerTypeInNumber("5");
                    break;
                case R.id.button6:
                    goAnswerTypeInNumber("6");
                    break;
                case R.id.button7:
                    goAnswerTypeInNumber("7");
                    break;
                case R.id.button8:
                    goAnswerTypeInNumber("8");
                    break;
                case R.id.button9:
                    goAnswerTypeInNumber("9");
                    break;
                case R.id.buttonNegative:
                    goAnswerTypeInNegative("-");
                    break;
                case R.id.buttonDot:
                    goAnswerTypeInDot(".");
                    break;
                case R.id.buttonScore:
                    goToResultPage();
                    break;
                case R.id.buttonFinish:
                    finish();
                    break;
                case R.id.buttonGenerate:
                    generateQuestion();
                    break;
                case R.id.buttonValidate:
                    validateAnswer();
                    break;
                case R.id.buttonClear:
                    goClear();
                    break;
                case R.id.buttonMessage:
                    clearMessage();
                    break;
            }
    }

    private void goAnswerTypeInNumber(String num) {
        if (!receivedAnswer_string.contains(".")) {
            receivedAnswer_string += num;
            textViewAnswer.setText(receivedAnswer_string,TextView.BufferType.EDITABLE);
        } else if (receivedAnswer_string.indexOf('.') == (receivedAnswer_string.length() - 1)) {
            receivedAnswer_string += num;
            textViewAnswer.setText(receivedAnswer_string,TextView.BufferType.EDITABLE);
        }else{
            editTextMessage.setText("ERROR:\nDecimal Digit", TextView.BufferType.EDITABLE);
        }
    }

    private void goAnswerTypeInNegative(String signNegative){
        if(receivedAnswer_string.equals("")){
        receivedAnswer_string += signNegative;
        textViewAnswer.setText(receivedAnswer_string, TextView.BufferType.EDITABLE);
        }
        else{
            editTextMessage.setText("ERROR:\nNegative Sign", TextView.BufferType.EDITABLE);
        }
    }

    private void goAnswerTypeInDot(String dot){
        if(receivedAnswer_string.equals("")){
            editTextMessage.setText("ERROR:\nDecimal Point", TextView.BufferType.EDITABLE);
        }
        else if(!receivedAnswer_string.contains(".")){
        receivedAnswer_string += dot;
        textViewAnswer.setText(receivedAnswer_string, TextView.BufferType.EDITABLE);
        }
        else{
            editTextMessage.setText("ERROR:\nDecimal Point", TextView.BufferType.EDITABLE);
        }
    }
    private void goClear() {
        receivedAnswer_string = "";
        textViewAnswer.setText(receivedAnswer_string,TextView.BufferType.EDITABLE);
    }

    private void clearMessage() {
        editTextMessage.setText("MESSAGE:\nNone",TextView.BufferType.EDITABLE);
    }

    private void validateAnswer() {
        try {
        question.setAnswer_string(textViewAnswer.getText().toString());
        editTextMessage.setVisibility(View.VISIBLE);
        String output = "The Standard Answer is: "+question.getSystemAnswer_string() + "\n"
                        + "Your Answer is: " + textViewAnswer.getText().toString() + "\n"
                        + (question.getIsAnswerCorrect()?"<CORRECT>":"<WRONG>");
        editTextMessage.setText(output,TextView.BufferType.EDITABLE);
            listQuestions.add(question);
        }
        catch(Exception exc){
            editTextMessage.setText("ERROR:\nValidation Error", TextView.BufferType.EDITABLE);
        }
    }

    private void generateQuestion() {
        try{
            question = new Question();
            textViewQuestion.setText(question.toStringWithoutAnswer());
        }
        catch(Exception exc){
            textViewQuestion.setText("Error Calling Question class:\n" + exc.getMessage());
        }
        editTextMessage.setText("MESSAGE:\nNew Question!",TextView.BufferType.EDITABLE);
        goClear();
    }
}