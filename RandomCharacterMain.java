import java.util.Random; //Random Library

public class RandomCharacterMain {

    public static void main(String[] args) {
        // Strings to store the generated random values
        String lowerCaseLetters = "";
        String upperCaseLetters = "";
        String numbChars = "";
        String chars = "";
        // Initialize the RandomCharacter class
        RandomCharacterMain randchar = new RandomCharacterMain();

        // For loop to get random lower case characters
        for(int i = 0; i < 15; i++) {
            char numb = randchar.getRandomDigitCharacter();
            // Check ascii value is prime, append to string
            if(randchar.checkPrime(numb)) {
                numbChars += numb+"(prime) ";
            } else {
                numbChars += numb+"(not-prime) ";
            }

            char character = randchar.getRandomCharacter();
            // Check ascii value is prime, append to string
            if(randchar.checkPrime(character)) {
                chars += character+"(prime) ";
            } else {
                chars += character+"(not-prime) ";
            }

            char lower = randchar.getRandomLowerCaseLetter();
            // Check ascii value is prime, append to string
            if(randchar.checkPrime(lower)) {
                lowerCaseLetters += lower+"(prime) ";
            } else {
                lowerCaseLetters += lower+"(not-prime) ";
            }
            
            char upper = randchar.getRandomUpperCaseLetter();
            // Check ascii value is prime, append to string
            if(randchar.checkPrime(upper)) {
                upperCaseLetters += upper+"(prime) ";
            } else {
                upperCaseLetters += upper+"(not-prime) ";
            }
        }

        // Prints out the generated random characters
        System.out.println("Random lower case letters: " + lowerCaseLetters);
        System.out.println("Random upper case letters: " + upperCaseLetters);
        System.out.println("Random digit characters: " + numbChars);
        System.out.println("Random characters: " + chars);
    }

    // Function to get a random lower case letter 
    public char getRandomLowerCaseLetter() {
        Random r = new Random();
        //ascii value of 97('a') to 122('z')
        return (char)(r.nextInt(122-97) + 97);
    }

    // Function to get a random upper case letter
    public char getRandomUpperCaseLetter() {
        Random r = new Random();
        //ascii value of 65('A') to 90('Z')
        return (char)(r.nextInt(90-65) + 65);
    }

    // Function to get a random digit character
    public char getRandomDigitCharacter() {
        Random r = new Random();
        //ascii value of 48('0') to 57('9')
        return (char)(r.nextInt(57-48) + 48);
    }

    // Function to get a random character
    public char getRandomCharacter() {
        Random r = new Random();
        //ascii value of 33('!') to 126('~')
        return (char)(r.nextInt(126-33) + 33);
    }

    // Function to check if the ascii value of a character is a prime number
    public boolean checkPrime(char c) {
        // Get the ascii value of the character
        int asciiValue = (int)c;
        // For loop to check if it is a prime number
        for (int i = 2; i <= asciiValue / 2; i++) {
            if (asciiValue % i == 0) {
                // Return false if the ascii value is divisible, which means it is not prime
                return false;
            }
        }
        // Return true if the ascii value is not divisible by any number, which means it is prime
        return true;
    }
}