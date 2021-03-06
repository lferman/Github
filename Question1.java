package skeleton.answers;
import java.util.Arrays;

public class Question1 {

    public static double calculateTotalPayment(double initialLevelOfDebt, double interestPercentage, double repaymentPercentage) {
        // TODO Auto-generated method stub
        int debtAfterInterestApplied = initialLevelOfDebt + (initialLevelOfDebt*(interestPercentage/100));
        int debtAfterRepaymentApplied = debtAfterInterestApplied - (initialLevelOfDebt*(repaymentPercentage/100));
        int totalAmountSpent = initialLevelOfDebt*(repaymentPercentage/100);
  
        while(debtAfterRepaymentApplied > 50){
            debtAfterInterestApplied = debtAfterRepaymentApplied + (debtAfterRepaymentApplied*(interestPercentage/100));
            debtAfterRepaymentApplied = debtAfterInterestApplied - (debtAfterRepaymentApplied*(repaymentPercentage/100));
            totalAmountSpent = initialLevelOfDebt*(repaymentPercentage/100);
        }
  
        int finalRepayment = debtAfterRepaymentApplied;
        int deposit = initialLevelOfDebt * .10;
        int finalAnswer = totalAmountSpent + debtAfterRepaymentApplied + deposit;
  
        return finalAnswer;
    }

}
