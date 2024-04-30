package com.example.food_wastage_management;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes3.dex */
public class profilephoto extends AppCompatActivity {
    ImageButton i1;
    ImageButton i2;
    ImageButton i3;
    ImageButton i4;
    ImageButton i5;
    ImageButton i6;
    ImageButton i7;
    ImageButton i8;
    ImageButton i9;
    String l1;
    String l2;
    String l3;
    String l4;
    String l5;
    String l6;
    String l7;
    String l8;
    String l9;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilephoto);
        this.i1 = (ImageButton) findViewById(R.id.imageButton1);
        this.i2 = (ImageButton) findViewById(R.id.imageButton22);
        this.i3 = (ImageButton) findViewById(R.id.imageButton33);
        this.i4 = (ImageButton) findViewById(R.id.imageButton44);
        this.i5 = (ImageButton) findViewById(R.id.imageButton55);
        this.i6 = (ImageButton) findViewById(R.id.imageButton66);
        this.i7 = (ImageButton) findViewById(R.id.imageButton77);
        this.i8 = (ImageButton) findViewById(R.id.imageButton88);
        this.i9 = (ImageButton) findViewById(R.id.imageButton109);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(R.color.yellow));
        this.i1.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l1 = "https://firebasestorage.googleapis.com/v0/b/food-wastage-management-63d00.appspot.com/o/bbcc.jpg?alt=media&token=db95f8ff-87b8-4818-a540-49e5bd79f671";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l1).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.1.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", Toast.LENGTH_SHORT).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", Toast.LENGTH_SHORT).show();
                        }
                    });
                    return;
                }
                Toast.makeText(profilephoto.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
            }
        });
        this.i2.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l2 = "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/2.png?alt=media&token=7c47b235-26e3-427c-8dcd-8427b934885f";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l2).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.2.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", Toast.LENGTH_SHORT).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", Toast.LENGTH_SHORT).show();
                        }
                    });
                    return;
                }
                Toast.makeText(profilephoto.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
            }
        });
        this.i3.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l3 = "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/4.png?alt=media&token=91cbac46-03fb-476e-a6ba-6f233feca85e";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l3).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.3.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", Toast.LENGTH_SHORT).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", Toast.LENGTH_SHORT).show();
                        }
                    });
                    return;
                }
                Toast.makeText(profilephoto.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
            }
        });
        this.i4.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l4 = "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/5.png?alt=media&token=4657d359-2453-49b2-a076-31704596ae2e";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l4).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.4.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", Toast.LENGTH_SHORT).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", Toast.LENGTH_SHORT).show();
                        }
                    });
                    return;
                }
                Toast.makeText(profilephoto.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
            }
        });
        this.i5.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l5 = "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/6.png?alt=media&token=dbec415a-57e0-4f08-b31b-a4b94c2bef70";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l5).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.5.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", 0).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", 0).show();
                        }
                    });
                    return;
                }
                Toast.makeText(profilephoto.this, "No Internet Connection", 0).show();
            }
        });
        this.i6.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l6 = "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/7.png?alt=media&token=729060fa-f6be-4993-abe8-deeb612e6351";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l6).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.6.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", Toast.LENGTH_SHORT).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", Toast.LENGTH_SHORT).show();
                        }
                    });
                    return;
                }
                Toast.makeText(profilephoto.this, "No Internet Connection", 0).show();
            }
        });
        this.i7.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l7 = "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/8.png?alt=media&token=57c6cff2-b932-4750-b6a3-bd8c7b9c844e";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l7).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.7.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", Toast.LENGTH_SHORT).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", Toast.LENGTH_SHORT).show();
                        }
                    });
                    return;
                }
                Toast.makeText(profilephoto.this, "No Internet Connection", 0).show();
            }
        });
        this.i8.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l8 = "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/9.png?alt=media&token=9c4a3faf-4471-49d7-a4f1-375abafa4952";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l8).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.8.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", Toast.LENGTH_SHORT).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", Toast.LENGTH_SHORT).show();
                        }
                    });
                    return;
                }
                Toast.makeText(profilephoto.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
            }
        });
        this.i9.setOnClickListener(new View.OnClickListener() { // from class: com.example.food_wastage_management.profilephoto.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConnectivityManager manager = (ConnectivityManager) profilephoto.this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo activenetwork = manager.getActiveNetworkInfo();
                if (activenetwork != null) {
                    profilephoto.this.l9 = "https://firebasestorage.googleapis.com/v0/b/job-portal-app-1c851.appspot.com/o/10.png?alt=media&token=890d5cd0-8ca2-4e1e-8456-b3b57b668bf7";
                    FirebaseDatabase.getInstance().getReference().child("users").child(FirebaseAuth.getInstance().getUid()).child("slink").setValue(profilephoto.this.l9).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.example.food_wastage_management.profilephoto.9.1
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(profilephoto.this, "Profile pic uploaded successfully!", Toast.LENGTH_SHORT).show();
                                profilephoto.this.startActivity(new Intent(profilephoto.this, profile_edit.class));
                                return;
                            }
                            Toast.makeText(profilephoto.this, "Action failed!", Toast.LENGTH_SHORT).show();
                        }

                    });
                    return;
                }
                    Toast.makeText(profilephoto.this, "No Internet Connection", Toast.LENGTH_SHORT).show();


            }
        });
    }
}