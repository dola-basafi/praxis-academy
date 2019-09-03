import java.util.Scanner;


public class Basic {

    public static void main(String[] args) {
        int jumlah;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah looping");
        jumlah = input.nextInt();
        for (int i = 0; i < jumlah;i++) {
            System.out.println("knock");
        }
        System.out.println("Penny");
    }
}