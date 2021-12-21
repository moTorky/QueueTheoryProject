
package queueproject;
public class queueDD1k {
    private double Mu , Lambda;

    public queueDD1k(double Lambda, double Mu) {
        this.Mu = Mu;
        this.Lambda = Lambda;
    }
    public queueDD1k(){      
    }
    
    public int getNUmberOgCustomersAtTimeT(int time){
        int numberOfCustomer;
        numberOfCustomer = ((int)(this.Lambda * time)) - (int)((this.Mu * time) - (this.Mu / this.Lambda));
        return numberOfCustomer;
    }
    
    
}
