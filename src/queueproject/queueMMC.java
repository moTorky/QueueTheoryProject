package queueproject;

public class queueMMC {

    private double lamda;
    private double meyo;
    private double r;
    private double c;
    private double row;
    private double Po;
    private double l;
    private double lq;
    private double w;
    private double wq;
    private double ci;

    public queueMMC() {
    }

    //The Constractor...
    public queueMMC(double lamda, double meyo, double c) {
        this.lamda = lamda;
        this.meyo = meyo;
        this.c = c;
        this.r = this.lamda / this.meyo;
        this.row = this.r / this.c;
    }

    // Getting The value of Pk To M/M/c Case
    public double getPo() {
        double sum = 0, fact = 1, factt = 1;
        if (row < 1) {
            for (int i = 1; i <= this.c - 1; i++) {
                factt = factt * i;
                sum += (Math.pow(this.r, i) / factt);
            }
            for (int i = 1; i <= this.c; i++) {
                fact = fact * i;
            }
            Po = sum + ((this.c * Math.pow(r, c)) / (fact * (this.c - this.r)));
        } else {
            for (int i = 1; i <= this.c - 1; i++) {
                factt = factt * i;
                sum += (Math.pow(this.r, i) / factt);
            }
            for (int i = 1; i <= this.c; i++) {
                fact = fact * i;
            }
            double part = (this.c * this.meyo) / ((this.c * this.meyo) - this.lamda);
            Po = sum + ((1 / fact) * Math.pow(r, c) * part);
        }
        return 1 / Po;
    }

    // Getting The value of "Lq" To M/M/c Case
    public double getLq() {
        int fact = 1;
        for (int i = 1; i <= this.c - 1; i++) {
            fact = fact * i;
        }
        double part1 = Math.pow(r, c) * this.lamda * this.meyo;
        double part2 = fact * Math.pow(((c * meyo) - lamda), 2);
        lq = getPo() * (part1 / part2);

        return lq;
    }

    // Getting The value of "Wq" To M/M/c Case
    public double getWq() {
        this.wq = getLq() / this.lamda;
        return wq;
    }

    // Getting The value of "W" To M/M/c Case
    public double getW() {
        this.w = (getLq() / this.lamda) + (1 / this.meyo);
        return w;
    }

    // Getting The value of "L" To M/M/c Case
    public double getL() {
        this.l = getLq() + (this.lamda / this.meyo);
        return l;
    }

    // Getting value of The Avarge Number of Idle serrver "Ci"...
    public double getCi() {
        this.ci = this.c - this.r;
        return ci;
    }

}
