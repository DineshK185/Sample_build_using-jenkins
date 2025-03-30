public class factorial {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Factorial <number>");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int fact = 1;

        for (int i = 2; i <= num; i++) fact *= i;

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
