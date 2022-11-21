boolean doppie(){
    Scanner scan = new Scanner(System.in); 
    System.out.print("Input string: "); 
    String command = scan.next();
    boolean doppie = false;
    for (int i=0; i<command.length(); i++){
        if (i!=(command.length()-1) && command.charAt(i)==command.charAt(i+1)){
            doppie=true;
            break;
        }
    }
    return(doppie);
}

doppie();