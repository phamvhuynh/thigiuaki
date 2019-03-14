package com.example.thuongle.thigiuaki_phamvanhuynh_1706020034_11thc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edtUserName;
    EditText edtPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onInit();
        btnLogin.setOnClickListener(this);
    }
        public void onLogin(){
            if (onValidateForm()){
                if (edtUserName.getText().toString().equals("phamhuynh") && edtPassword.getText().toString().equals("1706020034")){
                    Toast.makeText(MainActivity.this,"Login Success!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,ViewActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"Login Fail!",Toast.LENGTH_LONG).show();
                }
            }
        }
    private boolean onValidateForm() {
        if(edtUserName.getText().toString().length() < 1){
            edtUserName.setError("Please fill username");
            return false;
        }
        if(edtPassword.getText().toString().length() < 1){
            edtPassword.setError("Please fill username");
            return false;
        }
        return  true;
    }
    private void onInit() {
        edtUserName = findViewById(R.id.main_edtUserName);
        edtPassword = findViewById(R.id.main_edtPassword);
        btnLogin = findViewById(R.id.main_btnLogin);
    }
    public void onClick(View view) {
        int i = 1;
        switch (view.getId()) {
            case R.id.main_btnLogin:
                onLogin();
        }
    }
}
