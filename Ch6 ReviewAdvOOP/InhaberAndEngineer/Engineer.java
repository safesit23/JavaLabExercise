public final class Engineer extends Inhaber{
    private int level;

    public Engineer(int level, String name, String surname, double salary) {
        super(name, surname, salary);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getBonus(){
        return super.getSalary()*this.level;
    }
    
    @Override
    public String toString() {
        return "Engineer{" + "level=" + level + '}';
    }

}
