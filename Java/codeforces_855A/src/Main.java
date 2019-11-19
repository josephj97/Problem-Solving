import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = new String[n];
        String[] results = new String[n];
        for(int i=0;i<n;++i){
            names[i]=scanner.next();
        }
        results[0]= "NO";
        for(int i=1;i<n;i++){
            boolean flag = false;
            int j=i-1;
            while (j>=0){
                if(names[i].equals(names[j])) {
                    flag = true;
                    break;
                }
                j--;
            }
            if(flag)
                results[i]="YES";
            else
                results[i]="NO";
        }
        for(int i=0;i<n;i++){
            System.out.println(results[i]);
        }
    }
}
