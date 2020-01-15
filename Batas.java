import java.util.Scanner;
public class Batas {
    public static void main(String[] args) {
        int[] tabInt = {51,23,17,32,43,88};
        int i,j,data_sisip;
        
        for(i=1; i<6; i++){ 
            data_sisip = tabInt[i]; 
            j = i; 
            while((j>0) && (tabInt[j-1] > data_sisip)){            
                tabInt[j] = tabInt[j-1]; 
                j = j - 1; 
            }        
            tabInt[j] = data_sisip; 
        } 
        for(i=0; i<6; i++){ 
            System.out.print(tabInt[i]+" ");
        
    }
    }   
}