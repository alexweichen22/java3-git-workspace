package ca.jac.wei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;

import ca.jac.wei.model.Account;
import ca.jac.wei.model.Customer;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{
    Customer customer;
    ArrayList<Customer> receivedCustomersArray;
    Button buttonAdd, buttonFind,buttonRemove,buttonUpdate,buttonSave,buttonLoad,buttonClear,buttonShowAll;
    EditText editTextAccountNumber,editTextOpenDate,editTextBalance,editTextFirstName,editTextFamilyName,editTextPhoneNumber,editTextSinNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initialize();
        getMainIntent();
        displayData();
    }

    private void getMainIntent() {
        Intent receivedDetailIntent = getIntent();
        Bundle receivedDetailBundle = receivedDetailIntent.getBundleExtra("bundleDetailKey");
        Serializable serialCustomer = receivedDetailBundle.getSerializable("customersDetailArray");
        int receivedInt = receivedDetailBundle.getInt("chosenItemNumber");
       //
        customer = ((ArrayList<Customer>) serialCustomer).get(receivedInt);

    }

    private void displayData() {
        editTextAccountNumber.setText(customer.getAccount().getAccountNumber());
        editTextOpenDate.setText(customer.getAccount().getOpenDate());
        editTextBalance.setText(String.valueOf(customer.getAccount().getBalance()));
        editTextFirstName.setText(customer.getFirstName());
        editTextFamilyName.setText(customer.getFamilyName());
        editTextPhoneNumber.setText(customer.getPhoneNumber());
        editTextSinNumber.setText(customer.getSinNumber());
    }

    private void initialize() {
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(this);
        buttonFind = findViewById(R.id.buttonFind);
        buttonFind.setOnClickListener(this);
        buttonRemove = findViewById(R.id.buttonRemove);
        buttonRemove.setOnClickListener(this);
        buttonUpdate = findViewById(R.id.buttonUpdate);
        buttonUpdate.setOnClickListener(this);
        buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(this);
        buttonLoad = findViewById(R.id.buttonLoad);
        buttonLoad.setOnClickListener(this);
        buttonClear = findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);
        buttonShowAll = findViewById(R.id.buttonShowAll);
        buttonShowAll.setOnClickListener(this);
        editTextAccountNumber = findViewById(R.id.editTextAccountNumber);
        editTextOpenDate = findViewById(R.id.editTextOpenDate);
        editTextBalance = findViewById(R.id.editTextBalance);
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextFamilyName = findViewById(R.id.editTextFamilyName);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        editTextSinNumber = findViewById(R.id.editTextSinNumber);

    }



    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonAdd:
                goAdd();
                break;
            case R.id.buttonShowAll:
                goShowAll();
                break;
            case R.id.buttonClear:
                goClear();
                break;
            case R.id.buttonUpdate:
                goUpdate();
                break;

        }

    }

    private void goUpdate() {
        customer.setFamilyName(editTextFamilyName.getText().toString());
        customer.setFirstName(editTextFirstName.getText().toString());
        customer.setPhoneNumber(editTextPhoneNumber.getText().toString());
        customer.setSinNumber(editTextSinNumber.getText().toString());
        customer.getAccount().setBalance(Float.parseFloat(editTextBalance.getText().toString()));
        customer.getAccount().setOpenDate(editTextOpenDate.getText().toString());

    }

    private void goClear() {
        editTextSinNumber.setText("");
        editTextPhoneNumber.setText("");
        editTextFamilyName.setText("");
        editTextAccountNumber.setText("");
        editTextFamilyName.setText("");
        editTextBalance.setText("");
        editTextOpenDate.setText("");
    }

    private void goShowAll() {
        Intent intent = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(intent);
    }

    private void goAdd() {
    }
}