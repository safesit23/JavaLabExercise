
package int105.model;

import java.util.Objects;

public class Seat {

    private int seatId;
    private String classSeat;
    private boolean seatSelected;

    public Seat(int seatId, String classSeat) {
        this.seatId = seatId;
        this.classSeat = classSeat;
    }

    public Seat(int seatId, String classSeat, boolean seatSelected) {
        this.seatId = seatId;
        this.classSeat = classSeat;
        this.seatSelected = seatSelected;
    }

    public boolean isSeatSelected() {
        return seatSelected;
    }

    public void setSeatSelected(boolean seatSelected) {
        this.seatSelected = seatSelected;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public String getClassSeat() {
        return classSeat;
    }

    public void setClassSeat(String classSeat) {
        this.classSeat = classSeat;
    }

    @Override
    public boolean equals(Object obj) {
        Seat temp = null;
        if (obj != null && obj instanceof Seat) {
            temp = (Seat) obj;
            if (seatId == temp.seatId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Seat{" + "seatId=" + seatId + ", classSeat=" + classSeat + ", seatSelected=" + seatSelected + '}';
    }

}
