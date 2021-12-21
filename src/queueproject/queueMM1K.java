package queueproject;

public class queueMM1K {

    private double lamda;
    private double meyo;
    private double row;
    private double k;
    private double Pk;
    private double l;
    private double lq;
    private double w;
    private double wq;

    public queueMM1K() {
    }

    public queueMM1K(double lamda, double meyo, double k) {
        this.lamda = lamda;
        this.meyo = meyo;
        this.k = k;
        this.row = this.lamda / this.meyo;
    }

    public double getPk() {
        if (this.row == 1) {
            this.Pk = 1 / (k + 1);
        } else {
            double part1 = Math.pow(this.row, this.k);
            double part2 = Math.pow(this.row, this.k + 1);
            this.Pk = part1 * ((1 - this.row) / (1 - part2));
        }
        return this.Pk;
    }

    public double getL() {
        if (this.row == 1) {
            this.l = this.k / 2;
        } else {
            double part1 = (1 - (this.k + 1) * Math.pow(this.row, k) + this.k * Math.pow(this.row, k + 1));
            double part2 = ((1 - this.row) * (1 - Math.pow(this.row, k + 1)));

            this.l = this.row * (part1 / part2);
        }
        return this.l;
    }

    public double getW() {
        double part1 = getL();
        double part2 = getPk();
        w = (part1) / ((this.lamda) * (1 - part2));
        return w;
    }

    public double getWq() {
        double part1 = getW();
        this.wq = part1 - (1 / this.meyo);
        return this.wq;
    }

    public double getLq() {
        double part1 = getL();
        double part2 = getPk();
        this.lq = part1 - (this.row * (1 - part2));
        return this.lq;
    }

}
