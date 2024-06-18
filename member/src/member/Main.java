package member;


public class Main {
    public static void main(String[] args) {

    	
        Employee employee = new Employee("yagnik", 30, "123-456-7890", "123 Main St", 50000, "Software Engineering");
        employee.printDetails();

        
        Manager manager = new Manager("nensi", 40, "098-765-4321", "456 Elm St", 80000, "Human Resources");
        manager.printDetails();
    }
}

