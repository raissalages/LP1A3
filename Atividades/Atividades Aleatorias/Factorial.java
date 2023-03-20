public class Factorial {
    public static int Factorial(int num){
        if(num > 1){
            return num * Factorial(num - 1);
        }
        if(num > -1){
            return 1;
        }
        throw new IllegalArgumentException("Argument must no be negative.");
    }
}
