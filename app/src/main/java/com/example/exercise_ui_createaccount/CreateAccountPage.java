package com.example.exercise_ui_createaccount;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountPage extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account_page);



        final Button emailButton = findViewById(R.id.button);
        final EditText emailEdittext = findViewById(R.id.et_email_address);
        final TextView textviewMessage = findViewById(R.id.textView9);
        final TextView textviewPasswordMessage = findViewById(R.id.textView10);
        final EditText password = findViewById(R.id.password);
        final EditText repeatpassword = findViewById(R.id.repeatpassword);

        emailButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String getText = emailEdittext.getText().toString();
                String getpassword = password.getText().toString();
                String getrepeatpassword = repeatpassword.getText().toString();

                String Expn =
                        "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
                                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
                                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

                if (getText.matches(Expn) && getText.length() > 0) {
                    textviewMessage.setTextColor(Color.rgb(255, 255, 255));
                    textviewMessage.setText("valid email");
                } else {
                    textviewMessage.setTextColor(Color.rgb(255, 0, 0));
                    textviewMessage.setText("invalid email");
                }

                String passwordCriteria = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";

                if (getpassword.matches(passwordCriteria) && getpassword.equals(getrepeatpassword) && getpassword.length() > 0){
                    textviewPasswordMessage.setTextColor(Color.rgb(255, 255, 255));
                    textviewPasswordMessage.setText("Valid Password");

                } else {
                    textviewPasswordMessage.setTextColor(Color.rgb(255, 0, 0));
                    textviewPasswordMessage.setText("Wrong password criteria, Make sure password type!");
                }
            }
        });

    }
}