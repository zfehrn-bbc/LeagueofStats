package ch.berufsbildungscenter.leagueofstats;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Looper;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import ch.berufsbildungscenter.leagueofstats.json.FreeToPlayChampionsIdLoader;
import ch.berufsbildungscenter.leagueofstats.listener.FreeToPlayChampListener;
import ch.berufsbildungscenter.leagueofstats.model.ChampionData;

public class SplashActivity extends Activity {

    private ArrayList<ChampionData> freeToPlayChampions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        freeToPlayChampions = new ArrayList<ChampionData>();

        final Activity context = this;
        Thread loadFtpChamps = new Thread() {
            @Override
            public void run() {
                Looper.prepare();
                try {
                    FreeToPlayChampionsIdLoader freeToPlayChampionsIdLoader = new FreeToPlayChampionsIdLoader(context, null);
                    freeToPlayChampionsIdLoader.execute();
                } catch (Exception e) {
                    Toast.makeText(context, "Failed to load...", Toast.LENGTH_LONG);
                }
            }
        };
        loadFtpChamps.start();
    }

    public void setData(){
        if(freeToPlayChampions.size()==10) {
            Intent i = new Intent(SplashActivity.this, MainActivity.class);
            i.putExtra("startChamps", freeToPlayChampions.toArray());
            finish();
            startActivity(i);
        }
    }

    public void addFreeToPlayChampion(ChampionData championData) {
        freeToPlayChampions.add(championData);
    }

}
