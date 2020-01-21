import java.util.ArrayList;

class GoldbachConjecture {

    public static ArrayList<Integer> gConjecture( int n ) {
        ArrayList<Integer> primes = SieveOfEratosthenes.primes(n);
        ArrayList<Integer> result = new ArrayList<Integer>(2);
        for ( int i = 0; i < primes.size(); i++ ) {
            int a = primes.get(i);
            int b = n - a;
            if ( primes.indexOf(b) != -1 ) {
                result.add(a);
                result.add(b);
                break;
            }
        }

        return result;

    }

    public static void main (String[] args) {
        System.out.println(gConjecture(98));      
    }

}