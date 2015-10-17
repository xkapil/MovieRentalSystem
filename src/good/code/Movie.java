package good.code;

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

    public int calculateBonusPoints(int daysRented) {
        return 1;
    }

    /*public double getAmount(int daysRented) {
        double thisAmount = 0;
        switch (this.priceCode) {
            case REGULAR:
                thisAmount += 2;
                if (daysRented > 2) {
                    thisAmount += (daysRented - 2) * 1.5;
                }
                break;

            case NEW_RELEASES:
                thisAmount += daysRented * 3;
                break;

            case CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3) {
                    thisAmount += (daysRented - 3) * 1.5;
                }
                break;

        }
        return thisAmount;
    }*/
}
