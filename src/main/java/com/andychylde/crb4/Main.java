package com.andychylde.crb4;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        FileInputStream serviceAccount = null;
        try {
            serviceAccount = new FileInputStream("/home/femifalase/IdeaProjects/CRB4MFB/src/main/resources/crb4mfb-firebase-adminsdk-sg66j-f8878a6ecb.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        FirebaseOptions options = null;
        try {
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://crb4mfb.firebaseio.com")
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FirebaseApp.initializeApp(options);

    }
}
