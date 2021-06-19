package ca.jac.weiprojectmathquiz.model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Random;

public class Question implements Serializable {
    int operatorFromEnum_int;
    String operator_string;

    String operand1_string;
    int operand1_int;
    float operand1_float;

    String operand2_string;
    int operand2_int;
    float operand2_float;

    String systemAnswer_string;
    int systemAnswer_int;
    float systemAnswer_float;

    String answer_string;
    int answer_int;
    float answer_float;

    boolean isAnswerCorrect;

    public Question(){
        setOperand1();
        setOperator();
        setOperand2();
        doCalculate();
    }

    public boolean getIsAnswerCorrect(){
        return isAnswerCorrect;
    }

    public String getAnswer_string(){
        return answer_string;
    }
    public void setAnswer_string(String s){
            if(!s.contains(".")){
                this.answer_string = s;
                this.answer_float = roundFloat(Float.parseFloat(s+".0"),1);
                this.answer_int = Integer.parseInt(s);
            }else{
                this.answer_string = s;
                this.answer_float = roundFloat(Float.parseFloat(s),1);
                this.answer_int = Math.round(answer_float);
            }
            answerChecking();
    }

    // round float to x digits of decimal
    private static float roundFloat (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (float) Math.round(value * scale) / scale;
    }

    private void answerChecking() {
        if(operatorFromEnum_int==3){
            if(systemAnswer_float==answer_float){
                isAnswerCorrect=true;
            }else {
                isAnswerCorrect=false;
            }
        }else{
            if(systemAnswer_string.equals(answer_string)||systemAnswer_float==answer_float||systemAnswer_int==answer_int){
                isAnswerCorrect=true;
            }else {
                isAnswerCorrect=false;
            }
        }
    }

    private void setOperand1() {
        operand1_int = new Random().nextInt(10);
        operand1_string = String.valueOf(operand1_int);
        operand1_float = Float.parseFloat(operand1_string);
    }

    private void setOperator() {
        operatorFromEnum_int = new Random().nextInt(Operator.values().length);
        switch(operatorFromEnum_int){
            case 0:
                operator_string = "+";
                break;
            case 1:
                operator_string = "-";
                break;
            case 2:
                operator_string = "X";
                break;
            case 3:
                operator_string = "/";
                break;
        }
    }

    private void setOperand2() {
        if(operatorFromEnum_int != 3){
            operand2_int = new Random().nextInt(10);
        }else{
            operand2_int = 1 + (new Random().nextInt(9));
        }
        operand2_string = String.valueOf(operand2_int);
        operand2_float = Float.parseFloat(operand2_string);
    }

    private void doCalculate() {
        switch(operatorFromEnum_int){
            case 0:
                doAdd();
                break;
            case 1:
                doSubtract();
                break;
            case 2:
                doMultiply();
                break;
            case 3:
                doDivide();
                break;
        }
    }

    private void doAdd() {
        systemAnswer_int = operand1_int + operand2_int;
        typeConversionIntToFloat();
    }

    private void doSubtract() {
        systemAnswer_int = operand1_int - operand2_int;
        typeConversionIntToFloat();
    }

    private void doMultiply() {
       systemAnswer_int = operand1_int * operand2_int;
       typeConversionIntToFloat();
    }

    private void doDivide() {
        systemAnswer_float = roundFloat((float)operand1_int / (float)operand2_int,1);
        typeConversionFloatToInt();
    }

    private void typeConversionIntToFloat() {
        systemAnswer_string = String.valueOf(systemAnswer_int);
        systemAnswer_float = Float.parseFloat(systemAnswer_string);
    }

    private void typeConversionFloatToInt() {
        systemAnswer_string = String.valueOf(systemAnswer_float);
        systemAnswer_int = (int)systemAnswer_float;
    }

    public String getOperator_string() {
        return operator_string;
    }

    public int getOperatorFromEnum_int() {
        return operatorFromEnum_int;
    }

    public String getOperand1_string() {
        return operand1_string;
    }

    public String getOperand2_string(){
        return operand2_string;
    }

    public String getSystemAnswer_string(){
        return systemAnswer_string;
    }

    public String[] toStringArray(){
        String[] outputStringArray = {operand1_string,operand2_string,operator_string,systemAnswer_string};
        return outputStringArray;
    }

    public String toStringWithoutAnswer(){
        String outputWithoutAnswer = operand1_string + " " + operator_string + " " + operand2_string + " = ?"
                                        +"\n(integer / 1 digit decimal)";
        return outputWithoutAnswer;
    }

    public String toStringWithAnswer(){
        String outputQuestionWithAnswer = operand1_string + " " + operator_string + " " + operand2_string + " = " + systemAnswer_string;
        return outputQuestionWithAnswer;
    }

    @Override
    public String toString(){
        String result = this.operand1_string + this.operator_string + this.operand2_string + "=" + this.systemAnswer_string
                    + " (Your answer: " + this.answer_string + (isAnswerCorrect? ") - Right":") - Wrong");
        return result;
    }
}