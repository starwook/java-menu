package menu.resource;

public enum Day {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일");

    private String name;

    public String getName() {
        return name;
    }

    Day(String name){
        this.name =name;
    }
}
