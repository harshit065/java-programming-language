import java.util.*;
public class Function {

    public static void sayhello(){
        System.out.println("sayhello");
    }

    public static int calculateSum(int a, int b){ //FORMAL PARAMETERS
        int sum = a+b;
       return sum;
    }
    // public static void swap(int a, int b){
    //     //SWAP
    //     int temp =a;
    //     a = b;
    //     b = temp;
    //     System.out.println(" a : " +a);
    //     System.out.println(" b : " +b);
    // }
    public static int multiply(int a, int b){
       int product = a* b;
       return product;

    }

    public static int factorial(int n){
        int f =1;
        for(int i =1; i<=n; i++){
            f = f*i;
           
        }
        return f;
    }

    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    //PRIME OR NOT (OPTIMIZED METHOD)
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if( n % i == 0){
               return false; 
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); //ACTUAL PARAMETERS
        // System.out.println("sum is:" + sum);

        //PRODUCT
    //    int a =3;
    //    int b =5;
    //    int prod =  multiply(a, b);
    //    System.out.println("a*b = " +prod);
        
        //SWAP
        // int a = 10;
        // int b = 5;
        // swap(a, b);

        //FACTORIAL
        // System.out.println(factorial(4));

        //BINOMAIL COEFF
        // System.out.println(bincoeff(5,2));

        //PRIME
        System.out.println(isPrime(12));
    }
}
