import java.util.Scanner;

public class IT24103913Lab3Q1B {

    public static void main(String[] args) {
        double pricePerKg, quantity, totalAmount, discount, amountAfterDiscount;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        pricePerKg = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = input.nextDouble();

        totalAmount = pricePerKg * quantity;

        // Calculate discount (10% of totalAmount)
        discount = totalAmount * 0.10;

        // Calculate amount after discount
        amountAfterDiscount = totalAmount - discount;

    
        System.out.print("The total amount with 10% discount is:" + amountAfterDiscount);

    }
}
