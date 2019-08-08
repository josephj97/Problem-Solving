//https://www.spoj.com/problems/DIVSUM/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for(int i=0; i<t; i++){
            int sumOfNumber=1;
            int number = input.nextInt();
            if(number == 1)
                sum.add(0);
            else{
                for(int j=2; j<=Math.sqrt(number); j++){
                    if(number%j == 0){
                        sumOfNumber += j;
                        if(j!=(number/j))
                        sumOfNumber += (number/j);
                    }
                }
                sum.add(sumOfNumber);
            }
        }
        for(int i=0;i<sum.size();i++){
            System.out.println(sum.get(i));
        }
    }
}
