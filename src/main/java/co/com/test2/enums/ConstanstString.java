package co.com.test2.enums;

public enum ConstanstString {


    URL("https://demoqa.com/automation-practice-form");


    String value;

    private ConstanstString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
