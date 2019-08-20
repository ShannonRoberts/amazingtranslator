package nz.ac.eit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is the number to translate?" );
        Scanner sc = new Scanner(System.in);
        String userNumber = sc.nextLine();
        int translatedNumber = Integer.parseInt(userNumber);
        System.out.println("translated number " + translatedNumber);
    }
}
