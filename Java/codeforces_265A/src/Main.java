import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String instructions = scanner.nextLine();
        String steps = scanner.nextLine();
        int ind=0;
        for(int i=0;i<steps.length();i++){
            if(steps.charAt(i) == instructions.charAt(ind))
                ind++;
//            System.out.println(ind);
        }
        System.out.println(ind+1);
    }
}
