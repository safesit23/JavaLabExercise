package macproint105;
public class Building {
    private Room[] rooms;
    private String name;

    public Building(Room[] rooms, String name) {
        this.rooms = rooms;
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int countPeople(){
        int count= Customer.getCount();
        return count;
    }
    
    public int countPeople(String gender){
        int count=0;
        if(gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("m")){
            for(int i=0;i<rooms.length;i++){
                if(rooms[i].getOwner().getGender().equalsIgnoreCase("male")){
                    count++;
                }
            }
        }else{
            for(int i=0;i<rooms.length;i++){
                if(rooms[i].getOwner().getGender().equalsIgnoreCase("female")){
                    count++;
                }
            }
        }
        return count;
    }
    
    @Override
    public String toString() {
        return "Building{" + "rooms=" + rooms + ", name=" + name + '}';
    }
    
    
}
