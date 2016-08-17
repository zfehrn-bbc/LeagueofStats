package ch.berufsbildungscenter.leagueofstats;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread loadFtpChamps = new Thread() {
            @Override
            public void run() {
                try {
                    super.run();
                    sleep(3000);  //Delay of 10 seconds
                } catch (Exception e) {

                } finally {
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    finish();
                    startActivity(i);
                }
            }
        };
        loadFtpChamps.start();
    }

}
