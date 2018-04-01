import int105.model.Card;
import int105.model.ElectronicDoor;
import org.junit.Test;
import static org.junit.Assert.*;

public class DoorTest {

    @Test
    public void lockDoor() {
        ElectronicDoor elecDoor = new ElectronicDoor(1, "AABNch", "TOCHIBANA");
        Card card = new Card(1, "AABNch", "Taey");
        elecDoor.unlockkey(card);
        elecDoor.lock();
        assertFalse(elecDoor.isStatus());
    }

    @Test
    public void unlockDoor() {
        ElectronicDoor elecDoor = new ElectronicDoor(1, "AABNch", "TOCHIBANA");
        Card card = new Card(1, "AABNch", "Taey");
        elecDoor.unlockkey(card);
        assertTrue(elecDoor.isStatus());
    }

    @Test
    public void wrongKeyUnlockDoor() {
        ElectronicDoor elecDoor = new ElectronicDoor(1, "AABNch", "TOCHIBANA");
        Card card = new Card(2, "Zsvsdax", "Taey");
        elecDoor.unlockkey(card);
        assertFalse(elecDoor.isStatus());
    }

}
