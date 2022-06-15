package ir.atisco.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick3(View v)
    {
        Intent intent=new Intent(this,
                MainActivity.class);
        Bundle b=new Bundle();
        intent.putExtra("bundle data",b);
        startActivity(intent);
    }
    public void onClick4(View v)
    {
        Intent intent=new Intent(this,
                MainActivity2.class);
        Bundle b=new Bundle();
        intent.putExtra("bundle data",b);
        startActivity(intent);
    }
}