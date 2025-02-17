
// Driver Class
class Is_prime_or_not_check{
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n-1; i++)
            if (n % i == 0)
                return false;
        return true;


    }
            //also print that number 
            public static void primeinrange(int n){
                for(int i=2; i<=n; i++){
                    if(isPrime(i)){
                        System.out.print(" " +i);

                    }
                }
            }
        }