import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String message = "Today, whether is amazing!";

        System.out.println(message);
/*
        System.out.println("Number of element: " + message.length());
        System.out.println("5. element: " + message.charAt(4));
        System.out.println(message.concat(" Yeay!"));
        System.out.println(message.startsWith("t"));
        System.out.println(message.endsWith("!"));
        char [] characters = new char[5];

        message.getChars(0,5, characters, 0);
        System.out.println(characters);

        System.out.println(message.indexOf("ay"));
        System.out.println(message.lastIndexOf("a"));*/

        String newMessage = message.replace(' ', '-');
        System.out.println(newMessage);

        System.out.println(message.substring(2, 4));

        for (String kelime : message.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}
