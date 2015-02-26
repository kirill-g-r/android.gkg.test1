package com.example.gkg.app1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.gkg.objects.LoginInfo;

public class MainActivity extends ActionBarActivity {

    public static final String LOGIN_INFO = "com.example.gkg.login_info";

    private TextView txtLogin;
    private TextView txtPassword;

    private Button btnLogin;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.button_login);
        btnClear = (Button)findViewById(R.id.button_clear);

        txtLogin = (TextView)findViewById(R.id.txtResult);
        txtPassword = (TextView)findViewById(R.id.txtPassword);

        btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                txtLogin.setText("");
                txtPassword.setText("");

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    txtLogin.setText(txtPassword.getText());
                //btnLogin.setBackgroundColor(R.color.button_material_dark);
               // txtPassword.setText("");


                if (v == btnLogin) {

                    LoginInfo loginInfo = new LoginInfo();
                    loginInfo.setLogin(txtLogin.getText().toString());
                    loginInfo.setPassword(txtPassword.getText().toString());

                    Intent resultIntent = new Intent(MainActivity.this, Result.class );
                    resultIntent.putExtra(LOGIN_INFO, loginInfo);
                    startActivity(resultIntent);
                }
                else if (v == btnClear) {

                    txtLogin.setText("");
                    txtPassword.setText("");

                }

            }
        });

    }

    public void buttonClick(View view) {

        if (view == btnLogin) {

            txtLogin.setText("");

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
