public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String aName, String aAdress, String aProgramm, int aYear, double aFee) {
        super(aName, aAdress);
        this.program = aProgramm;
        this.year = aYear;
        this.fee = aFee;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program: " + program
                + " ,year: " + year + " ,fee: " + fee + "]";
    }
}