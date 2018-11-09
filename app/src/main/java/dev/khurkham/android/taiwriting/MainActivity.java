package dev.khurkham.android.taiwriting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.cunoraz.gifview.library.GifView;

import  dev.khurkham.android.taiwriting.Fragments.GifFragment;
import  dev.khurkham.android.taiwriting.R;



public class MainActivity extends AppCompatActivity {
    private Button pauseButton;
    private Button playButton;
    private Button nextButton;
    private Button dialogButton;
    private Button toastButton;
    private Button fragmentButton;
    private GifView gifView;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        toastButton = (Button) findViewById(R.id.toast);




        toastButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();

            }
        });



    }




    public void showToast() {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, null);
        Toast toastLocal = new Toast(getApplicationContext());
        toastLocal.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toastLocal.setDuration(Toast.LENGTH_LONG);
        toastLocal.setView(layout);
        toastLocal.show();
    }







    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("ออกจากแอพ!")
              //  .setIcon(Integer.parseInt("@mipmap/ic_launcher"))
                .setMessage("คุณต้องการออกจากแอพหรือไม่ ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }





}
