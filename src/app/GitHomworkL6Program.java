package app;


public class GitHomworkL6Program {
    public static void main(String[] args) {
        int currentSum = 0;
        int totalSum = 0;

        for(int i = 1;i <= 6;i++){
            currentSum += i;
            System.out.printf("%d) Num is %d, sum is %d%n", i, i, currentSum);
            totalSum = currentSum;
        }
        System.out.println("____________________________");
        System.out.printf("Sum of numbers is %d", totalSum);
    }
}
