package Strings;

public class StringBasics {
    public static void main(String[] args) {
    String name="My name is Hiba";

    //To get length of the String
    System.out.println("length of the String: " + name.length());

    //To know which char is at i place
    System.out.println("Char is at 1 place: " + name.charAt(1));
    
    //To convert the characters in lower/upper characters
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());

    //Substring a part of the substring is printed
    System.out.println(name.substring(0, 7));

    //gives true or false
    //To check whether it starts with i or not
    System.out.println(name.startsWith("is"));
    //To check whether it ends with i or not
    System.out.println(name.endsWith("My"));

    //String converted into char Array
    char[] crr = name.toCharArray();
    for(char ch : crr){
        System.out.println("Value of char:" + ch);
    }

    //to check if it contains the specific word or not
    System.out.println(name.contains("Hiba"));

    //To check if the String is empty
    System.out.println(name.isEmpty());

    //To check if the String is empty or have spaces
    System.out.println(name.isBlank());System.out.println("");
    }
}
