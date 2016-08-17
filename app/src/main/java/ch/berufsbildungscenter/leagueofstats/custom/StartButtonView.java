package ch.berufsbildungscenter.leagueofstats.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by zfehrn on 16.08.2016.
 */
public class StartButtonView extends ImageButton {
    public StartButtonView(Context context) {
        super(context);
    }

    public StartButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StartButtonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }
}
