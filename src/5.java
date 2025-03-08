import java.util.*;
class RandomMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println(getRandomNumber(n));
    }
    private static int getRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n);
    }
}