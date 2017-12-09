package center.kit.runners.classwork.lesson4;

import center.kit.app.classwork.lesson4.WideningCasting;

public class WideningCastingRunner {

    public static void main(String[] args) {

        int value = 127;

        WideningCasting casting = new WideningCasting();
        casting.widening((byte)value);
    }
}
