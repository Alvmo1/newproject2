package happycoding;
import java.util.*;
public class New {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String productName = "Rice";
        int qty = 0;
        float productPrice = 0.0f;
        float disMiles = 0.0f;
        int fee = 0;
        System.out.println("Enter the quantity:");
        qty = in.nextInt();
        System.out.println("Enter the price:");
        productPrice = in.nextFloat();
        System.out.println("Enter the distance:");
        disMiles = in.nextFloat();

        if (disMiles >= 0 && disMiles <= 4) {
             fee = 2;
        } else if (disMiles >= 5 && disMiles <= 15) {
             fee = 5;
        } else if (disMiles >= 16 && disMiles <= 25) {
             fee = 10;
        } else if (disMiles >= 26 && disMiles <= 50) {
             fee = 15;
        } else if (disMiles > 50) {
             fee = 20;
        }
        double totalPrice = (productPrice * qty) + fee;
        System.out.println("The total price is " + totalPrice);
    }

}

