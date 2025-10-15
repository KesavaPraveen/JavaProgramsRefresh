package JavaInterviewPrep.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {

        /*
        Square Number - Manual Logic
         */
        List<Integer> list= Arrays.asList(1,2,3,4,5,10,23,45);
        List<Integer> squareList=new ArrayList<>();
        for(int num: list)
        {
            squareList.add(num*num);
        }
        System.out.println("Square List: " +squareList);

        /*
        Using Streams
         */
        List<Integer> squareStream=list.stream().map(num -> num*num).collect(Collectors.toList());
        System.out.println("Streams Squared List: " +squareStream);
    }
}
