package ch.berufsbildungscenter.leagueofstats.model;

/**
 * Created by zfehrn on 16.08.2016.
 */
public class StartButton {

    private String title;
    private int bgPicture;
    private Class activityClass;

    public StartButton(String title, int bgPicture, Class activityClass) {
        this.title = title;
        this.bgPicture = bgPicture;
        this.activityClass = activityClass;
    }

    @Override
    public String toString() {
        return "StartButton{" +
                "title='" + title + '\'' +
                ", bgPicture=" + bgPicture +
                ", activityClass=" + activityClass +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBgPicture() {
        return bgPicture;
    }

    public void setBgPicture(int bgPicture) {
        this.bgPicture = bgPicture;
    }

    public Class getActivityClass() {
        return activityClass;
    }

    public void setActivityClass(Class activityClass) {
        this.activityClass = activityClass;
    }
}
