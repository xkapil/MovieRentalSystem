package test.unit.bad;

import bad.code.Customer;
import bad.code.Movie;
import bad.code.Rental;
import org.junit.Assert;

/**
 * Created by kapil on 17/10/15.
 */
public class CustomerTest {

    Movie shahid = new Movie("Shahid",1);
    Movie gru = new Movie("Gru",2);
    Movie pyaasa = new Movie("Pyaasa",0);
    Movie shipOfTheseus = new Movie("ShipOfTheseus",1);


    @org.junit.Test
    public void testStatementWithTwoMovies() throws Exception {

        String expected = "Rental Record for Kapil\n" +
                "\tShahid\t30.0\n" +
                "\tGru\t27.0\n" +
                "Amount owed is 57.0\n" +
                "You earned 3 frequent renter points";
        Customer kapil = new Customer("Kapil");
        kapil.addRental(new Rental(shahid,10));
        kapil.addRental(new Rental(gru,20));
        Assert.assertEquals(expected,kapil.generateStatement());
    }

    @org.junit.Test
    public void testStatementWithFourMovies() throws Exception {

        String expected = "Rental Record for Kapil\n" +
                "\tShahid\t30.0\n" +
                "\tGru\t27.0\n" +
                "\tPyaasa\t5.0\n" +
                "\tShipOfTheseus\t120.0\n" +
                "Amount owed is 182.0\n" +
                "You earned 6 frequent renter points";
        Customer kapil = new Customer("Kapil");
        kapil.addRental(new Rental(shahid,10));
        kapil.addRental(new Rental(gru,20));
        kapil.addRental(new Rental(pyaasa,4));
        kapil.addRental(new Rental(shipOfTheseus,40));
        Assert.assertEquals(expected, kapil.generateStatement());
    }
}