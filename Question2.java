package skeleton.answers;
import java.util.Arrays;

public class Question2 {

    public static int riskAndReward(int[] risk, int[] bonus, int[] trader) {
        // TODO Auto-generated method stub
        int max = 0;
        for(int i = 0; i < bonus.length; i++){
            if(bonus[i] > max){
                max = bonus[i];
            }
        }
        
        max = max * trader.length;
        return max;
    }
}
