package Inheritance;

public class PrivilegeMem extends NormalMem {

    private String licensePlate;
    private String personalAssis;

    public PrivilegeMem(String licensePlate, String personalAssis) {
        this.licensePlate = licensePlate;
        this.personalAssis = personalAssis;
    }

    public PrivilegeMem(String licensePlate, String personalAssis, int memberID, String name, int expense) {
        super(memberID, name, expense);
        this.licensePlate = licensePlate;
        this.personalAssis = personalAssis;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getPersonalAssis() {
        return personalAssis;
    }

    public void setPersonalAssis(String personalAssis) {
        this.personalAssis = personalAssis;
    }

    /*public boolean equals(Object obj) {
        PrivilegeMem temp = null;
        if (obj != null && obj instanceof PrivilegeMem) {
            temp = (PrivilegeMem) obj;

            if (getMemberID() == temp.getMemberID()) {
                return true;
            }
        }
        return false;
    }
*/

    @Override
    public double discount() {
        double payment;
        payment = expense - (expense * 30 / 100);
        return payment;
    }

}