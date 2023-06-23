import model.Employee;
import model.Person;
import model.Teacher;

import java.util.ArrayList;

public class ManagerFunction {
    ArrayList<Person> listEmployee = new ArrayList<>();

    public ManagerFunction() {
    }
    public static void input(){

    }
    public static void show(ArrayList<Person> list){
        for (int i = 0; i < list.size(); i++){
            list.get(i).show();
        }
    }
    public static Person getMaxSalary(ArrayList<Person> list){
        for (int i = 0; i < list.size(); i++){
            list.sort((o1, o2) -> String.valueOf(o1.getSalary()).compareTo(String.valueOf(o2.getSalary())));
        }
        return list.get(list.size()-1);
    }
    public static float getTotalSalary(ArrayList<Person> list){
        float totalSalary = 0;
        for (int i = 0; i < list.size(); i++){
            totalSalary += list.get(i).getSalary();
        }
        return totalSalary;
    }
}
