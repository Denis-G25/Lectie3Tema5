
public class Suma {
    
    public static String suma(String a, String b) {
        int rezultat = Integer.parseInt(a) + Integer.parseInt(b);
        return String.valueOf(rezultat);
    }

   
    public static String suma(String a, String b, String c) {
        int rezultat = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c);
        return String.valueOf(rezultat);
    }

    
    public static String suma(String a, String b, String c, String d) {
        int rezultat = Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c) + Integer.parseInt(d);
        return String.valueOf(rezultat);
    }

public String toString() {
        return "Aceasta este clasa Suma, care calculează sume de numere.";
    
}
