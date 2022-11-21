


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
        ego("ciccio");
    }
}
