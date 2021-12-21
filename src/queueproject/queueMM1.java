package queueproject;

public class queueMM1 {

    private double lamda;
    private double meyo;
    private double l;
    private double lq;
    private double w;
    private double wq;

    public queueMM1() {
    }

    public queueMM1(double lamda, double meyo) {
        this.lamda = lamda;
        this.meyo = meyo;
    }

    public double getL() {
        l = this.lamda / (this.meyo - this.lamda);
        return l;
    }

    public double getLq() {
        lq = (this.lamda * this.lamda) / (this.meyo * (this.meyo - this.lamda));
        return lq;
    }

    public double getW() {
        w = 1 / (this.meyo - this.lamda);
        return w;
    }

    public double getWq() {
        wq = this.lamda / (this.meyo * (this.meyo - this.lamda));
        return wq;
    }

    public void printData() {
        System.out.println("L: " + getL());
        System.out.println("Lq: " + getLq());
        System.out.println("W: " + getW());
        System.out.println("WQ: " + getWq());
    }

}
