import java.util.Scanner;

public class TempConvert1 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double cel, far;
        //ask for farenheit 
        System.out.print("Enter degrees F -> ");
        far = s.nextDouble();
        //calculate celsius
        cel = (far - 32) * 5.0/9.0;
        //print the answer
        System.out.println(String.format("%.2f F = %.2f C",far,cel));
        System.out.println(far + " F = " + cel + " C"); //not as good but another wat
    }
    
}
