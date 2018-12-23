package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.


        try {//unit testing for Factorial
            Assert.assertEquals(Factorial.factorial(5), 120);
            System.out.println("Unit testing passed for factorial");
        }catch (AssertionError ar){
            System.out.println("Unit testing failed for factorial");
        }


    }
}
