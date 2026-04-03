
    
     import java.util.Scanner;

public class ChessboardSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the matrix (N x N)
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        long blackSum = 0;
        long whiteSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();

                // (i + j) % 2 == 0 means it's a black square
                if ((i + j) % 2 == 0) {
                    blackSum += value;
                } else {
                    whiteSum += value;
                }
            }
        }

        // Print results on two lines as requested
        System.out.println(blackSum);
        System.out.println(whiteSum);
        
        sc.close();
    }
}
