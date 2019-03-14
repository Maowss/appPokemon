package br.com.etecia.appempresaabc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.IllegalFormatCodePointException;

public class LoginActivity extends AppCompatActivity {


    EditText txtUsuario, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        txtUsuario = (EditText) findViewById(R.id.edtLogin);
        txtSenha = (EditText) findViewById(R.id.edtSenha);

    }

    public void sairApp(View view) {
        finish();
    }

    public void entradaApp(View view) {
        String usuario = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();
        if (usuario.equals("admin") && senha.equals("admin")) {
            Toast.makeText(getApplicationContext(), "Parabéns por se logar no sistema!!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"Login ou senha errados.", Toast.LENGTH_SHORT).show();
        }
    }
}
