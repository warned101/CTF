package com.example.ctf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class ProfileActivity extends AppCompatActivity {

    //Drive hides emails
    private String email = "https://drive.google.com"+"/drive/folders/"+"1N3JZ6P8ROBurlWX3019z_XbgS7AQ7uFk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //In the Home, Jinx has a Kite under the class

        class EncryptingPassword {
//            static boolean isVowel(char c);
//            static String encryptString(String s, int n, int k);

//            static public void main(String[] args){}

        }

        String flag = "Email + encrypted_password";

    }

}

