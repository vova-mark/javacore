package center.kit.app.homework.lesson10;

import java.time.LocalDate;
import java.time.Period;

public enum FamousPeople {
    M_MONROE("Marilyn", "Monroe", LocalDate.of(1926, 6, 1), false),
    A_LINCOLN("Abraham", "Lincoln", LocalDate.of(1809, 2, 12), false),
    J_KENNEDY("John", "Kennedy", LocalDate.of(1917, 5, 29), false),
    L_KING("Martin", "Luther King", LocalDate.of(1929, 1, 15), false),
    N_MANDELLA("Nelson", "Mandela", LocalDate.of(1918, 7, 18), false),
    W_CHURCHILL("Winston", "Churchill", LocalDate.of(1874, 11, 30), false),
    M_ALI("Muhammad", "Ali", LocalDate.of(1942, 1, 17), false),
    DE_GAULLE("Charles", "de Gaulle", LocalDate.of(1890, 11, 22), false),
    G_ORWELL("George", "Orwell", LocalDate.of(1903, 6, 23), false),
    E_PRESLEY("Elvis", "Presley", LocalDate.of(1935, 1, 8), false),
    C_DARWIN("Charles", "Darwin", LocalDate.of(1809, 2, 12), false),
    A_EINSTEIN("Albert", "Einstein", LocalDate.of(1879, 3, 14), false),
    P_MCCARTNEY("Paul", "McCartney", LocalDate.of(1942, 6, 18), true),
    M_GORBACHEV("Mikhail", "Gorbachev", LocalDate.of(1931, 3, 2), true),
    O_WINFREY("Oprah", "Winfrey", LocalDate.of(1954, 1, 29), true),
    D_TRUMP("Donald", "Trump", LocalDate.of(1946, 6, 14), true),
    B_OBAMA("Barack", "Obama", LocalDate.of(1961, 8, 4), true),
    PELE("Pele", null, LocalDate.of(1940, 10, 23), true),
    M_JORDON("Michael", "Jordon", LocalDate.of(1963, 2, 17), true),
    STING("Sting", null, LocalDate.of(1951, 10, 2), true),
    MADONNA("Madonna", null, LocalDate.of(1958, 8, 16), true),
    L_MESSI("Lionel", "Messi", LocalDate.of(1987, 6, 24), true),
    D_BECKHAM("David", "Beckham", LocalDate.of(1975, 5, 2), true),
    P_CHARLES("Prince", "Charles", LocalDate.of(1948, 11, 14), true),
    S_HAWKING("Stephen", "Hawking", LocalDate.of(1942, 1, 8), true),
    BERNERS_LEE("Tim", "Berners Lee", LocalDate.of(1955, 6, 8), true),
    T_CRUISE("Tom", "Cruise", LocalDate.of(1962, 7, 3), true),
    S_KING("Stephen", "King", LocalDate.of(1947, 9, 21), true),
    G_CLOONEY("George", "Clooney", LocalDate.of(1961, 5, 6), true),
    L_TORVALDS("Linus", "Torvalds", LocalDate.of(1969, 12, 28), true);

    private String firstName;
    private LocalDate birthDate;
    private String lastName;
    private int age;
    private boolean isAlive;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        if (lastName != null) {
            return lastName;
        } else {
            return "";
        }
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    FamousPeople(String firstName, String lastName, LocalDate birthDate, boolean isAlive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate);
        this.isAlive = isAlive;
    }

    private static int calculateAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
