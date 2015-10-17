package good.code;

/**
 * Created by kapil on 17/10/15.
 */
public class NewReleaseMovie extends Movie {


    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int calculateBonusPoints(int daysRented) {
        return super.calculateBonusPoints(daysRented) + 1;
    }
}
