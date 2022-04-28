package Projects;
import java.lang.Math;
class myClass
{// start class

    public static void main(String[] args) 
    {// start main
        int myInt;
        //myInt = factorial(5);
       // System.out.print(myInt);

        int myInt2;
        myInt2 = algo(5,2);
        System.out.print(myInt2);

    }// end main

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return (n * factorial(n-1));
        }

    }
    public static int algo(int myx, int myn){
        if(myn==0){
            return 1;
        }
        else{
            Math.pow(myx, myn);
            return myx * algo(myx,myn-1);
        }
    }

 

     

}// end class