package com.penafort.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity=0;
    String priceMessage="Free";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {        
        String priceMessage=createOrderSummary("Luis Penafort",quantity);
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = getQuantityTV();
        quantityTextView.setText(String.valueOf(number));
    }
    /**
    *This methods retrieves the view that will display the total price
     */
    private void displayPrice(int number){
        String price="$"+String.valueOf(number);
        TextView orderSummaryTextView=findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(price);
    }
    /**
     * This method will increment the counter and update the quantity being displayed
     */
    public void increment(View view){
        quantity+=1;
        display(quantity);
    }
    /**
     * This method will decrement the counter and update the quantity being displayed
     */
    public void decrement(View view){
        quantity-=1;
        display(quantity);
    }
    public TextView getQuantityTV(){
        return findViewById(R.id.quantity_value);
    }
    private int getQuanity(){
        TextView quantityTV=getQuantityTV();
        return Integer.parseInt(quantityTV.getText().toString());
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_value);
        priceTextView.setText(message);
    }
    
    private void createOrderSummary(String name, int quantity){
        return String.format("Name: %s\nQuantity: %s\nTotal: %s\nThank you!",name,quantity,quantity*5);
}
