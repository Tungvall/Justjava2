package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;
Nu ska allt fungera som det ska. Vad roligt va
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    int coffeePrice = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        displayQuantity(quantity);

    }




    public void decrament(View view) {
        if (quantity == 0) {
            quantity = 0;
        } else {
            quantity = quantity - 1;
        }
        displayQuantity(quantity);
        displayPrice(coffeePrice * quantity);
    }

    public void incrament(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
        displayPrice(quantity * coffeePrice);
    }

    public void submitOrder(View view) {
        int price = quantity * 5;
        String priceMessage = "Total: $" + price;
        priceMessage = priceMessage + "\nThank you!";
        displayMessage(priceMessage);
        calculatePrice;

    }


    /**
     * Method Displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
     }



    /**
     * Method Displays the given price value on the screen.
     */

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * Method Displays the given text on the screen.
     */

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
