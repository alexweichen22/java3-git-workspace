package ca.jac.wei;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

import ca.jac.wei.model.Customer;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {
    ListView listViewMain;
    ArrayList<Customer> customersArray;
    ArrayAdapter<Customer> customersAdapter;
    Button buttonAddNewCustomer;
    int chosenItemNumber = 9999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        listViewMain = findViewById(R.id.listViewMain);
        listViewMain.setOnItemClickListener(this);
        listViewMain.setOnItemLongClickListener(this);
        buttonAddNewCustomer = findViewById(R.id.buttonAddNewCustomer);
        customersArray = new ArrayList<>();
        Customer customer1 = new Customer("Adam","Greg","5141001111","1","20200101","100.00");
        Customer customer2 = new Customer("Bob","Avrith","5141002222","2","20200202","200.00");
        Customer customer3 = new Customer("Carol","Steven","5141003333","3","20200303","300.00");
        customersArray.add(customer1);
        customersArray.add(customer2);
        customersArray.add(customer3);
        customersAdapter = new ArrayAdapter<Customer>(this,
                android.R.layout.simple_list_item_1,
                customersArray);
        sortCustomersByFamilyName();
        listViewMain.setAdapter(customersAdapter);

    }

    private void sortCustomersByFamilyName() {
        Collections.sort(customersArray);
        customersAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        chosenItemNumber = position;
        proceedPassingIntentToDetailPage();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundleWithdraw = new Bundle();
        bundleWithdraw.putSerializable("accountWithdrawKey",customersArray.get(position).getAccount());
        Intent intentWithdraw = new Intent(MainActivity.this, WithdrawActivity.class);
        intentWithdraw.putExtra("bundleWithdrawKey",bundleWithdraw);
        startActivity(intentWithdraw);
        return false;
    }

    public void passIntentToDetailPage(View v){
        proceedPassingIntentToDetailPage();
    }

    private void proceedPassingIntentToDetailPage() {
            Bundle bundleDetail = new Bundle();
            bundleDetail.putSerializable("customersDetailArray",customersArray);
            Intent intentDetail = new Intent(MainActivity.this, DetailActivity.class);
            intentDetail.putExtra("chosenItemNumber", chosenItemNumber);
            intentDetail.putExtra("bundleDetailKey", bundleDetail);
            startActivity(intentDetail);
    }

    public void addNewCustomer(View view) {
        Bundle bundleToAddPage = new Bundle();
        bundleToAddPage.putSerializable("customersArrayKey",customersArray);
        Intent intentToAdd= new Intent(MainActivity.this, DetailActivity.class);
        intentToAdd.putExtra("bundleToAddKey", bundleToAddPage);
        startActivity(intentToAdd);
    }
}