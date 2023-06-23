package model;

public class Employee extends Person{
    private float salaryFactor;

    public Employee(float salaryFactor) {
        this.salaryFactor = salaryFactor;
    }

    public Employee(String ID, String name, String dateOfBirth, String address, float salaryFactor) {
        super(ID, name, dateOfBirth, address);
        this.salaryFactor = salaryFactor;
    }
    public Employee(){}

    public double getSalaryFactor() {
        return salaryFactor;
    }

    public void setSalaryFactor(float salaryFactor) {
        this.salaryFactor = salaryFactor;
    }

    @Override
    public float getSalary() {
        return this.salaryFactor * 10000000;
    }

    @Override
    public void show() {
        System.out.println("ID:            " + this.getID() + "\n" +
                           "Name:          " + this.getName() + "\n" +
                           "Date of Birth: " + this.getDateOfBirth() + "\n" +
                           "Address:       " + this.getAddress() + "\n" +
                           "Salary:        " + this.getSalary());
    }
}
