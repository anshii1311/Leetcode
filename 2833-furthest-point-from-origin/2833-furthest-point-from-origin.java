class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int sum = 0;
        int count1 = 0;
        int count2 = 0 ;
        int count3 = 0 ;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == '_') {
                count1++;
            }
            else if(moves.charAt(i) == 'L'){
                count2++;
            }
            else{
                count3++;
            }
        }

        if(count2 == count3){
            sum = sum + Math.abs(count1);
        }
        else if(count2 > count3){
            sum = sum + Math.abs(count2 + count1 -count3);
        
        }
        else{
            sum = sum + Math.abs(count3 + count1 - count2);
        }
        
        return sum ;
    }
}