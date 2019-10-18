package skeleton.answers;

public class Question5 {
    public static int selfpreservation(Integer[] input) {
        // TODO Auto-generated method stub
        int start = input[0];
        int threat = 0;
        for(int i = 1; i < input.length - 1; i++){
            if(threat == 0){
                if(input[i] == input[i + 1){
                    threat = i;
                }
            }
            else{
                if(input[i] > threat){
                    if(i < input.length - 2){
                        if(input[i + 1] == input[i + 2]{
                            threat = input[i];
                        }
                    }
                }
            }
        }
        
        return threat;
    }
}
