public class Fibonacci {
    public static void main(String[] args) {
        int numero = 21; // Número a ser verificado (pode ser alterado)
        System.out.println(fibonacciSequence(numero));
    }

    public static String fibonacciSequence(int num) {
        int a = 0, b = 1;
        while (a <= num) {
            if (a == num) {
                return "O número " + num + " pertence à sequência de Fibonacci.";
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return "O número " + num + " não pertence à sequência de Fibonacci.";
    }
}
