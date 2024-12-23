class Solution {
    //private int mod=0.000001;
    public double[] convertTemperature(double celsius) {
        double ans[]=new double[2];
        double kelvin=(celsius+273.15);
        double fh=(celsius * 1.80 + 32.00);
        ans[0]=kelvin;
        ans[1]=fh;
        return ans;
    }
}