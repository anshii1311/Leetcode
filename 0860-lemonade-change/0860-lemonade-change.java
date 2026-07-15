class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills){
            if(bill==5){
                five=five+1;
            }
            else if(bill==10){
                if(five>0){
                    ten = ten + 1;
                    five = five - 1;
                }else{
                    return false;
                }
            }
            else{
                if(ten>0 && five>0){
                    ten=ten-1;
                    five=five-1;
                }
                else if(five>=3){
                    five=five-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}