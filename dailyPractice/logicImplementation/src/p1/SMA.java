package p1;

import java.util.LinkedList;
import java.util.Queue;

public class SMA {

    // queue used to store list so that we get the average
    private final Queue<Double> q
            = new LinkedList<Double>();
    private final int period;
    private double sum;
    SMA(int period)
    {
        this.period = period;
    }
    // function to add new data in the list and update the sum so that we get the new mean
    public void addData(double num)
    {
        sum += num;
        q.add(num);

        // Updating size so that length of data set should be equal to period as a normal mean has
        if (q.size() > period) {
            sum -= q.remove();
        }
    }
    // function to calculate mean
    public double getMean() { return sum / period; }

    public static void main(String[] args)
    {
        double[] input
                = { 1, 3, 5, 6, 8 };
        int k = 3;

        SMA a = new SMA(k);

        for (double x : input) {
            a.addData(x);
            System.out.println( String.format("%.2f",a.getMean()));
        }
    }
}
