package test.unit.good;

import good.code.*;
import good.code.movie.ChildrenMovie;
import good.code.movie.Movie;
import good.code.movie.NewReleaseMovie;
import good.code.movie.RegularMovie;
import org.junit.Assert;

/**
 * Created by kapil on 17/10/15.
 */
public class CustomerTest {

    Movie shahid = new NewReleaseMovie("Shahid");
    Movie gru = new ChildrenMovie("Gru");
    Movie pyaasa = new RegularMovie("Pyaasa");
    Movie shipOfTheseus = new NewReleaseMovie("ShipOfTheseus");

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
        System.out.println(kapil.generateStatement());
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
        System.out.println(kapil.generateStatement());
        Assert.assertEquals(expected,kapil.generateStatement());
    }

}