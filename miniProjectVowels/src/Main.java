public class Main {

    public static void main(String[] args) {
	char letter = 'K';

    switch (letter){
        case 'A':
        case 'U':
        case 'I':
        case 'O':
        case 'E':
            System.out.println("The letter is vowel.");
            break;
        default:
            System.out.println("The letter is consonant.");
    }
    }
}
