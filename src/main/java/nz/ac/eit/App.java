package nz.ac.eit;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * Hello world!
 *
 */
public class App {
    static String[] frenchNumbers = {"un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf",
            "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf",
            "vingt", "vingt et un", "vingt-deux", "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six",
            "vingt-sept", "vingt-huit", "vingt-neuf", "trente"};

    static String[] germanNumbers = {"einz", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun",
            "zehn", "elf", "zwolf", "dreizehn", "vierzehn", "funfzehn", "sechzehn", "siebzehn", "achtzehn",
            "neunzehn", "zwanzig", "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig", "vierundzwanzig",
            "fünfundzwanzig", "sechsundzwanzig", "siebenundzwanzig", "achtundzwanzig", "neunundzwanzig", "dreiβig"};

    public static void main(String[] args) {
        Converter conv = new Converter();
        String userNumber = "";
        int translatedNumber = -1;
        String chosenLanguage = "";
        System.out.println("What is the number to translate?");
        Scanner sc = new Scanner(System.in);
        try {
            userNumber = sc.nextLine();
            translatedNumber = Integer.parseInt(userNumber);
            System.out.println("translated number " + translatedNumber);
        } catch (Exception e) {
            System.out.println("Error in picking number: " + e);
        }
        System.out.println("What language do you want to translate to? German or French");
        try {
            chosenLanguage = sc.nextLine();
            if (chosenLanguage.equalsIgnoreCase("German")) {
                System.out.println("You have chosen German");
            } else if (chosenLanguage.equalsIgnoreCase("French")) {
                System.out.println("You have chosen French");
            } else {
                System.out.println("Not valid. Enter German or french");
            }
        } catch (Exception e) {
            System.out.println("Error in picking language: " + e);
        }
        if(conv.convert(translatedNumber,chosenLanguage) != null){
            System.out.println("translated to: " + conv.convert(translatedNumber,chosenLanguage));
        }
        else{
            System.out.println("Invalid input");
        }

//        try{
//            if (chosenLanguage.equalsIgnoreCase("French")) {
//                System.out.println(translatedNumber + " translated to french: " + frenchNumbers[translatedNumber -1]);
//            }
//            if (chosenLanguage.equalsIgnoreCase("German")) {
//                System.out.println(translatedNumber + " translated to german: " + germanNumbers[translatedNumber -1]);
//            }
//        }catch (Exception e){
//            System.out.println("Error in translation: " + e);
//        }

    }






    }

