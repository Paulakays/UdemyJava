//By convention, enum values are named in capitals and underscores(_) because enum values are constant values , and in Java constants are named in capitals and underscores. 
/*
1.Create Employee class 
2.Create Enum which has 4 Department: HR, OPERATION, LEGAL, MARKETING

3.Using For Loop: print the department with “Enum constant: ” and print the department’s original value with “ with ordinal value: ”
4.Using For-Each Loop(enhanced For Loop):  print the department with “Enum constant: ” and print the department’s original value with “ with ordinal value: ”
5.Using Switch Case: select and print Marketing
	Example: "Selected department is Marketing" or "Selected department is HR” 

6.Define name and age of Employee
7.Add 3 array of Employee objects(name & age) 
8.Using For-Each Loop: iterate via  array of Employee objects and print their details
*/
public class Employee{
    enum Department{
        HR, OPERATION, LEGAL, MARKETING;
    }
    
    String name;
    int age;
    
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int  getAge(){
        return age;
    }
    
    
    public static void main (String[]args){
        for(int i=0; i < Department.values().length; i++ ){
            Department dept = Department.values()[i];
            System.out.println("Enum constant: " + dept + " with ordinal value: " + dept.ordinal());
        }
        System.out.println();
        
        System.out.println("Using for-each loop");
        for(Department dpmnt : Department.values() ){
            System.out.println("Enum constant: " + dpmnt + " with ordinal value " + dpmnt.ordinal());
        }
        System.out.println();
        
        System.out.println("Using switch case");
        Department selectedDept = Department.MARKETING;
        switch(selectedDept){
            case  HR:
                System.out.println("Selected department is HR");
                break;
            case  OPERATION:
                System.out.println("Selected department is Operation");
                break;
            case  LEGAL:
                System.out.println("Selected department is Legal");
                break;
            case  MARKETING:
                System.out.println("Selected department is Marketing");
                break;
            default:
                System.out.println("No department is selected");
        }
        System.out.println();
        
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("David", 20);
        employees[1] = new Employee("Joy", 35); 
        employees[2] = new Employee("Kevin", 19);
          
        
        System.out.println("Showing employee details");
        for(Employee emp : employees){
            System.out.println("Employee name: " + emp.getName() + " Employee age: " + emp.getAge() );
        }
        
        
            
        
    }
}
