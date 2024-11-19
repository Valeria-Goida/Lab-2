import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Введите строку с MAC-кодами.");
     String macAddress = sc.nextLine();
     String macAddressPattern = "([0-9a-fA-F]{2}[:]){5}([0-9a-fA-F]{2})";
     Pattern p = Pattern.compile(macAddressPattern);
     Matcher m = p.matcher(macAddress);
     while(m.find()){
        System.out.println("MAC-адресс: " + m.group());
        }
    }
}
