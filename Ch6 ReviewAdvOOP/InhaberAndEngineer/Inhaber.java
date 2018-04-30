public abstract class Inhaber {
    private String name;
    private String surname;
    private double salary;

    public Inhaber(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    public abstract double getBonus();
    
    public String genEmail(){
        String email=name+"."+surname.substring(0, 3)+"@company.com";
        return email;
    }

    @Override
    public String toString() {
        return "Inhaber{" + "name=" + name + ", surname=" + surname + ", salary=" + salary + '}';
    }
    
}