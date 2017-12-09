package center.kit.runners.classwork.lesson7;

public class BoxingUnboxingRunner {
    public static void main(String[] args) {
        java.lang.String intString = new java.lang.String("5");
        java.lang.String floatString = new java.lang.String("45.21");
        java.lang.String booleanString = new java.lang.String("5");
        java.lang.String longString = new java.lang.String("923456789321654789");

        int a = Integer.valueOf(intString);
        float f = Float.valueOf(floatString);
        long l = Long.valueOf(longString);
        boolean b = Boolean.valueOf(booleanString);

        int someValue = Integer.valueOf("100500");

        System.out.println(a + " " + f + " " + l + " "+ b);

        Integer intValue = new Integer(a);
        Float floatValue = new Float(f);
        Long longValue = new Long(longString);
        Boolean booleanValue = new Boolean(b);


        System.out.println(intValue + " " + floatValue + " " + longValue + " "+ booleanValue);
    }
}
