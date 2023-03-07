
public class TestEmployee {

    public static void main(String[] args) {

        Employee s1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(s1);

        System.out.println("");

        s1.setSalary(999);
        System.out.println(s1);

        System.out.println("");

        System.out.println("ID= " + s1.getID());
        System.out.println("FirstName= " + s1.getFirstName());
        System.out.println("LirstName= " + s1.getLastName());
        System.out.println("Salary= " + s1.getSalary());
        System.out.println("Name= " + s1.getName());
        System.out.println("AnnualSalary= " + s1.getAnnualSalary());
        System.out.println("raiseSalary= " + s1.raiseSalary(10));

        System.out.println(s1);

        System.out.println("");

        Employee s2 = new Employee(5, "Peter", "Tan", 586);
        System.out.println(s2);
    }

    /*
     * 
     * Employee[id=8,name=Peter Tan,salary=2500]
     * Employee[id=8,name=Peter Tan,salary=999]
     * id is: 8
     * firstname is: Peter
     * lastname is: Tan
     * salary is: 999
     * name is: Peter Tan
     * annual salary is: 11988
     * 1098
     * Employee[id=8,name=Peter Tan,salary=1098]
     * 
     */
}