package buoi2;
import java.util.*;
public class bai3 {
    static void tong(int n){
        int s = 0;
        for(int i=1;i<=n;i++)
            if(i % 2 !=0){
                s += i;
                System.out.print(i + " ");
            }
        System.out.print("tong la: "+ s);
    }
    static int tong2(int n){
        int s = 0, i = 0;
        while (i<=n ){
            if (i % 2 !=0)
              s += i;
            i++;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so n: ");
        n = sc.nextInt();
    //  System.out.println("tong la: "+ tong2(n) ); 
        tong(n);
    }
}
