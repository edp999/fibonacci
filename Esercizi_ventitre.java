import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Esercizi_ventitre {

    public static void read() {
        try{
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }


        sc.close();
    }  catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void scrivi() {
        try{FileWriter scrittore = new FileWriter("test.txt");
        scrittore.write("Hello World");
        scrittore.close();
    } catch (IOException errore) {
        System.out.println("daje forte");
    }
        
    }

    public static void rows(){

        /*lettura*/
        String nuova = "";
        try{
            File file = new File("manzoni.txt");
            Scanner sc = new Scanner(file);

            
            int k = 0;
            while(sc.hasNextLine()){
                nuova += (sc.nextLine()+ " " +  k +"\n");
                k+=1;
            }
    
            System.out.println(nuova);
            sc.close();
        }  catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        /*scrittura*/

        try{
            FileWriter scrittore = new FileWriter("manzoni1.txt");
            
            scrittore.write(nuova);
            scrittore.close();
        } catch (IOException errore) {
            System.out.println("daje forte");
        }
        
    }


    public static void main(String[] args) {
        rows();
    }
}
