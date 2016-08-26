package ch.berufsbildungscenter.leagueofstats.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by zkillt on 19.06.2015.
 */
public class ChampionStat implements Parcelable {

    private String title;
    private double stat;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getStat() {
        return stat;
    }

    public void setStat(double stat) {
        this.stat = stat;
    }

    public ChampionStat()  {
    }

    /* parcelable part */
    public ChampionStat(Parcel pc) {
        setTitle(pc.readString());
        setStat(pc.readDouble());
    }

    public static final Parcelable.Creator<ChampionStat> CREATOR = new Parcelable.Creator<ChampionStat>() {
        public ChampionStat createFromParcel(Parcel pc) {
            return new ChampionStat(pc);
        }

        public ChampionStat[] newArray(int size) {
            return new ChampionStat[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeDouble(stat);
    }
}
