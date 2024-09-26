public class Primenum {

    //function to check if a given number is prime
       static boolean isPrime(int num){
            //since 0 and 1 is not prime return false.
            if(num==1||num==0)return false;
    
            //Run a loop from 2 to n-1
            for(int i=2; i<num; i++){
              // if the number is divisible by i, then n is not a prime number.
                  if(num%i==0)return false;
            }
            //otherwise, n is prime number.
            return true;
      }

      public static void main (String[] args) 
      { 
          int N = 150; 
          //check for every number from 1 to N
          for(int i=51; i<=N; i++){
              //check if current number is prime
              if(isPrime(i)) {
                  System.out.print(i + " ");
              }
            }
        }
    }