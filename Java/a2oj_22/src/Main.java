//https://a2oj.com/p?ID=22

import java.util.*;

public class Main {

    public static int adjacentTeams(int r, int c, int[][] hall){
        int sum = 0;
        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int i=0; i<r; i++){
            for(int j=0;j<c;j++){
                if(hall[i][j]==-1)
                    continue;
                if(i==0 && j==0){
                    if(hall[0][1]==hall[i][j] || hall[1][0]==hall[i][j] || hall[1][1]==hall[i][j])
                        map.put(hall[i][j],1);
                }
                else if(i==0 && j>0 && j<c-1){
                    if(hall[0][j-1]==hall[i][j] || hall[0][j+1]==hall[i][j] || hall[1][j-1]==hall[i][j] ||
                            hall[1][j]==hall[i][j] || hall[1][j+1]==hall[i][j])
                        map.put(hall[i][j],1);
                }
                else if(j==0 && i>0 && i<r-1){
                    if(hall[i-1][0]==hall[i][j] || hall[i+1][0]==hall[i][j] || hall[i-1][1]==hall[i][j] ||
                            hall[i][1]==hall[i][j] || hall[i+1][1]==hall[i][j])
                        map.put(hall[i][j],1);
                }
                else if(i==r-1 && j==c-1){
                    if(hall[r-1][c-2]==hall[i][j] || hall[r-2][c-1]==hall[i][j] || hall[r-2][c-2]==hall[i][j])
                        map.put(hall[i][j],1);
                }
                else if(i==r-1 && j<c-1 && j>0){
                    if(hall[r-1][j-1]==hall[i][j] || hall[r-1][j+1]==hall[i][j] || hall[r-2][j-1]==hall[i][j] ||
                            hall[r-2][j]==hall[i][j] || hall[r-2][j+1]==hall[i][j])
                        map.put(hall[i][j],1);
                }
                else if(j==c-1 && i<r-1 && i>0){
                    if(hall[i-1][c-1]==hall[i][j] || hall[i+1][c-1]==hall[i][j] || hall[i-1][c-2]==hall[i][j] ||
                            hall[i][c-2]==hall[i][j] || hall[i+1][c-2]==hall[i][j])
                        map.put(hall[i][j],1);
                }
                else if(i>0 && i<r-1 && j>0 && j<c-1){
                    if(hall[i-1][j-1]==hall[i][j] || hall[i-1][j]==hall[i][j] || hall[i-1][j+1]==hall[i][j] ||
                            hall[i][j-1]==hall[i][j] || hall[i][j+1]==hall[i][j] ||
                            hall[i+1][j-1]==hall[i][j] || hall[i+1][j]==hall[i][j] || hall[i+1][j+1]==hall[i][j])
                        map.put(hall[i][j],1);
                }
            }
        }
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            int temp = (int) entry.getValue();
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String noOfT = scan.nextLine();
        int t = Integer.parseInt(noOfT);
        for(int i=0;i<t;i++){
            int rows = scan.nextInt();
            int columns = scan.nextInt();
            int[][] hall = new int[rows][columns];
            for(int r = 0;r<rows;r++){
                for(int c = 0;c<columns;c++){
                    hall[r][c] = scan.nextInt();
                }
            }
            System.out.println(adjacentTeams(rows, columns, hall));
        }
    }
}
