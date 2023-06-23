package model;

public class Teacher extends Person{
    private int hour;

    public Teacher(int hour) {
        this.hour = hour;
    }

    public Teacher(String ID, String name, String dateOfBirth, String address, int hour) {
        super(ID, name, dateOfBirth, address);
        this.hour = hour;
    }
    public Teacher(){}

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public float getSalary() {
        return this.hour * 5000000;
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
