public class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String aName, String aAdress, String aSchool, double aPay) {
        super(aName, aAdress);
        this.school = aSchool;
        this.pay = aPay;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the pay
     */
    public double getPay() {
        return pay;
    }

    /**
     * @param pay the pay to set
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + " ,school: " + school
                + " ,pay: " + pay + "]";
    }
}