package good.code;

import good.code.movie.Movie;

/**
 * Created by kapil on 17/10/15.
 */
public class Rental {

    Movie movie;

    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public int getFrequentRenterPoints() {
        return movie.calculateBonusPoints();
    }

    public double getAmountForEachRental() {
        return movie.getAmount(daysRented);
    }

}
