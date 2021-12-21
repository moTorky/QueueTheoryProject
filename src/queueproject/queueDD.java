package queueproject;

public class queueDD {

    public double lamda ;
    public double meyo ; 
    public double k ;
    public double nt ;
    public double ti ;
    
    public double wq ;
    public double M ;
    

    public queueDD() {
    }

    public queueDD(double lamda, double meyo, double k, double M ,double ti  ) {
        this.lamda = lamda;
        this.meyo = meyo;
        this.k = k;
        this.M  = M ;
        this.ti = ti;
    }

    // Getting the Value of n(t).......0
   public double getNt(double t){
       if( this.lamda > this.meyo ){
           if ( t <= 1 / this.lamda ){
               nt = 0 ;
           }
           else 
               nt = ( this.lamda * t ) - ( (this.meyo * t ) - (this.meyo / this.lamda) ) ;             
           }
                  
       else{
           if( t < this.ti){
           nt = this.M + (t * this.lamda) - ( t * this.meyo) ;
           }
           else{
               nt = 0;
           }
        }
           
       return nt ;
   } 
 
   // Getting the value of Wq....
//   public double getWq(int n){
//       if ( this.lamda > this.meyo ){
//           if( n < lamda * ti  ){
//               this.wq = ( (1 / this.meyo ) - ( 1 / this.lamda ) ) * ( n - 1);
//           }
//           else if (n >= lamda * ti){
//               this.wq = ( (1 / this.meyo ) - ( 1 / this.lamda ) ) * ( lamda*ti  - 2);
//               
//           }
//       }
//       else {
//           this.wq = (this.M - 1) / (2 * this.meyo);
//       }
//       return wq ;
//   }
    
}