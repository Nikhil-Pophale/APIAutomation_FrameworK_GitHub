package org.GITHUB.Faker;

import com.github.javafaker.Faker;

public class Random {
    static Faker faker;
    public static String  Reponame(){
        faker=new Faker();
        String reponame=faker.funnyName().name();
        return reponame;
    }
}
