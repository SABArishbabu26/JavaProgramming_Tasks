import java.util.Scanner;

public class FizzBuzz {
    public static String run(int N, int M) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */

        String sequence = "";
        StringBuilder sb = new StringBuilder();

        for(int n=N;n<=M;n++){
            if(n%3 !=0 && n%5 !=0){
                sequence = String.valueOf(sb.append(n));
            }
            else if(n%3 ==0){
                sequence = String.valueOf(sb.append("Fizz"));
            }
            else if(n%5 ==0){
                sequence = String.valueOf(sb.append("Buzz"));
            }
            sb.append(",");
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        sequence = sb.toString();
        System.out.println(sequence);

        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter n: ");
        int N = scanner.nextInt();
        System.out.println("enter m: ");
        int M = scanner.nextInt();

        FizzBuzz.run(N,M);

    }
}
