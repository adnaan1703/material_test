package com.kryptonapps.kon_el.gchat;


import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etPhone, etNickname;
    private Button bSignIn;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = this;

        etPhone = (EditText) findViewById(R.id.et_phone);
        etNickname = (EditText) findViewById(R.id.et_nickname);
        bSignIn = (Button) findViewById(R.id.button_sign_in);

        bSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone, nickname;
                phone = etPhone.getText().toString().trim();
                nickname = etNickname.getText().toString().trim();

                Toast.makeText(LoginActivity.this, phone + "\n" + nickname, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, ListActivity.class);
                context.startActivity(intent);
            }
        });

    }
}