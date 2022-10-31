import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 6 month min saving
        // no criminal record

        // 25 %-> saving
        // loan amount
        // collateral-> substitute
        // year to return
        // interest 15%
        // account(saving amount) balance
        Scanner input = new Scanner(System.in);


        System.out.println("Dear Sr/Madam Welcome to our Micro Finance Institute");

        System.out.println("please insert your name ");
        String customerName = input.nextLine();



        System.out.println("Dear "+ customerName+"do you have any criminal record ? yes/no ");
        String criminalRecordStatus = input.nextLine();

        System.out.println("Dear "+ customerName+" have you been a member for 6 months ? yes/no ");
        String membershipStatus = input.nextLine();

        if(criminalRecordStatus.equalsIgnoreCase("no") && membershipStatus.equalsIgnoreCase("yes")) {
            System.out.println("Dear " + customerName + "please insert your saving amount ?");
            float savingAmount = input.nextFloat();

            System.out.println("Dear " + customerName + "please insert your loan amount in Br ");

            float loanAmount = input.nextFloat();

            if ((0.25*loanAmount)<=savingAmount) {

                System.out.println("Dear " + customerName + " please insert the number of years to return the loan ? ");

                float loanReturnYears = input.nextInt();

                System.out.println("Dear " + customerName + "do you have any collaterals or are you planing to buy an asset an hold it as a collateral ?");

                System.out.println("please press 1 if you have any collaterals ");
                System.out.println("please press 2 if you want to collateralize the asset you want to buy ? ");
                System.out.println("please press 3 if you don't agree with our plans  ");

                int collateralStatus = input.nextInt();
                String loanWithIntrest = "your total loan amount plus the interest rate is " + ((loanAmount) + ((loanAmount * 0.15) * loanReturnYears));

//                if(collateralStatus == 1 || collateralStatus == 2){
//
//                    System.out.println(loanWithIntrest);
//                    System.out.println("the interest "+ ((loanAmount*0.15)* loanReturnYears));
//                }
//                else
//                    System.out.println("our bank policy doesn't support a loan without collaterals");

                //datatype varName = (condition) ? true datatypeOutput:false datatypeOutput

                String output = (collateralStatus == 1 || collateralStatus == 2) ?
                        loanWithIntrest :"our bank policy doesn't support a loan without collaterals";
                System.out.println(output);


            }
            else{
                System.out.println("please try again, you can tak a loan up to" +(savingAmount*4));
            }

        }

        else{
            System.out.println("our bank policy doesn't support a loan with criminal records ");
        }



















    }
}