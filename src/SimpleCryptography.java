/**
 * Created by daftnemesis on 16/08/15.
 */
public class SimpleCryptography {

    public static void main(String[] args) {

        int number = 5478;

        //           2145
        //           4521

        System.out.println("Number to encrypt: " + number);

        int numberEncrypted = encrypted(convertNumber(number));
        System.out.println("Number encrypted: " + numberEncrypted);

        int numberDeEncrypted = deCrypt(unConvertNumber(numberEncrypted));
        System.out.println("Number decrypted: " + numberDeEncrypted);
    }

    public static int encrypted(int number){
        int numberEncrypted = 0;

        int lastDigit = number % 10;
        numberEncrypted = lastDigit * 100 + numberEncrypted;
        number = number / 10;

        lastDigit = number % 10;
        numberEncrypted = lastDigit * 1000 + numberEncrypted;
        number = number / 10;

        lastDigit = number % 10;
        numberEncrypted = lastDigit * 1 + numberEncrypted;
        number = number / 10;

        lastDigit = number % 10;
        numberEncrypted = lastDigit * 10 + numberEncrypted;
        number = number / 10;

        return numberEncrypted;

    }

    public static int convertNumber(int number) {
        int numberConverted = 0;
        int multi = 10;

        int lastDigit = number % 10;
        numberConverted = (lastDigit + 7) % 10 + numberConverted;
        number = number / 10;

        while (number > 0) {
            lastDigit = number % 10;
            numberConverted = (lastDigit + 7) % 10 * multi + numberConverted;
            number = number / 10;
            multi *= 10;
        }
        return numberConverted;
    }

    public static int deCrypt(int number){
        int numberDecrypted = 0;

        int lastDigit = number % 10;
        numberDecrypted = lastDigit * 100 + numberDecrypted;
        number = number / 10;

        lastDigit = number % 10;
        numberDecrypted = lastDigit * 1000 + numberDecrypted;
        number = number / 10;

        lastDigit = number % 10;
        numberDecrypted = lastDigit * 1 + numberDecrypted;
        number = number / 10;

        lastDigit = number % 10;
        numberDecrypted = lastDigit * 10 + numberDecrypted;
        number = number / 10;

        return numberDecrypted;
    }

    public static int unConvertNumber(int number){
        int uncovertedNumber = 0;
        int mult = 10;

        int lastDigit = number % 10;
        uncovertedNumber = lastDigit + 10 - 7 + uncovertedNumber;
        number = number / 10;

        while (number > 0){
            lastDigit = number % 10;
            uncovertedNumber = ((lastDigit + 10 - 7) * mult)+ uncovertedNumber ;
            number = number / 10;
            mult *= 10;
        }


        return uncovertedNumber;
    }
}
