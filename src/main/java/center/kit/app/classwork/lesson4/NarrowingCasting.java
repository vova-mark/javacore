package center.kit.app.classwork.lesson4;

public class NarrowingCasting {

/*
    double double1 = 3.14159d;
    float float1 = 0.0f;
*/

    int int1 = 0;
    float float1 = 3.14159f;

    public void narrowing() {

        //float1 = (float) double1;

        int1 = (int) float1;
        System.out.println(int1);
    }
}
