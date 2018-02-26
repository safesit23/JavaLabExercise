package int105.model;

public class Theater {

    private int theaterId;
    private Seat[] seats;

    public Theater() {
    }

    
    public Theater(int theaterId, Seat[] seats) {
        this.theaterId = theaterId;
        this.seats = seats;
    } 

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public boolean reserveSeat(int seatId) {
        if(seatId>seats.length){
            return false;
        }else{
            if(seats[seatId-1].isSeatSelected()==false){
                return true;
            }else{
                return false;
            }
        }
    }

    public int countNoReserveSeat() {
       	int count=0;
        for(int i=0;i<seats.length;i++){
            if(seats[i].isSeatSelected()==false){
                count++;
            }
        }
        return count;
    }

    public int countNoReserveSeat(String classSeat) {
     	int count=0;
        for(int i=0;i<seats.length;i++){
            if(seats[i].isSeatSelected()==false&&seats[i].getClassSeat().equalsIgnoreCase(classSeat)){
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        String seatAll = "";
        for (Seat seat : seats) {
            seatAll += seat.toString() + "\n";
        }
        return "Theater{" + "theaterId=" + theaterId + "\nseats=" + seatAll + '}';
    }

}
