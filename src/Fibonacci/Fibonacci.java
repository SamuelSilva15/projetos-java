package Fibonacci;

public class Fibonacci {

    public static int fibonacci (int valor){
        if(valor < 2 ){
            return 1;
        }
        return fibonacci(valor - 1) + fibonacci(valor -2);
    }
}
