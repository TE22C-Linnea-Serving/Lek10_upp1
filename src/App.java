import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);

        //a)
        System.out.println("Vad heter du?");
        String name = tangentbord.nextLine();

        System.out.println("Vad är ditt lösenord?");
        String password = tangentbord.nextLine();

        if(name.equals("root") && password.equals("pass")){
            System.out.println("Ditt bankkonto har 0 kr");
        }else{
            System.out.println("Fel namn eller lösenord");
        }

        System.out.println("");

        //b)
        System.out.println("Skriv in ett tal:");
        int tal = tangentbord.nextInt();
        if(tal>10){
            System.out.println("Talet är större än 10");
        }else{
            System.out.println("Talet är lika med eller mindre än 10");
        }
    }
}
