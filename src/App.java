import java.util.Random;
public class App {
    public static void main(String[] args) {
        Random r = new Random();
        String alphas = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
        String pass = "";
        int alphaSize = alphas.length();
        int pwSize = 10;
        for (int i=1; i<=pwSize; i++){
            pass = pass + alphas.charAt(r.nextInt(alphaSize));
        }   
        System.out.println(pass);     
    }
}
