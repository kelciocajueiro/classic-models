package com.mycompany.classicmodels.infra;

public class Flyway {

    public static void main(String[] args) {
        generateMigrationName();
    }

    private static void generateMigrationName() {
        System.out.println("V" + System.currentTimeMillis());
    }

}
