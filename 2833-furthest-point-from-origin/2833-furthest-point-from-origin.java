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

        return count1 + Math.abs(count3 - count2);
    }
}