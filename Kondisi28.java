import java.util.Scanner;

public class Kondisi28 {
    public static void main(String[] args) {
        Scanner sc28 = new Scanner(System.in);
       
        System.out.println("Masukkan suhu: ");
         int suhu = sc28.nextInt();

         if (suhu<16) {
            System.out.println("Silahkan memakai jaket");
         }
         if (suhu<20) {
            System.out.println("Silahkan pakai baju tebal");
         }
         else {
            System.out.println("silahkan memakai topi");
         }

    }
}