

import java.lang.Math;
public class Bonk {
    
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
       boolean risolvibile=true;
       double delta=b*b-4*a*c;
       if((b*b - 4*a*c)>=0){
            soluz1 = (-b + Math.sqrt(delta))/2*a;
            soluz2 = (-b - Math.sqrt(delta))/2*a;
        }
       else{
            risolvibile = false;
       }
       if(risolvibile=true){
            System.out.printf("sol 1: %.3f", soluz1);
            System.out.printf("\nsol 2: %.3f", soluz2);
           
       }
       else{
            System.out.println("non risolvibile nel campo dei reali");
       }

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
        
        
        
    

    
    public static void main(String[] args) {
        equaz_2(1, -4, 2);
    }
}
