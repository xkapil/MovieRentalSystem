package good.code.movie;

import good.code.movie.Movie;

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
    public int calculateBonusPoints() {
        return super.calculateBonusPoints() + 1;
    }
}
