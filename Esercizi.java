
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
public class Esercizi {
    
    public static void fibonacci(int quanti) {
        
        int x = 0;
        int y = 1;
        int res = 0;
        for(int i=0; i<quanti; i++){
            System.out.println(res);
            
            x = y;
            y = res;
            res = x + y;
            
        }
    }

    public static void equaz_2(int a, int b, int c){
       
       /*( -b + o - sqrt(b^2 - 4ac))/2;*/
       double soluz1 = 0;
       double soluz2 = 0;
       boolean risolvibile=false;
       double delta=b*b-4*a*c;
       if((delta)>=0){
            soluz1 = (-b + Math.sqrt(delta))/2*a;
            soluz2 = (-b - Math.sqrt(delta))/2*a;
            risolvibile=true;
        }
       else{
            risolvibile = false;
       };
       if(risolvibile==true){
            System.out.printf("sol 1: %.3f", soluz1);
            System.out.printf("\nsol 2: %.3f", soluz2);
           
       }
       else{
            System.out.println("non risolvibile nel campo dei reali");
       };

    }

    public static void ego(String nome) {

        String name = nome;
        System.out.print("+ - ");
        for(int i=1; i<nome.length(); i++){
            if( (name.substring(0,i)).length()%2 !=0){
                System.out.print('-');
            }
            else{
                System.out.print(' ');
            }
            }
        System.out.print(" - - + ");
        System.out.println("\n|   "+name+"    |");
        System.out.print("+ - ");
        for(int i=1; i<nome.length(); i++){
            if( (name.substring(0,i)).length()%2 !=0){
                System.out.print('-');
            }
            else{
                System.out.print(' ');
            }
            }
        System.out.println(" - - +");
        }
        
    public static void decrescente(int x){
        int numb = x;
        if (String.valueOf(x).length() != 5){
            System.out.println("ERRORE");
        }
        else{
            while(numb>=150){
                System.out.println(numb);
                numb-=2;
            }
        }
    }

    public static void compreso(int A, int B, int C){
        if (A<B==true && B<C==true){
            System.out.println("Compreso");
        }
        else{
            System.out.println("Non compreso");
        }
    }

    public static void pari(int num){
        if(num%2==0){
            System.out.println("numero pari");
        }
        else{
            System.out.println("numero dispari");
        }
    }

    public static void sommatrice(){
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("Input number: "); 
        int command = scan.nextInt();
        int sum = command;
        while(command != 0){
            System.out.print("Input number: "); 
            command = scan.nextInt();
            sum+=command;
        }
        System.out.println(sum);
           
    }

    public static void abs(int A){
        if (A<0){
            System.out.println(-A);
        }
        else{
            System.out.println(A);
        }
    }

    public static void max_int(){
        Scanner scan = new Scanner(System.in); 
        System.out.print("Input number: "); 
        int command = scan.nextInt();
        int sum=0;
        for (int i=1 ; i<command ; i++){
            sum += i;
            if (sum+i+1>command){
                System.out.println("il massimo intero è: "+i);
                break;
            }
        }
    }

    public static boolean doppie(){
        Scanner scan = new Scanner(System.in); 
        System.out.print("Input string: "); 
        String command = scan.next();
        boolean doppie = false;
        for (int i=0; i<command.length(); i++){
            if (i!=(command.length()-1) && command.charAt(i)==command.charAt(i+1)){
                doppie=true;
                System.out.println("ci sono doppie");
                return(doppie);
            }
        }
        if(doppie==false){
            System.out.print("non ci sono doppie");
            return(doppie);
        }

        return(doppie);
        
    }

    public static void list_remove(int[] lista, int posto){
        int[] l1 = new int[lista.length -1];
        for(int i=0;i<lista.length;i++){
            if (i<posto){
                l1[i]=lista[i];
            if (i>posto){
                l1[i-1]=lista[i];
            }
            }
        }

    }

    public static void matrice1(int lato, char carattere){
        int[][] matriche = new int[lato][lato];
        System.out.println(matriche);
        for(int i=0; i<lato; i++){
            for(int j=0; j<lato; j++){
                if(i==j || i==(lato - j -1) || j==(lato - i -1)){
                    System.out.print(carattere);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.print("\n");
            
        }
    }
    public static void main(String[] args) {
        matrice1(20,'F');
    }
}
