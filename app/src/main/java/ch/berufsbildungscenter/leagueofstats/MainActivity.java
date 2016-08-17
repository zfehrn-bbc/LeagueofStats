package ch.berufsbildungscenter.leagueofstats;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ch.berufsbildungscenter.leagueofstats.model.StartButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<StartButton> startButtons = new ArrayList<>();
        startButtons.add(new StartButton(
                getString(R.string.champions_btn),R.drawable.spell2, AllChampionsActivity.class));

        startButtons.add(new StartButton(
                getString(R.string.items_btn), R.drawable.spell3, AllItemsActivity.class));

        startButtons.add(new StartButton(
                getString(R.string.favoritSummoners_btn), R.drawable.spell4, FavoritSummonerActivity.class));

        MainAdapter mainAdapter = new MainAdapter(this, R.id.main_item, startButtons);
        GridView mainListView = (GridView) findViewById(R.id.main_grid);
        mainListView.setAdapter(mainAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
