package nz.ac.eit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static String[] frenchNumbers = {"un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf",
            "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf",
            "vingt", "vingt et un", "vingt-deux", "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six",
            "vingt-sept", "vingt-huit", "vingt-neuf", "trente"};

    static String[] germanNumbers = {"eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun",
            "zehn", "elf", "zwolf", "dreizehn", "vierzehn", "funfzehn", "sechzehn", "siebzehn", "achtzehn",
            "neunzehn", "zwanzig", "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig", "vierundzwanzig",
            "fünfundzwanzig", "sechsundzwanzig", "siebenundzwanzig", "achtundzwanzig", "neunundzwanzig", "dreiβig"};

    public static void main(String[] args) {
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

        try {
            if (chosenLanguage.equalsIgnoreCase("French")) {
                switch (translatedNumber) {
                    case 1: {
                        System.out.println("1 translated to French: " + frenchNumbers[0]);
                        break;
                    }
                    case 2: {
                        System.out.println("2 translated to French: " + frenchNumbers[1]);
                        break;
                    }
                    case 3: {
                        System.out.println("3 translated to French: " + frenchNumbers[2]);
                        break;
                    }
                    case 4: {
                        System.out.println("4 translated to French: " + frenchNumbers[3]);
                        break;
                    }
                    case 5: {
                        System.out.println("5 translated to French: " + frenchNumbers[4]);
                        break;
                    }
                    case 6: {
                        System.out.println("6 translated to French: " + frenchNumbers[5]);
                        break;
                    }
                    case 7: {
                        System.out.println("7 translated to French: " + frenchNumbers[6]);
                        break;
                    }
                    case 8: {
                        System.out.println("8 translated to French: " + frenchNumbers[7]);
                        break;
                    }
                    case 9: {
                        System.out.println("9 translated to French: " + frenchNumbers[8]);
                        break;
                    }
                    case 10: {
                        System.out.println("10 translated to French: " + frenchNumbers[9]);
                        break;
                    }
                    case 11: {
                        System.out.println("11 translated to French: " + frenchNumbers[10]);
                        break;
                    }
                    case 12: {
                        System.out.println("12 translated to French: " + frenchNumbers[11]);
                        break;
                    }
                    case 13: {
                        System.out.println("13 translated to French: " + frenchNumbers[12]);
                        break;
                    }
                    case 14: {
                        System.out.println("14 translated to French: " + frenchNumbers[13]);
                        break;
                    }
                    case 15: {
                        System.out.println("15 translated to French: " + frenchNumbers[14]);
                        break;
                    }
                    case 16: {
                        System.out.println("16 translated to French: " + frenchNumbers[15]);
                        break;
                    }
                    case 17: {
                        System.out.println("17 translated to French: " + frenchNumbers[16]);
                        break;
                    }
                    case 18: {
                        System.out.println("18 translated to French: " + frenchNumbers[17]);
                        break;
                    }
                    case 19: {
                        System.out.println("19 translated to French: " + frenchNumbers[18]);
                        break;
                    }
                    case 20: {
                        System.out.println("20 translated to French: " + frenchNumbers[19]);
                        break;
                    }
                    case 21: {
                        System.out.println("21 translated to French: " + frenchNumbers[20]);
                        break;
                    }
                    case 22: {
                        System.out.println("22 translated to French: " + frenchNumbers[21]);
                        break;
                    }
                    case 23: {
                        System.out.println("23 translated to French: " + frenchNumbers[22]);
                        break;
                    }
                    case 24: {
                        System.out.println("24 translated to French: " + frenchNumbers[23]);
                        break;
                    }
                    case 25: {
                        System.out.println("25 translated to French: " + frenchNumbers[24]);
                        break;
                    }
                    case 26: {
                        System.out.println("26 translated to French: " + frenchNumbers[25]);
                        break;
                    }
                    case 27: {
                        System.out.println("27 translated to French: " + frenchNumbers[26]);
                        break;
                    }
                    case 28: {
                        System.out.println("28 translated to French: " + frenchNumbers[27]);
                        break;
                    }
                    case 29: {
                        System.out.println("29 translated to French: " + frenchNumbers[28]);
                        break;
                    }
                    case 30: {
                        System.out.println("30 translated to French: " + frenchNumbers[29]);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error in french translation: " + e);
        }
               try {
                   if (chosenLanguage.equalsIgnoreCase("German")) {
                       switch (translatedNumber) {
                           case 1: {
                               System.out.println("1 translated to German: " + germanNumbers[0]);
                               break;
                           }
                           case 2: {
                               System.out.println("2 translated to German: " + germanNumbers[1]);
                               break;
                           }
                           case 3: {
                               System.out.println("3 translated to German: " + germanNumbers[2]);
                               break;
                           }
                           case 4: {
                               System.out.println("4 translated to German: " + germanNumbers[3]);
                               break;
                           }
                           case 5: {
                               System.out.println("5 translated to German: " + germanNumbers[4]);
                               break;
                           }
                           case 6: {
                               System.out.println("6 translated to German: " + germanNumbers[5]);
                               break;
                           }
                           case 7: {
                               System.out.println("7 translated to German: " + germanNumbers[6]);
                               break;
                           }
                           case 8: {
                               System.out.println("8 translated to German: " + germanNumbers[7]);
                               break;
                           }
                           case 9: {
                               System.out.println("9 translated to German: " + germanNumbers[8]);
                               break;
                           }
                           case 10: {
                               System.out.println("10 translated to German: " + germanNumbers[9]);
                               break;
                           }
                           case 11: {
                               System.out.println("11 translated to German: " + germanNumbers[10]);
                               break;
                           }
                           case 12: {
                               System.out.println("12 translated to German: " + germanNumbers[11]);
                               break;
                           }
                           case 13: {
                               System.out.println("13 translated to German: " + germanNumbers[12]);
                               break;
                           }
                           case 14: {
                               System.out.println("14 translated to German: " + germanNumbers[13]);
                               break;
                           }
                           case 15: {
                               System.out.println("15 translated to German: " + germanNumbers[14]);
                               break;
                           }
                           case 16: {
                               System.out.println("16 translated to German: " + germanNumbers[15]);
                               break;
                           }
                           case 17: {
                               System.out.println("17 translated to German: " + germanNumbers[16]);
                               break;
                           }
                           case 18: {
                               System.out.println("18 translated to German: " + germanNumbers[17]);
                               break;
                           }
                           case 19: {
                               System.out.println("19 translated to German: " + germanNumbers[18]);
                               break;
                           }
                           case 20: {
                               System.out.println("20 translated to German: " + germanNumbers[19]);
                               break;
                           }
                           case 21: {
                               System.out.println("21 translated to German: " + germanNumbers[20]);
                               break;
                           }
                           case 22: {
                               System.out.println("22 translated to German: " + germanNumbers[21]);
                               break;
                           }
                           case 23: {
                               System.out.println("23 translated to German: " + germanNumbers[22]);
                               break;
                           }
                           case 24: {
                               System.out.println("24 translated to German: " + germanNumbers[23]);
                               break;
                           }
                           case 25: {
                               System.out.println("25 translated to German: " + germanNumbers[24]);
                               break;
                           }
                           case 26: {
                               System.out.println("26 translated to German: " + germanNumbers[25]);
                               break;
                           }
                           case 27: {
                               System.out.println("27 translated to German: " + germanNumbers[26]);
                               break;
                           }
                           case 28: {
                               System.out.println("28 translated to German: " + germanNumbers[27]);
                               break;
                           }
                           case 29: {
                               System.out.println("29 translated to German: " + germanNumbers[28]);
                               break;
                           }
                           case 30: {
                               System.out.println("30 translated to German: " + germanNumbers[29]);
                               break;
                           }
                       }
                   }
               }
                catch (Exception e) {
                System.out.println("Error in german translation: " + e);
                }
    }






    }

