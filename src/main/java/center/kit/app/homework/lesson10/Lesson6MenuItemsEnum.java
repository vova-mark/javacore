package center.kit.app.homework.lesson10;

public enum Lesson6MenuItemsEnum {
    ONE("Check if the digits are sides of right-angled triangle."),
    TWO("Compare two circles areas."),
    THREE("Calculate circle area."),
    FOUR("Define what number is bigger."),
    FIVE("Exit");

    private final String fullName;

    Lesson6MenuItemsEnum(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public static Lesson6MenuItemsEnum getValueOf(int choise) {
        Lesson6MenuItemsEnum result = null;
        for (Lesson6MenuItemsEnum item : values()){
            if (item.ordinal() + 1 == choise){
                result = item;
            }
        }
        return result;
    }
}
