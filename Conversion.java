
import java.util.Scanner;
public class Conversion
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String dollar = "$";
        String euro = "€";
        String pound = "₤" ;
        String yen = "¥";
        int outType = 0;
        double inAmount = 0;
        int inputType = 0;
        boolean valid = true;
        String currency = "";
        System.out.println("Welcome to the Currency Converter Program");
        System.out.println("Use the folling codes to input your currency choices");
        System.out.println("1 - US Dollars");
        System.out.println("2 - Euros");
        System.out.println("3 - British Pounds");
        System.out.println("4 - Japanese Yen");
        System.out.print("Please choose the input currency >> ");
        if (in.hasNextInt()) {
            inputType = in.nextInt();
        } else {
            in.next();   // get the inputted non integer from scanner
            inputType = 0;
        }

        while (inputType < 1 || inputType > 4) {
            System.out.print("Error -- please enter a value between 1-4 >> ");
            if (in.hasNextInt()) {
                inputType = in.nextInt();
            } else {
                in.next();
                inputType = 0;
            }
        }

     
        System.out.print("Now choose the output currency >> ");
        if (in.hasNextInt()) {
            outType = in.nextInt();
        } else {
            in.next();   // get the inputted non integer from scanner
            outType = 0;
        }

        while (outType < 1 || outType > 4) {
            System.out.print("Error -- please enter a value between 1-4 >> ");
            if (in.hasNextInt()) {
                outType = in.nextInt();
            } else {
                in.next();
                outType = 0;
            }
        }

        if (inputType == 1){
            currency = ("US Dollars");
        }
        else if (inputType == 2){
            currency = ("Euros");
        }
        else if (inputType == 3){
            currency = ("British Pounds");
        }
        else if (inputType == 4){
            currency = ("Japanese Yen");
        }

        System.out.print("Now enter the input in " + currency + " >> ");

        if (in.hasNextDouble()) {
            inAmount = in.nextDouble();
        } else {
            in.next();   // get the inputted non integer from scanner
            inAmount = 0;
        }

        while (inAmount < 1 ) {
            System.out.print("Error -- please enter a value greater than 1 >> ");
            if (in.hasNextDouble()) {
                inAmount = in.nextDouble();
            } else {
                in.next();
                inAmount = 0;
            }
        }
        if(inputType == 1 && outType == 2){
            double us_euro = 0.93;
            double out = inAmount * us_euro;
            System.out.printf( dollar + inAmount + " at a conversion rate of " + us_euro + " Dollars to Euros = " + euro + "%.2f" ,out );
        }
        if(inputType == 1 && outType == 3){
            double us_pound = 0.79;
            double out = inAmount * us_pound;
            System.out.printf( dollar + inAmount + " at a conversion rate of " + us_pound + " Dollars to Pounds = " + pound + "%.2f" ,out );
        }
         if(inputType == 1 && outType == 4){
            double us_yen = 114.41;
            double out = inAmount * us_yen;
            System.out.printf( dollar + inAmount + " at a conversion rate of " + us_yen + " Dollars to Yen = " + yen + "%.2f" ,out );
        }
          if(inputType == 2 && outType == 1){
            double euro_us = 1.07;
            double out = inAmount * euro_us;
            System.out.printf( euro + inAmount + " at a conversion rate of " + euro_us + " Euros to Dollars = " + dollar + "%.2f" ,out );
        }
          if(inputType == 2 && outType == 3){
            double euro_pound = 0.85;
            double out = inAmount * euro_pound;
            System.out.printf( euro + inAmount + " at a conversion rate of " + euro_pound + " Euros to Pounds = " + pound + "%.2f" ,out );
        }
          if(inputType == 2 && outType == 4){
            double euro_yen = 122.75;
            double out = inAmount * euro_yen;
            System.out.printf( euro + inAmount + " at a conversion rate of " + euro_yen + " Euros to Yen = " + yen + "%.2f" ,out );
        }
          if(inputType == 3 && outType == 1){
            double pound_dollar = 1.26;
            double out = inAmount * pound_dollar;
            System.out.printf( pound + inAmount + " at a conversion rate of " + pound_dollar + " Pounds to Dollars = " + dollar + "%.2f" ,out );
        }
         if(inputType == 3 && outType == 2){
            double pound_euro = 1.17;
            double out = inAmount * pound_euro;
            System.out.printf( pound + inAmount + " at a conversion rate of " + pound_euro + " Pounds to Euros = " + euro + "%.2f" ,out );
        }
         if(inputType == 3 && outType == 4){
            double pound_yen = 143.89;
            double out = inAmount * pound_yen;
            System.out.printf( pound + inAmount + " at a conversion rate of " + pound_yen + " Pounds to Yen = " + yen + "%.2f" ,out );
        }
         if(inputType == 4 && outType == 1){
            double yen_dollar = 0.0087;
            double out = inAmount * yen_dollar;
            System.out.printf( yen + inAmount + " at a conversion rate of " + yen_dollar + " Yen to Dollars = " + dollar + "%.4f" ,out );
        }
         if(inputType == 4 && outType == 2){
            double yen_euro = 0.0081;
            double out = inAmount * yen_euro;
            System.out.printf( yen + inAmount + " at a conversion rate of " + yen_euro + " Yen to Euro = " + euro + "%.4f" ,out );
        }
         if(inputType == 4 && outType == 3){
            double yen_pound = 0.0069;
            double out = inAmount * yen_pound;
            System.out.printf( yen + inAmount + " at a conversion rate of " + yen_pound + " Yen to Pounds = " + pound + "%.4f" ,out );
        }
        if (inputType == outType){
            System.out.println("No conversion needed");
        }
        System.out.println("\nThank you for using the Currency Converter Program!");
        
        
       
        
        
            
    }
}
