package org.example;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class Basics {

    public static void main (String[] args){
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"location\": {\n" +
                        "    \"lat\": -38.383494,\n" +
                        "    \"lng\": 33.427362\n" +
                        "  },\n" +
                        "  \"accuracy\": 50,\n" +
                        "  \"name\": \"Dragon Hunter\",\n" +
                        "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                        "  \"address\": \"29, side layout, cohen 09\",\n" +
                        "  \"types\": [\n" +
                        "    \"shoe park\",\n" +
                        "    \"shop\"\n" +
                        "  ],\n" +
                        "  \"website\": \"http://dragonhunter.com\",\n" +
                        "  \"language\": \"French-IN\"\n" +
                        "}\n");
    }
}