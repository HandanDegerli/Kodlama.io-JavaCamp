public class Main {

    public static void main(String[] args) {


       EmployeeManager employeeManager = new EmployeeManager(new OutsourceWorker());
       EmployeeManager employeeManager1= new EmployeeManager((IMaintainable) new Robot());
       EmployeeManager employeeManager2 = new EmployeeManager(new Worker(), new Worker());
       employeeManager1.maintain();
       employeeManager.work();
       employeeManager2.eatable();

    }
}
