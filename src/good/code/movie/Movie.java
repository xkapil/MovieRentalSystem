package good.code.movie;

/**
 * Created by kapil on 17/10/15.
 */
public abstract class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract double getAmount(int daysRented);

    public int calculateBonusPoints() {
        return 1;
    }
}
