// Last updated: 09/07/2026, 15:06:07
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime){
        int time=arrivalTime + delayedTime;
        if (time>24){
            time=time%24;
        
        }
        if(time==24){
            return 0;

        }else{
            return time;
        }
    }
}