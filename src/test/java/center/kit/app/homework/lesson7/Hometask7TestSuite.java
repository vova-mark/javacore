package center.kit.app.homework.lesson7;

import center.kit.app.homework.lesson6.Hometask6TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        Hometask6TestSuite.class, //there is some another parametrized tests with csv files in this suite
        HomeworkArraysTest.class
}
)
public class Hometask7TestSuite {
}
