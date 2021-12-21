package queueproject;

public class queueMMCK {

    private double lamda;
    private double meyo;
    private double c;
    private double k;
    private double r;
    private double row;
    private double pk;
    private double po;
    private double l;
    private double lq;
    private double w;
    private double wq;

    // Empty Constractor
    public queueMMCK() {
    }

    // The Constractor To Enter lamda , meyo , c, k and clac.. r , row ;
    public queueMMCK(double lamda, double meyo, double c, double k) {
        this.lamda = lamda;
        this.meyo = meyo;
        this.c = c;
        this.k = k;
        this.r = this.lamda / this.meyo;
        this.row = this.r / this.c;
    }

    // Gettting THe Value of Po ...
    public double getPo() {
        double fact = 1, factt = 1, sum = 0;
        for (int i = 1; i <= this.c; i++) {
            fact = fact * i;
        }
        for (int i = 1; i <= this.c - 1; i++) {
            factt = factt * i;
            sum += (Math.pow(this.r, i) / factt);
        }
        if (this.row != 1) {
            this.po = sum + ((Math.pow(r, c) / fact) * ((1 - Math.pow(row, ((this.k) - (this.c) + 1))) / (1 - row)));
        } else {
            this.po = sum + ((Math.pow(r, c) / fact) * (this.k - this.c + 1));
        }
        return (1 / this.po);
    }

    // Getting the Value of Lq....
    public double getLq() {
        int fact = 1;
        for (int i = 1; i <= this.c; i++) {
            fact = fact * i;
        }
        double part1 = Math.pow(r, c) * this.row * getPo();
        double part2 = fact * Math.pow(1 - row, 2);
        double part3 = part1 / part2;
        double part4 = 1 - Math.pow(this.row, k - c + 1) - ((1 - this.row) * (k - c + 1) * Math.pow(this.row, k - c));
        this.lq = part3 * part4;
        return this.lq;
    }

    // Getting the value of L ....
    public double getL() {
        double factt = 1, sum = 0;
        for (int i = 1; i <= this.c - 1; i++) {
            factt = factt * i;
            sum += (this.c - i) * (Math.pow(this.r, i) / factt);
        }
        this.l = getLq() + this.c - (sum * getPo());
        return l;
    }

    public double getPk() {
        int fact = 1;
        for (int i = 1; i <= c; i++) {
            fact = fact * i;
        }
        double part = Math.pow(c, k - c) * fact;
        pk = getPo() * (Math.pow(r, k) / part);
        return pk;
    }

    //Getting The Value of W ....
    public double getW() {
        double lamdaDash = this.lamda * (1 - getPk());
        this.w = getL() / lamdaDash;
        return w;
    }

    //Getting The Value of W ....
    public double getWq() {
        double lamdaDash = this.lamda * (1 - getPk());
        this.wq = getLq() / lamdaDash;
        return wq;
    }

}
