package math.problems;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.


        try {//unit testing for Factorial
            Assert.assertEquals(Factorial.factorial(5), 120);
            System.out.println("Unit testing passed for factorial");
        }catch (AssertionError ar){
            System.out.println("Unit testing failed for factorial");
        }

        try {//unit testing for Fibonacci
            ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986));
            Assert.assertEquals(Fibonacci.arrayFibo(), expectedArray);
            System.out.println("Unit testing passed for fibonacci");
        }catch (AssertionError as){
            System.out.println("Unit testing failed for fibonacci");
        }

        try {//unit testing for FindLowestDifference
            Assert.assertEquals(FindLowestDifference.lowestDifference(),13);
            System.out.println("Unit testing passed for FindLowestDifference");
        }catch (AssertionError as){
            System.out.println("Unit testing failed for FindLowestDifference");
        }

        try{
            Assert.assertEquals(FindMissingNumber.missingNumber(),9);
            System.out.println("Unit testing passed for FindMissingNumber");
        }catch (AssertionError as){
            System.out.println("Unit testing failed for FindMissingNumber");
        }


    }
}
