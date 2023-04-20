package com.simformsolutions.lambda;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = (name) -> "name of the Employee : " + name;
        System.out.println(employee1.displayName("Arpit"));
        Employee employee2 = (name) -> "name of the Employee : " + name;
        System.out.println(employee2.displayName("Parth"));




}}
