import java.util.Scanner;


public class Matriks {
    
    static int[][] inputMatriks(int  a) {
        Scanner input = new Scanner(System.in);
        int mat[][] = new int[a][a]; 
        for (int i = 0; i < a; i++) {            
            for (int j = 0; j < a; j++) {
                mat [i][j] = input.nextInt();                
            }           
        }        
        return mat;
    }
    static void printMatriks(int [][] a,int ordo){
        for (int i = 0; i < ordo; i++) {
            System.out.print("| ");
            for (int j = 0; j < ordo; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    static int[][] jumlahMatriks(int [][] a,int [][] b,int ordo){
        int jum[][]= new int [ordo][ordo];
        for (int i = 0; i < ordo; i++) {           
            for (int j = 0; j < ordo; j++) {
                jum[i][j] = a[i][j] + b[i][j];
            }
        }
        return jum;
    }

    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        int ordo ;
        System.out.print("Masukkan ordo matriks = ");
        ordo = input.nextInt();
        input.nextLine();
        int matriksA[][] = new int[ordo][ordo];
        int matriksB[][] = new int[ordo][ordo];
        int matriksJumlah[][] = new int[ordo][ordo];
        System.out.println("Input isi matriks berikut "); 
        matriksA = inputMatriks(ordo) ;   
        System.out.println("Input isi matriks berikut "); 
        matriksB = inputMatriks(ordo) ;   
        matriksJumlah = jumlahMatriks(matriksA, matriksB, ordo);
        printMatriks(matriksJumlah,ordo);
    }
    

}