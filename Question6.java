package skeleton.answers;
import java.util.Arrays;
import java.lang.String;

public class Question6 {

    public static int startingAndEndingWell(String[] portfolio, String start, String end) {
        // TODO Auto-generated method stub
        for(int i = portfolio.length - 1; i >= 0; i--){
            if(portfolio[i].startsWith(start) && portfolio[i].endsWith(end)){
                return i;
            }
        }
    }
}
