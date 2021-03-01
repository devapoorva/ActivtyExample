package com.apoorv.activtyexample.ui.shared_preference;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.apoorv.activtyexample.R;

/**
 * Created by Apoorv Vardhman on 3/1/2021
 *
 * @Email :  apoorv.vardhman@gmail.com
 * @Author :  Apoorv Vardhman (developerapoorv.xyz)
 * @Linkedin :  https://in.linkedin.com/in/apoorv-vardhman
 * @Skype :  apoorv.vardhman
 * Contact :  +91 8434014444
 */
public class SharedPreferenceActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);

        editText = findViewById(R.id.edt_data);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        editText.setText(name);
    }
}
