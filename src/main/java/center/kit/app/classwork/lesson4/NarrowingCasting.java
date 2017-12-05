package center.kit.app.classwork.lesson4;

public class NarrowingCasting {

    //double double1 = 3.14159d;
    public float float1 = 0.0f;

    //    int int1 = 0;
    //    float float1 = 3.14159f;

    public void narrowing(double value) {

        this.float1 = (float) value;
        System.out.println(float1);

    //        int1 = (short) float1;
    //        System.out.println(int1);
    }
}
