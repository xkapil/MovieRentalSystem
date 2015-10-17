package good.code.movie;

import good.code.movie.Movie;

/**
 * Created by kapil on 17/10/15.
 */
public class RegularMovie extends Movie {


    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }
}
