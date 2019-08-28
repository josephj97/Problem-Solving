import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] array = new char[n][m];
        for(int i=0;i<n;i++) {
            String str = scanner.next();
            for (int j = 0; j < m; j++){
                array[i][j] = str.charAt(j);
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            boolean success = false;
            for(int j=0;j<m;j++){
                boolean best = true;
                for(int k=0;k<n;k++){
                    if(array[k][j]>array[i][j])
                        best = false;
                }
                if(best)
                    success=true;
            }
            if(success)
                sum++;
        }
        System.out.println(sum);
    }
}
