import java.util.Arrays;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

     public static void main(String[] args){

        Employee emp1 = new Employee("john", "engineer");
        Employee emp2 = new Employee("leo", "Aerospace Equipment specialist");

        Set<Employee> employeeSet = new HashSet<>();

        employeeSet.add(emp1);
        employeeSet.add(emp2); 

        System.out.println(employeeSet);

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.hashCode());

      
      Integer [] integerArray = new Integer []{300,2554,548984,216521,22584,58485};

      Set<Integer> treeSet = new TreeSet<>(Arrays.asList(integerArray));

          for(Integer integer: treeSet){
            System.out.println(integer);
          }

    }}

          /* 
        HashSet<String> carSet = new HashSet<>();

                carSet.add("Volvo");
                carSet.add("BMW");
                carSet.add("Honda");
                carSet.add("Ford");

                // The itorator object setIt
             Iterator<String> setIt = carSet.iterator();

             while(setIt.hasNext()){
               System.out.println(setIt.next());
             }


             HashSet<String> numbers = new HashSet<>();

             numbers.add("9");
             numbers.add("5");
             numbers.add("3");
             numbers.add("2");

             System.out.println("The number set: " + numbers); 

             carSet.addAll(numbers);    //set modification
             carSet.removeAll(numbers);
             carSet.retainAll(numbers);


             System.out.println("The new set: " + carSet); 
  

     }
}
*/