class Solution {
    public static double myPow(double x, int n) {
         if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        long N =n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return myPow2(x , N);
    }
    public static double myPow2(double x , long n){
         if(n==0){
            return 1;
        }
        double half = myPow2(x,n/2);
        if(n%2==0){
            return half*half;
        }
    else{
        return half*half*x;
    }
        
    

        
    }
