package center.kit.runners.classwork.lesson7;

import java.lang.String;

public class BoxingUnboxingRunner {
    public static void main(String[] args) {

        String firstString = "5";
        String secondString = "45.21";
        String thirdString = "true";
        String fouthString = "65465465432165498";

        //new string objects
        String intString = new java.lang.String(firstString);
        String floatString = new java.lang.String(secondString);
        String booleanString = new java.lang.String(thirdString);
        String longString = new java.lang.String(fouthString);

        //
        int a = Integer.valueOf(intString);
        float f = Float.valueOf(floatString);
        long l = Long.valueOf(longString);
        boolean b = Boolean.valueOf(booleanString);

        System.out.println(a + " " + f + " " + l + " "+ b);

        Integer intValue = new Integer(a);
        Float floatValue = new Float(f);
        Long longValue = new Long(longString);
        Boolean booleanValue = new Boolean(b);


        System.out.println(intValue + " " + floatValue + " " + longValue + " "+ booleanValue);
    }
}
