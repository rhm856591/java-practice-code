import java.util.*;
public class Employee {
    public String findName(ArrayList employees,String name){
        String result="";
        if(employees.contains(name)){
            result="FOUND";
        }else{
            result="NOT FOUND";
        }
        return result;
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("BOB");
        employees.add("John");
        employees.add("James");
        employees.add("Stephanie");
        System.out.println(e.findName(employees, "BOB"));
        System.out.println(e.findName(employees, "Raham"));
    }
}

