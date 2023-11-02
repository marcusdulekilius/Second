public class fall2012 {
    public static void main(String[] args){
        String ourtext = "Java Programming Lesson Fall 2012";
        String wanted = "Programming Lesson";
        int whereisit = ourtext.indexOf(wanted);
        if(whereisit!= -1){
            String hereiam = ourtext.substring(whereisit, whereisit + wanted.length());
            System.out.println(hereiam);
        }
        else{
           System.out.println("Nope, sorry."); 
        }
    }
}
