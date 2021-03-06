package practicaljava.collections.lesson4;

class Employee implements Comparable<Employee> {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary < o.salary)
            return -1;
        else if(this.salary >  o.salary)
            return 1;
        return 0;
    }
}
