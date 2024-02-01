import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class JavaResolve
{
    public static void main(String[] args) {
        System.out.println(getDuplicates(List.of(1,3,4,5,1,5,4)));
    }
    
    public static<T> Map<T, Long> getDuplicates(List<T> list) {
        return list.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
    } 
}