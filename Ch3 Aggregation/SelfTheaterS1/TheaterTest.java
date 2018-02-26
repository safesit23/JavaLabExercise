import int105.model.Seat;
import int105.model.Theater;
import org.junit.Test;
import static org.junit.Assert.*;

public class TheaterTest {

    Seat[] seats = {
        new Seat(1, "Normal", false),
        new Seat(2, "Normal", false),
        new Seat(3, "Normal", false),
        new Seat(4, "Normal", true),
        new Seat(5, "Normal", true),
        new Seat(6, "Normal", false),
        new Seat(7, "Normal", false),
        new Seat(8, "Normal", false),
        new Seat(9, "Honeymoon", false),
        new Seat(10, "Honeymoon", true),
        new Seat(11, "Honeymoon", true),
        new Seat(12, "Honeymoon", false)};
    Theater theater = new Theater(1, seats);

    public TheaterTest() {
    }

    @Test
    public void reserveSeatTest() {
        boolean[] expecteds = {true, false, false, true};
        boolean[] actuals = {theater.reserveSeat(1), theater.reserveSeat(4), theater.reserveSeat(14), theater.reserveSeat(12)};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void countNoReserveSeatTest() {
        int expecteds = 8;
        int actuals = theater.countNoReserveSeat();
        assertEquals(expecteds, actuals);
    }

    @Test
    public void countNoReserveSeatWithClassHoneymoonTest() {
        int expecteds = 2;
        int actuals = theater.countNoReserveSeat("Honeymoon");
        assertEquals(expecteds, actuals);
    }

    @Test
    public void countNoReserveSeatWithClassNormalTest() {
        int expecteds = 6;
        int actuals = theater.countNoReserveSeat("Normal");
        assertEquals(expecteds, actuals);
    }

}
