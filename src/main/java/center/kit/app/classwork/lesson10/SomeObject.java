package center.kit.app.classwork.lesson10;

public class SomeObject {

    private String variable1;
    private String variable2;
    private String variable3;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SomeObject that = (SomeObject) o;

        if (variable1 != null ? !variable1.equals(that.variable1) : that.variable1 != null) return false;
        return variable2 != null ? variable2.equals(that.variable2) : that.variable2 == null;
    }

    @Override
    public int hashCode() {
        int result = variable1 != null ? variable1.hashCode() : 0;
        result = 31 * result + (variable2 != null ? variable2.hashCode() : 0);
        return result;
    }

    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    public String getVariable3() {
        return variable3;
    }

    public void setVariable3(String variable3) {
        this.variable3 = variable3;
    }

}
