import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * read Array from the console,sort and print
 * z.B input "3,Otto,Gerhard,Peter" -> output: "Gerhard,Otto,Peter"
 */
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int length =Integer.parseInt(scanner.nextLine());

       String[] names = new String[length];
       for (int i = 0;i<names.length;i++){
           names[i]=scanner.nextLine();

       }
        Arrays.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }


}
