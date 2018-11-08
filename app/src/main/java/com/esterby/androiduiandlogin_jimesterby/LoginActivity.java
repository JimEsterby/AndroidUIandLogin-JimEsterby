package com.esterby.androiduiandlogin_jimesterby;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {

    // widgets for this activity
    private ImageView mImageViewVetFlag;
    private Button mButtonLogin;
    private Button mButtonSignup;
    private LinearLayout mLayoutButtons;
    private EditText mEditTextUserID;
    private EditText mEditTextPassword;
    private TextInputLayout mTILayoutUserID;
    private TextInputLayout mTILayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Get widgets from the resource
        mImageViewVetFlag = (ImageView) findViewById(R.id.imageViewVetFlag);
        mButtonLogin = (Button) findViewById(R.id.buttonLogin);
        mButtonSignup = (Button) findViewById(R.id.buttonSignup);
        mLayoutButtons = (LinearLayout) findViewById(R.id.LayoutButtons);
        mEditTextUserID = (EditText) findViewById(R.id.editTextUserID);
        mEditTextPassword = (EditText) findViewById(R.id.editTextPassword);
        mTILayoutUserID = (TextInputLayout) findViewById(R.id.user_id_wrapper);
        mTILayoutPassword = (TextInputLayout) findViewById(R.id.password_wrapper);

        mButtonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUp = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(SignUp);
            }
        });
    }
}
