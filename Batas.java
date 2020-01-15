import java.util.Scanner;
public class Batas {
    public static void main(String[] args) {
        // TODO code application logic here
        int batas,i=0;        
        Scanner input= new Scanner(System.in);
        
        System.out.println(" Masukkan Batas Blangan");
        batas =input.nextInt();
        
        for (i=0;batas>=1;batas=batas-2){
            if((batas%2==0)){
                System.out.println(batas);
        }else if((batas%1==0)){
                System.out.println(batas-1);
        }
    }
    }   
}