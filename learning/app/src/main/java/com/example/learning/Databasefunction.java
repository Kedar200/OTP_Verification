package com.example.learning;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Databasefunction {
    public String username;
    public String email;
    private DatabaseReference mDatabase;

    public void writeNewUser(String userId, String name, String email) {
        User user = new User(name, email);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("users").child(userId).setValue(user);
    }
}
