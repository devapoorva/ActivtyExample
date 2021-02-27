package com.apoorv.activtyexample.ui.login;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.apoorv.activtyexample.R;

/**
 * Created by Apoorv Vardhman on 2/27/2021
 *
 * @Email :  apoorv.vardhman@gmail.com
 * @Author :  Apoorv Vardhman (developerapoorv.xyz)
 * @Linkedin :  https://in.linkedin.com/in/apoorv-vardhman
 * @Skype :  apoorv.vardhman
 * Contact :  +91 8434014444
 */
public class LoginActivity extends AppCompatActivity {
    String mobile,password;
    EditText edtMobile,edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        edtMobile = findViewById(R.id.edt_mobile);
        edtPassword = findViewById(R.id.edt_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mobile = edtMobile.getText().toString().trim();
                password = edtPassword.getText().toString();
                /*validate*/
                if(mobile.isEmpty())
                {
                    showToast("Please Enter Mobile Number");
                }
                else if(mobile.length()!=10 || !Patterns.PHONE.matcher(mobile).matches())
                {
                    showToast("Please Enter valid Mobile Number");
                }
                else if(password.isEmpty())
                {
                    showToast("Please Enter password");
                }
                else if(password.length()<6)
                {
                    showToast("Password should be minimum 6 Character");
                }
                else
                {
                    showToast(mobile+"\n"+password);
                }
            }
        });

    }

    private void showToast(String data)
    {
        Toast.makeText(LoginActivity.this,data,Toast.LENGTH_SHORT).show();
    }
}
