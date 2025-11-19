package review_and_labs.chapter_3;

import java.util.Scanner;

public class loan_qualification_system {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loanType, creditScore, annualIncome;

        System.out.print("Enter loan type (1-Personal, 2-Auto, 3-Home)\n> ");
        loanType = scan.nextInt();

        System.out.print("Enter Credit Score (600 Minimum)\n> ");
        creditScore = scan.nextInt();

        System.out.print("Enter Annual Income (30,000 Minimum)\n> ");
        annualIncome = scan.nextInt();

        LoanAccount account = new LoanAccount(loanType, creditScore, annualIncome);

        System.out.println("\nLoan type: " + ((loanType == 1) ? "Personal" : (loanType == 2) ? "Auto" : "Home") + "\nCredit Score: " + creditScore + "\nAnnual Income: " + annualIncome);
        account.checkQualification();

        scan.close();
    }
}
