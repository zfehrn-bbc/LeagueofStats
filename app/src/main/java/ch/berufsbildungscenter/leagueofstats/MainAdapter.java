package ch.berufsbildungscenter.leagueofstats;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import ch.berufsbildungscenter.leagueofstats.custom.StartButtonView;
import ch.berufsbildungscenter.leagueofstats.listener.MainActivityButtonListener;
import ch.berufsbildungscenter.leagueofstats.model.StartButton;

/**
 * Created by zfehrn on 16.08.2016.
 */
public class MainAdapter extends ArrayAdapter<StartButton> {

    private Context context;

    public MainAdapter(Context context, int resource, List<StartButton> buttonList) {
        super(context, resource, buttonList);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.adapter_main, parent, false);
        //
        StartButton startButton = this.getItem(position);
        //
        StartButtonView relativeLayoutButton = (StartButtonView) rowView.findViewById(R.id.main_item);
        relativeLayoutButton.setImageDrawable(getContext().getDrawable(startButton.getBgPicture()));
        relativeLayoutButton.setOnClickListener(new MainActivityButtonListener(context, startButton.getActivityClass()));
        //
        TextView name = (TextView) rowView.findViewById(R.id.main_name);
        name.setText(startButton.getTitle());
        return rowView;
    }
}
