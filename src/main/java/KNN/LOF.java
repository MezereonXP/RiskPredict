package KNN;

import java.util.ArrayList;

public class LOF {
    private int k;

    public LOF(int k) {
        this.k = k;
    }

    public double getLOF(double[][] knn, double[] x){
        double sum = 0;
        for (double[] o:knn){
            sum += getLocDens(knn, o)/getLocDens(knn, x);
        }
        return sum/k;
    }



    public double getLocDens(double[][] knn, double[] x){
        double[] nnk = findKthPoint(knn, x);

        double sum = 0;
        for (double[] o:knn){
            sum += reachDist(o, x, nnk);
        }
        return sum/k;
    }

    public double[] findKthPoint(double[][] knn, double[] x) {

        ArrayList list = new ArrayList();
        for (int i=0;i<knn.length;i++){
           list.add(knn[i]);
        }
        int index = 0;
        double minDist = dist(knn[0],x);

        for (int i=0;i<k;i++){
            index = 0;
            minDist = dist((double[]) list.get(0),x);
            for (int j=0;j<list.size();j++){
                if (minDist>dist((double[])list.get(j),x)){
                    minDist = dist((double[])list.get(j),x);
                    index = j;
                }
            }
            if (i!=k-1)
                list.remove(index);
        }

        return (double[])list.get(index);
    }

    public double reachDist(double[] o, double[] x, double[] nnk){
        return Math.max(dist(o,x),dist(nnk,x));
    }

    private double dist(double[] nnk, double[] x) {

        double sum = 0;
        for (int i=0;i<nnk.length;i++){
            sum += (nnk[i]-x[i])*(nnk[i]-x[i]);
        }

        return Math.sqrt(sum);
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
