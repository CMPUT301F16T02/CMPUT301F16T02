package com.ubertapp.Activities;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.ubertapp.R;


/**
 * The initial Opening Page of the ubertapp app.
 */
public class ActivityOpeningPage extends Activity {

    private Button signinButton;
    private Button getStartedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_page);

        signinButton = (Button) findViewById(R.id.signin_button);
        getStartedButton = (Button) findViewById(R.id.getstarted_button);

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(ActivityOpeningPage.this, nextActivity);
//                ActivityOpeningPage.this.startActivity(nextActivity);
            }
        });

        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(ActivityOpeningPage.this, nextActivity);
//                ActivityOpeningPage.this.startActivity(nextActivity);

            }
        });
    }
}