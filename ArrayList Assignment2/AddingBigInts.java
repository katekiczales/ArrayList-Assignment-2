import java.util.ArrayList;

class AddingBigInts {

    public static ArrayList<Integer> adding(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> max, min;

        if ( a.size() > b.size() )  {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;      
        }

        while ( min.size() < max.size() ) {
            min.add(0, 0);
        }

        int c = 0; 
        for ( int i = a.size()-1; i >= 0; i-- ) {
            int s = a.get(i) + b.get(i) + c;
            c = 0;
            if ( s > 9 ) {
                result.add(0, s%10);
                c = s/10;
            } else {
                result.add(0,s);
            }
        }
        if ( c != 0 ) result.add(0, c);


        return result;

    }

    public static void main (String[] args) {
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(1);
        first.add(1);
        first.add(8);
        ArrayList<Integer> second = new ArrayList<Integer>();
        second.add(1);
        second.add(9);

        System.out.println(adding(first, second));  
    }

}
