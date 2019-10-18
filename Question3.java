package skeleton.answers;
import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {

    public static int whereDidIFinish(int[] scores, int[] alice) {
        // TODO Auto-generated method stub
        List<Integers> ranks = new ArrayList<Integer>();
        int track = 1;
        for(int j = 0; j < alice.length; j++){
            for(int i = 0; i < scores.length; i++){
                if(i <= scores.length - 2){
                    if((scores[i] > alice[i]) && (scores[i + 1] < alice[i])){
                        ranks.add(track);
                        track = 1;
                    }
                    else if(scores[i] > alice[i]){
                        track++;
                    }
                }
                if(scores[i] == scores[scores.length - 1]){
                    ranks.add(track);
                    track = 1;
                }
            }
        
        }
        
        int mode = 0;
        
        for(int i = 0; i < ranks.size() - 1; i++){
            if(ranks.get(i) == ranks.get(i + 1)){
                mode = ranks.get(i);
            }
        }
        
        return mode;
    }
}
