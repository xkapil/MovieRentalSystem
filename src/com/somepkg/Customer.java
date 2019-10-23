package com.somepkg;

import java.util.ArrayList;
import java.util.List;

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
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + getName() + "\n";

        for (Rental aRental : rentals) {
            double thisAmount = 0;

            // determine amounts for each line
            switch (aRental.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (aRental.getDaysRented() > 2) {
                        thisAmount += (aRental.getDaysRented() - 2) * 1.5;
                    }
                    break;

                case Movie.NEW_RELEASES:
                    thisAmount += aRental.getDaysRented() * 3;
                    break;

                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (aRental.getDaysRented() > 3) {
                        thisAmount += (aRental.getDaysRented() - 3) * 1.5;
                    }
                    break;

            }

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((aRental.getMovie().getPriceCode() == Movie.NEW_RELEASES) && aRental.getDaysRented() > 1) {
                frequentRenterPoints++;
            }

            result += "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;

        }

        // add footer lines

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }
}
