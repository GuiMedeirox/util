package Awrapper;

public class testandoWrapper {
    public static void main(String[] args) {
        //autoboxing
        Integer aW = 10;
        Float bW = 10.5f;
        Character cW = 'A';
        Boolean dW = true;
        Long eW = 12L;
        Short fW = 10;
        Byte gW = 10;
        Double hW = 12d;

        //unboxing
        int a = aW;
        float b= bW;
        char c = cW;
        boolean d = dW;
        long e = eW;
        short f = fW;
        byte g = gW;
        double h = hW;

        usandoWrappers();
    }

    static void usandoWrappers(){
        System.out.println( Integer.compare(2,3) );
        System.out.println( Float.isFinite(2.5f));
        System.out.println(Character.isDigit('2'));
        System.out.println(Long.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Boolean.parseBoolean("True"));
        System.out.println(Byte.MIN_VALUE);
    }


}
