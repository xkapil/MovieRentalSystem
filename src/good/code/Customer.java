package good.code;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kapil on 17/10/15.
 */
public class Customer {
    private String name;

    private List<Rental> rentals;


    public Customer(String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    public void addRental(Rental aReantal) {
        rentals.add(aReantal);
    }

    public String getName() {
        return name;
    }

    public String generateStatement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental aRental : rentals) {
            result += "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getAmountForEachRental()) + "\n";

        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getTotalRenterPoints()) + " frequent renter points";

        return result;
    }

    public String generateHTMLStatement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental aRental : rentals) {
            result += "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getAmountForEachRental()) + "\n";

        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getTotalRenterPoints()) + " frequent renter points";

        return result;
    }

    private double getTotalAmount(){
        double amount = 0;
        for(Rental r : rentals){
            amount += r.getAmountForEachRental();
        }
        return amount;
    }

    private int getTotalRenterPoints(){
        int frequentRenterPoints = 0;
        for(Rental r : rentals){
            frequentRenterPoints += r.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }
}
