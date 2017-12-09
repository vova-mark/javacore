package center.kit.app.classwork.lesson4;

public class WideningCasting {

    //correct conversion 64f<=32f<=64<=32<=16<=8

    public double widening(byte byte1) {
        short short1 = 0;
        int int1 = 0;
        long long1 = 0;
        float float1 = 0.0f;
        double double1 = 0.0d;
        short1 = byte1;
        int1 = short1;
        long1 = int1;
        float1 = long1;
        double1 = float1;
        return double1;

    }

}
