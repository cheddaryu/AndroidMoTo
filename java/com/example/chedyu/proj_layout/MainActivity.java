package com.example.chedyu.proj_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);
        context = this;
    }

    public void doLoginBtn(View v){
        DialogFragment loginFragment = new LoginDialogFragment();
        loginFragment.show(getFragmentManager(), "login");
    }

    public static class LoginDialogFragment extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new
                    AlertDialog.Builder(getActivity());
            LayoutInflater inflater = getActivity().getLayoutInflater();
            View v = inflater.inflate(R.layout.activity_login, null);
            final EditText etUsername = (EditText)
                    v.findViewById(R.id.user_email);
            final EditText etPassword = (EditText)
                    v.findViewById(R.id.user_pass);
            builder.setView(v)
                    .setPositiveButton(R.string.login, new
                            DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int
                                        id) {
                                    String username, password;
                                    username = etUsername.getText().toString();
                                    password = etPassword.getText().toString();
                                    String msg;
                                    if(username.equalsIgnoreCase("abcd") &&
                                            password.equalsIgnoreCase("1234")){
                                        msg = "Access Granted";
                                    } else {
                                        msg = "Access Denied";
                                    }
                                    Toast.makeText(context, msg,
                                            Toast.LENGTH_SHORT).show();
                                }
                            })
                    .setNegativeButton(R.string.cancel, new
                            DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int
                                        id) {
                                }
                            });
            return builder.create();
        }
    }

    public void doSignUpBtn(View v){
        Intent intent = new Intent(this, SignUpInterface.class);
        startActivity(intent);
    }
}
