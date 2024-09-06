// matrix using two dimentioned array
import  java.util.Scanner;
public class program21{
    public static void  main(String[] args){
        int [][] arr = new int[3][3]; 
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix  elements");
        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                num  = sc.nextInt();
                arr[i][j] = num;
            }
        }
        
           for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        
    }
}