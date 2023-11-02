import java.util.*;

public class savingprivatea {
    public static void main (String[] args){
         Scanner texttaker = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = texttaker.nextLine();
        int a_number=0;
        int upper_number=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)== 'a'){
                a_number++;
            }
              if(Character.isUpperCase(text.charAt(i))){
                upper_number++;
        }
    }
    System.out.println("The letter A number in your text is: " +a_number);
    System.out.println("The number of upper case letters in your text is: " +upper_number);
    texttaker.close();
}
}
