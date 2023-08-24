import java.math.BigInteger;

public class Sequence {

    //initalised an array to store the results of the Fibonacci method
    private BigInteger[] test;

    //this is used to memorise the results of Fibonacci(x)
    public BigInteger FibTest(int x){
        test = new BigInteger[x+1];
        return Fibonacci(x);
    }

    public BigInteger Fibonacci(int x){
//        BigInteger fib;
//        BigInteger f;
        //base cases for fibonacci
        if ( x == 0){
            return BigInteger.ZERO;
        }
        if (x == 1) {
            return BigInteger.ONE;

        }
        if (test[x] != null){
            return test[x];
        }
        //gets the results from the fibtest and calculates the result then stores this in an array
        test[x] = Fibonacci(x-1).add(Fibonacci(x-2));
        System.out.println(test[x]);
        return test[x];

            //this method took too long to produce a result since it was repeating a lot of calculations
//            f = Fibonacci(x-1);
//            fib = f.add(Fibonacci(x-2));

//        return fib;
    }

}
