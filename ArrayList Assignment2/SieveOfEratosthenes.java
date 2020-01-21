import java.util.ArrayList;

class SieveOfEratosthenes {

    public static ArrayList<Integer> primes( int n ) {
        ArrayList<Integer> result = new ArrayList<Integer>(n);
        for ( int i = 2; i <= n; i++ ) {  //Create list (2 to n)
            result.add(i);
        }

        for ( int i = 0; i < result.size(); i++ ) {
            int p = result.get(i);

            for ( int j = i + 1; j < result.size(); j++ ) {
                if ( result.get(j)%p == 0 ) { //if a multiple of p
                    result.remove(j); 
                    j--;
                }
            }
        }
        return result;

    }

    public static void main (String[] args) {
        System.out.println(primes(100));      
    }

}