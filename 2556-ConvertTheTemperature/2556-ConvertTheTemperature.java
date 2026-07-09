// Last updated: 09/07/2026, 15:06:15
class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[]=new double[2];
        ans[0]=celsius + 273.15;
        ans[1]=celsius * 1.80+32.00;
        return ans;
        
    }
}