package hu.helix.WA.WA_1206;

/**
 * Created by java1 on 2017.12.18..
 */
public class Recursion {
    /**
     * Ez a metódus fogja az n! értékét visszaadni
     *
     * @param n nfaktoriális értéke
     * @return
     */
    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int fibonacci (int n){
        if (n<=1){
            return 1;
        }else {
        return fibonacci(n-1)+ fibonacci(n-2);
    }}




}
