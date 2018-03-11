package TrainerApp;
public abstract class Food {
    private String food;
    private int price;
    
    public Food(){
        this.food="Dilicious";
        this.price=100;
    }

    public Food(String food, int price) {
        this.food = food;
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public abstract int getEnergy();
    
}
/*Jatawatsafe*/