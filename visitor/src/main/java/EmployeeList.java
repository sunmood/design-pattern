import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunmood on 2019/1/17.
 * 员工列表类：对象结构
 */
public class EmployeeList {
    private List<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void accept(Department department){
        for (Employee employee : employeeList){
            employee.accept(department);
        }
    }
}
