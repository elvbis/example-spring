package elvbis.example.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


       ArrayList<Integer> mayores5 = (ArrayList<Integer>)Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().filter(x->x>5).collect(Collectors.toCollection(()->new ArrayList<Integer>()));
       mayores5.forEach(x-> System.out.println(x));
    }
}
