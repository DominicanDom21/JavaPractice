package CollectionsTests;
public class Employee {

    private int employeeNumber;
    private String name;
    private String title; 
    private int WAGE; 

    public Employee(String name, String title){
            this.name = name; 
            this.title = title; 
    }

    public int getEmployeeNumber(int employeeNumber){
        return employeeNumber;
    }

    public void setEmployeeNumber(){
        this.employeeNumber = employeeNumber;
    }

    public int getWage(int WAGE){
        return WAGE;
    }

    public void setWage(){
        this.WAGE = WAGE;
    }

    public String getname(String name){
        return name;
    }

    public void setname(){
        this.name = name;
    }

    public String gettitle(String title){
        return title;
    }

    public void setTitle(){
        this.title = title;
    }

    
     @Override
     public String toString(){
        return String.format("\n {name=%s, title=%s}", name,title);
     }   
    
    
}
