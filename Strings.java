import java.util.Scanner;

public class Strings {

    public static void printletter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    //      char arr [] = {'a','b','c','d'};
    // String str  = "xyz";
    // String str2  = new String("abcd");

    // Scanner sc = new Scanner(System.in);
    // String name;
    // name = sc.nextLine();
    // System.out.println(name);
    // String fullName = "Harshit raj";
    // System.out.println(fullName.length());

    //concatentation
    String firstName = "Harshit";
    String lastName = "Raj";
    String FullName = firstName + " " + lastName;
    // System.out.println(FullName.charAt(9));
    printletter(FullName);
    }
}
