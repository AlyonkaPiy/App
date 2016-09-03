package app.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Alenka on 11.04.2016.
 */
public class Behavior extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavior);
    }

    public static void start (Context context) {
        context.startActivity(new Intent(context, Behavior.class));
    }
}
