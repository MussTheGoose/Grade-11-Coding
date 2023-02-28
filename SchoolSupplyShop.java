import java.text.NumberFormat;

import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        	

        	Scanner inputNum = new Scanner (System.in);

        	NumberFormat money = NumberFormat.getCurrencyInstance();

        	

        	// Description of Program

        	System.out.println("This Program Is Created As A School Supply Shop\n");

        	

        	// Box Price & Weights

        	final double BOXPRICE = 15;

        	final double BOXWEIGHT = 2;

        	final double PENWEIGHTG = 0.05;

        	final double PENCILWEIGHTG = 0.075;

        	

        	// Shop

        	System.out.println("\tShop");

        	System.out.println("Pen Weight: "+ PENWEIGHTG+ "kg");

        	System.out.println("Pencil Weight: "+ PENCILWEIGHTG+ "kg");

        	System.out.println("Max Weight Box: "+ BOXWEIGHT+ "kg, Price Box: "+ money.format(BOXPRICE));

        	

        	System.out.println("\nYou Will Be Charged For Box Only. (The price above is not including tax)");

        	

        	// Input Variables & Questions

        	System.out.print("\nInsert Amount of Items You Would Like To Buy!\n");

        	

        	System.out.print("\nPens: "); // 35

        	int amountPens = inputNum.nextInt();

        	

        	System.out.print("Pencils: "); // 45

        	int amountPencils = inputNum.nextInt();

        	

        	System.out.print("------------------------\n");

        	

        	// Box Calculations

        	double totalWeight = (amountPens * PENWEIGHTG) + (amountPencils * PENCILWEIGHTG); // 5.125

        	double boxesNeeded = (totalWeight/2); // 2.5625

        	int boxesInt = (int) boxesNeeded; // 2

        	double boxesDecimal = 1 - (boxesNeeded % boxesInt); // 0.4375

        	int amountboxes = (int) (boxesNeeded+boxesDecimal); // 3

        	

        	// Cost Calculations

        	double subTotal = amountboxes * BOXPRICE;

        	double tax = subTotal * 0.15;

        	double total = subTotal + tax;

        	

        	// Receipt

        	System.out.println("\tReceipt\n");

        	

        	System.out.println(amountPens+ "x Pen");

        	System.out.println(amountPencils+ "x Pencil");

        	System.out.println(amountboxes+ "x Box\n");

        	

        	System.out.println("Subtotal: "+ money.format(subTotal));

        	System.out.println("Tax 15%");

        	System.out.println("Tax: "+ money.format(tax));

        	System.out.println("Total: "+ money.format(total));

        	

            System.out.print("\nThank You For Being Our Customer!");

    }

}
