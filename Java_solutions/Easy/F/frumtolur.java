package Easy.F;

public class frumtolur {
    public static void main(String[] args){
        int i = 0;
        int primeCount = 0;
        while(primeCount != 100) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount++;
            }
            i++;
        }
    }

    static  boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i = 2; i <= num/2; i++)
        {
            if((num % i) == 0)
                return  false;
        }
        return true;
    }
}
