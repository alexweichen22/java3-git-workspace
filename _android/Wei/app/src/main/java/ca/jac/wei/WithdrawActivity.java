package ca.jac.wei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

import ca.jac.wei.model.Account;
import ca.jac.wei.model.Customer;

public class WithdrawActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textViewLabelBalance, textViewBalance;
    EditText editTextWithdrawAmount;
    Button buttonWithdraw;
    Account account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);
        initialize();
        getDataFromMain();
        displayData();
    }

    private void initialize() {
        textViewBalance = findViewById(R.id.textViewBalance);
        editTextWithdrawAmount = findViewById(R.id.editTextWithdrawAmount);
        buttonWithdraw = findViewById(R.id.buttonWithdraw);
        buttonWithdraw.setOnClickListener(this);
    }

    private void getDataFromMain() {
        Intent receivedWithdrawIntent = getIntent();
        Bundle receivedWithdrawBundle = receivedWithdrawIntent.getBundleExtra("bundleWithdrawKey");
        Serializable serialAccount = receivedWithdrawBundle.getSerializable("accountWithdrawKey");
        account = (Account) serialAccount;
    }

    private void displayData() {
        textViewBalance.setText(String.valueOf(account.getBalance()), TextView.BufferType.EDITABLE);
    }
    @Override
    public void onClick(View v) {
        proceedWithdraw();
    }

    private void proceedWithdraw() {
        try{
            if(Float.parseFloat(editTextWithdrawAmount.getText().toString()) > account.getBalance())
            {
                Toast toast = Toast.makeText(
                        this,
                        "Something wrong",
                        Toast.LENGTH_LONG
                );
                toast.show();
            }else{
                float balanceAfterWithdraw = account.getBalance() -Float.parseFloat(editTextWithdrawAmount.getText().toString());
                account.setBalance(balanceAfterWithdraw);
                displayData();
            }
        }catch(Exception exc){
            Toast toast = Toast.makeText(
                    this,
                    "Something wrong",
                    Toast.LENGTH_LONG
            );
            toast.show();
        }
    }
}