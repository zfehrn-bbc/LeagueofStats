package ch.berufsbildungscenter.leagueofstats.listener;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import ch.berufsbildungscenter.leagueofstats.AllChampionsActivity;
import ch.berufsbildungscenter.leagueofstats.FavoritSummonerActivity;
import ch.berufsbildungscenter.leagueofstats.FreeToPlayChampionsActivity;
import ch.berufsbildungscenter.leagueofstats.R;
import ch.berufsbildungscenter.leagueofstats.AllItemsActivity;

/**
 * Created by zpengc on 17.06.2015.
 */
public class MainActivityButtonListener implements View.OnClickListener {

    private Context context;
    private Class intentClass;

    public MainActivityButtonListener(Context context, Class intentClass) {
        this.setContext(context);
        this.intentClass = intentClass;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, intentClass);
        context.startActivity(intent);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
