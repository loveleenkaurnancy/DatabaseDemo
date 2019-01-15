package com.kitkatstudio.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.kitkatstudio.databasedemo.database.DatabaseQueries;

public class MainActivity extends AppCompatActivity {

    EditText name, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void register(View view)
    {
        String name1 = name.getText().toString();
        String email1 = email.getText().toString();
        String password1 = password.getText().toString();

        DatabaseQueries db = new DatabaseQueries(this);
        db.addData(name1, email1, password1);
    }
}
