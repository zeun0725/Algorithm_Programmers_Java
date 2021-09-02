package com.fastcampus.classpart;

public class Company {
    private static Company instance = new Company(); //유일한 애

    public static Company getInstance() {
        if( instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
