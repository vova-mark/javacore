package center.kit.app.homework.lesson10;

public enum Lesson8MenuItemsEnum {
    ZERO ("Define if input string is palindrome"),
    ONE ("Read array from file/sort/write sorted to file"),
    TWO ("Define palindromes in file"),
    THREE ("Write data to file"),
    FOUR ("Properties file"),
    FIVE ("Exit");

    private final String fullName;

    Lesson8MenuItemsEnum (String fullName){
        this.fullName = fullName;
    }

    public static Lesson8MenuItemsEnum getValueOf (int choise){
        Lesson8MenuItemsEnum result = null;
        for (Lesson8MenuItemsEnum item : values()){

            if (item.ordinal() == choise){
                result = item;
            }
        }
        return result;
    }

    public String getFullName() {
        return fullName;
    }
}
