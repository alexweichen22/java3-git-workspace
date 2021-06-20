/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _java_exe.java2Exe2.src.main.java.com.mycompany.java2exe2;

/**
 *
 * @author 6151742
 */
public class EmployeeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee1 = new Employee("Dan", 120000.0);
        Employee employee2 = new Employee("Dan", 25000.0);

        Employee teacher1 = new Teacher("Dan Teacher");
        Employee teacher2 = new Teacher("Dan", "Computer Science");
        Employee teacher3 = new Teacher("Dan The Employee");
        OfficeStaff officeStaff1 = new OfficeStaff("Dan Principal");
        Employee grade1Teacher1 = new Grade1Teacher("Dan Grade1 Teacher");
        ((Grade1Teacher) grade1Teacher1).printTitle("This is title from Grade1 teacher");
        System.out.println(((Teacher) grade1Teacher1).getSubject());
        System.out.println("Bonus of employee1 = " + employee1.calculateBonus());

        //System.out.println(employee2.getName());
        //System.out.println(teacher1.getName());
        //System.out.println(teacher2.getName() + "   for subject " + teacher2.getName());
        //System.out.println(officeStaff1.getName());        
    }

}
