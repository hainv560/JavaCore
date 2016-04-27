package com.smartosc.demo.core.basic;

/**
 * Created by smartosc on 4/26/2016.
 */
public enum EnumClass {
    Facebook(1, "Login via Fb"), Google(2, "Login via Google"), Yahoo(3, "Login via Yahoo");

    private final int type;
    private String description;

    EnumClass(int type, String description) {
        this.type = type;
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static EnumClass getByType(int type) {
        for (EnumClass enumClass : EnumClass.values()) {
            if (enumClass.getType() == type)
                return enumClass;
        }
        return null;
    }
}
