package nz.ac.eit;

public class Converter {
    String[] frenchNumbers = {"un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf",
            "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf",
            "vingt", "vingt et un", "vingt-deux", "vingt-trois", "vingt-quatre", "vingt-cinq", "vingt-six",
            "vingt-sept", "vingt-huit", "vingt-neuf", "trente"};

    String[] germanNumbers = {"einz", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun",
            "zehn", "elf", "zwolf", "dreizehn", "vierzehn", "funfzehn", "sechzehn", "siebzehn", "achtzehn",
            "neunzehn", "zwanzig", "einundzwanzig", "zweiundzwanzig", "dreiundzwanzig", "vierundzwanzig",
            "fünfundzwanzig", "sechsundzwanzig", "siebenundzwanzig", "achtundzwanzig", "neunundzwanzig", "dreiβig"};

    public String convert(int number, String chosenLanguage){
    try {
        if (chosenLanguage.equalsIgnoreCase("French")) {
            return frenchNumbers[number - 1];
        }
        if (chosenLanguage.equalsIgnoreCase("German")) {
            return germanNumbers[number - 1];
        }
        return null;
    }catch(Exception e){
        return null;
    }
    }


}
