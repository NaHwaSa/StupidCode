package look.newbee.db;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDb {
    private static List<Employee> list = new LinkedList<>();
    private static EmployeeDb instance;

    private EmployeeDb() {}

    public static EmployeeDb getInstance() {
        if (instance == null) instance = new EmployeeDb();
        return instance;
    }

    public void insert(Employee employee) {
        list.add(employee);
    }

    public Employee select(int no) {
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee cur = it.next();
            if (cur.getNo() == no)
                return cur;
        }
        return null;
    }
}
