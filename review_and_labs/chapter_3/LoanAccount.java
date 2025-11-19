package review_and_labs.chapter_3;

public class LoanAccount {
    public static final int minPersonalCred = 600;
    public static final int minAutoCred = 650;
    public static final int minHomeCred = 700;

    public static final int minPersonalIncome = 30000;
    public static final int minAutoIncome = 40000;
    public static final int minHomeIncome = 60000;

    int loanType;
    int creditScore;
    int annualIncome;

    public LoanAccount(int loanType, int creditScore, int annualIncome) {
        this.loanType = loanType;
        this.creditScore = creditScore;
        this.annualIncome = annualIncome;
    }

    /* GET */
    public int getLoanType() {
        return loanType;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    /* SET */

    /* CHECKS */
    public boolean checkQualification() {
        switch (loanType) {
            case 1:
                if (creditScore >= ((minPersonalCred * .2) + minPersonalCred) && annualIncome >= ((minPersonalIncome * .2) + minPersonalIncome)) {
                     System.out.println("Approved with Preferred Rate"); 
                     return true;
                }
                else if (creditScore >= minPersonalCred && annualIncome >= minPersonalIncome){
                     System.out.println("Approved with Standard Rate"); 
                     return true;
                }
                else { 
                     System.out.println("You do not qualify..."); 
                    return false;
                }
            case 2:
                if (creditScore >= ((minAutoCred * .2) + minAutoCred) && annualIncome >= ((minAutoIncome * .2) + minAutoIncome)) {
                     System.out.println("Approved with Preferred Rate"); 
                     return true;
                }
                else if (creditScore >= minAutoCred && annualIncome >= minAutoIncome){
                     System.out.println("Approved with Standard Rate"); 
                     return true;
                }
                else { 
                     System.out.println("You do not qualify..."); 
                    return false;
                }
            case 3:
                if (creditScore >= ((minHomeCred * .2) + minHomeCred) && annualIncome >= ((minHomeIncome * .2) + minHomeIncome)) {
                     System.out.println("Approved with Preferred Rate"); 
                     return true;
                }
                else if (creditScore >= minHomeCred && annualIncome >= minHomeIncome){
                     System.out.println("Approved with Standard Rate"); 
                     return true;
                }
                else { 
                     System.out.println("You do not qualify..."); 
                    return false;
                }
            default:
                return false;
        }
    }
}