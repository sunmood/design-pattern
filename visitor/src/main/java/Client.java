/**
 * Created by sunmood on 2019/1/17.
 */
public class Client {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        Employee employee1,employee2,employee3,employee4,employee5;

        employee1 = new FulltimeEmployee("张无忌",3200.00,45);
        employee2 = new FulltimeEmployee("杨过",2000.00,40);
        employee3 = new FulltimeEmployee("段誉",2400.00,38);
        employee4 = new ParttimeEmployee("洪七公",80.00,20);
        employee5 = new ParttimeEmployee("郭靖",60.00,18);

        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        employeeList.addEmployee(employee3);
        employeeList.addEmployee(employee4);
        employeeList.addEmployee(employee5);

        Department department = new HRDepartment();
        employeeList.accept(department);
    }
}
