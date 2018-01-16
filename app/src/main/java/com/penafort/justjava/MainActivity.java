package com.penafort.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int quantity=2;
        display(quantity);
        displayPrice(quantity*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_value);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number){
        TextView priceTextView=(TextView)findViewById(R.id.price_value);
        priceTextView.setText(number);
    }
}
