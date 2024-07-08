package enums;

public enum AppLogLevel {
    ERROR("ERROR"),
    WARN("WARN"),
    INFO("INFO");

    private String name;

    AppLogLevel(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static AppLogLevel fromStringToEnum(String level){
        for(AppLogLevel logLevel : AppLogLevel.values()){
            if(logLevel.getName().equals(level)){
                return logLevel;
            }
        }
        return null;
    }

}
