package predicateExample;
 
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
 
public class EmployeePredicates
{
    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }
     
    // a is the predicate type of employee
    public static Predicate<Employee> isAdultFemale() {
        return a -> a.getAge() > 18 && a.getGender().equalsIgnoreCase("F");
    }
     
    public static Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
     
    //filter on a stream (which is a list) based on a predicate
    public static List<Employee> filterEmployees (List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter( predicate ).collect(Collectors.<Employee>toList());
    }
}  