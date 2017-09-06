package com.bancomer.dyt;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bancomer.dyt.delegates.LoginDelegate;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        initialize();
    }


    private void initialize() {

        AsyncTask<Void, Void, Void> delayTask = new AsyncTask<Void, Void, Void>() {
            private final static long SPLASH_DELAY = 3000;

            @Override
            protected Void doInBackground(Void... params) {
                Log.v(SplashActivity.class.getSimpleName(), "Waiting 3 seconds.");
                try {
                    Thread.sleep(SPLASH_DELAY);
                    Log.v(SplashActivity.class.getSimpleName(), "3 seconds elapsed.");
                } catch (InterruptedException ex) {
                    Log.e(this.getClass().getSimpleName(), "Error in splash delay task", ex);
                }

                return null;
            }

            @Override
            protected void onPostExecute(Void result) {
                showLogin();
            }
        };
        delayTask.execute();
    }


    private void showLogin() {
           Intent intent = new Intent(this, LoginDelegate.class);
            startActivity(intent);
            // Avoids to return to this activity on back button clicked.
            this.finish();
    }

}
