package model;

public abstract class Person {
    private String ID;
    private String name;
    private String dateOfBirth;
    private String address;
    public Person(){}

    public Person(String ID, String name, String dateOfBirth, String address) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract float getSalary();

    public abstract void show();
}
