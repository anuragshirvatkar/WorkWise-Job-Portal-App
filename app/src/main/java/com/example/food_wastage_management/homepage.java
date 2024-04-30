package com.example.food_wastage_management;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes3.dex */
public class homepage extends AppCompatActivity {
    EditText age;
    EditText city;
    EditText name;
    ProgressBar p1;
    EditText phone;
    ImageButton profpic;
    EditText skills;
    EditText street;
    Button submit;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        this.submit = (Button) findViewById(R.id.button3);
        this.name = (EditText) findViewById(R.id.editTextTextPersonName3);
        this.phone = (EditText) findViewById(R.id.editTextTextPersonName4);
        this.age = (EditText) findViewById(R.id.editTextTextPersonName7);
        this.skills = (EditText) findViewById(R.id.editTextTextPersonName6);
        this.street = (EditText) findViewById(R.id.editTextTextPersonName8);
        this.city = (EditText) findViewById(R.id.editTextTextPersonName5);

        this.p1 = (ProgressBar) findViewById(R.id.progressBar5);
        this.submit.setOnClickListener(new AnonymousClass1());
    }

    /* renamed from: com.example.food_wastage_management.homepage$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ConnectivityManager manager = (ConnectivityManager) homepage.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activenetwork = manager.getActiveNetworkInfo();
            if (activenetwork != null) {
                if (homepage.this.name.length() < 2 || homepage.this.name.length() > 50) {
                    homepage.this.name.setError("Enter Proper Name");
                }
                if (homepage.this.phone.length() < 10 || homepage.this.phone.length() > 10) {
                    homepage.this.phone.setError("Enter 10 digit number");
                }
                if (homepage.this.age.length() < 1 || homepage.this.age.length() > 3) {
                    homepage.this.age.setError("Enter Proper Age");
                }
                if (homepage.this.skills.length() < 3 || homepage.this.skills.length() > 20) {
                    homepage.this.skills.setError("Enter Proper Skills");
                    return;
                }
                if (homepage.this.street.length() < 3 || homepage.this.street.length() > 40) {
                    homepage.this.street.setError("Enter Proper Address");
                }
                if (homepage.this.city.length() < 3 || homepage.this.city.length() > 20) {
                    homepage.this.city.setError("Enter Proper City");
                }

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(homepage.this);
                alertDialog.setTitle("Submit");
                alertDialog.setMessage("Is information correct?");
                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() { // from class: com.example.food_wastage_management.homepage.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        homepage.this.p1.setVisibility(View.VISIBLE);
                        String sname = homepage.this.name.getText().toString();
                        String sphone = homepage.this.phone.getText().toString();
                        String sage = homepage.this.age.getText().toString();
                        String skilo = homepage.this.skills.getText().toString();
                        String sstreet = homepage.this.street.getText().toString();
                        String scity = homepage.this.city.getText().toString();

                        users u = new users(sname, sphone, sage, skilo, sstreet, scity, "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/blank-avatar-profile-picture-vector-45161169.jpg?alt=media&token=70fd7c64-55b7-4505-8df6-1a345aa33ad5",
                               "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/Files%2FSampleIntroVideo.mp4?alt=media&token=b88da65d-e182-4bd2-86ed-f26140b6ff66" );
                        FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).setValue(u).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.homepage.1.1.1
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public void onComplete(Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(homepage.this, "Profile created!", Toast.LENGTH_SHORT).show();
                                    homepage.this.startActivity(new Intent(homepage.this, homepage2.class));
                                }
                            }
                        });
                    }
                });
                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() { // from class: com.example.food_wastage_management.homepage.1.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                alertDialog.show();
                return;
            }
            Toast.makeText(homepage.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent(this, loginregister.class);
        startActivity(intent);
    }
}