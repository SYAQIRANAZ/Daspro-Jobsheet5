import java.util.Scanner;

public class pemilihanPercobaan128_1 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.println("Masukkan Angka: ");
        int angka = input28.nextInt();
        
    if (angka <= 10) 
        System.out.println("Angka "+angka+" diangkut menggunakan mobil");
    else if (angka >= 100) 
        System.out.println("Angka "+angka+" diangkut menggunakan truck");
    }
        
        
     }