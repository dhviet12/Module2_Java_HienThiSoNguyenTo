import javax.swing.*;
import java.util.Scanner;

public class SoNguyenTo_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can hien thi");
        int range = input.nextInt();
        int number = 0;
        int count = 0;
        while(count< range){
            boolean check=true;
            if ( number<2)
                check=false;
            else if (number== 2)
                check=true;
            else {
                for (int i = 2; i <number ; i++) {
                    if (number % i ==0)
                        check=false;
                }
            }
            if(check){
                System.out.println("So nguyen to: ");
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
