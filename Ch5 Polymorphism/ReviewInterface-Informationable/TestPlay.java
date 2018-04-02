package reviewinterface;
public class TestPlay {
    public static void main(String[] args) {
        Informationable infos[] = new Informationable[5];
        infos[0] = new Car();
        infos[1] = new Dog();
        infos[2] = new Human();
        infos[3] = new Dog();
        infos[4] = new Human();
        int count=0;
        for(Informationable show:infos){
            if(show.isLife()){
                count++;
            }
        }
        System.out.println("Life ="+count);
    }
}
