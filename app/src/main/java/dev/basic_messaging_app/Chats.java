package dev.basic_messaging_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
        Intent signin=new Intent(this,Auth.class);
        if(FirebaseAuth.getInstance().getCurrentUser() == null) {
            startActivity(signin);
        }
        else
        {
            Toast.makeText(this,
                    "Welcome " + FirebaseAuth.getInstance()
                            .getCurrentUser()
                            .getDisplayName(),
                    Toast.LENGTH_LONG)
                    .show();
            displayChatMessages();
        }
    }
    private void displayChatMessages()
    {

    }
}
