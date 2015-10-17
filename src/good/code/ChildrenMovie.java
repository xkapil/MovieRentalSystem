package good.code;

/**
 * Created by kapil on 17/10/15.
 */
public class ChildrenMovie extends Movie {


    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }
}
