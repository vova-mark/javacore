package center.kit.app.homework.lesson4.utils.convertors;

public enum Lesson4MenuItemsEnum {
    ONE ("Convert int to char"),
    TWO ("Convert float to char"),
    THREE ("Convert char to int"),
    FOUR ("Exit.");

    private final String fullName;

    Lesson4MenuItemsEnum (String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public static boolean contains (String input){
        boolean result = false;
        for (Lesson4MenuItemsEnum item : values()){
            if (item.name().equalsIgnoreCase(input)){
                result = true;
                break;
            }
        }
        return result;
    }

}
