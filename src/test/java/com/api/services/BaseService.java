package com.api.services;

import com.api.models.request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseService {
    private static final String BASE_URl = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification  ;

    public BaseService() {
        requestSpecification =   given().baseUri(BASE_URl);
    }
    protected Response postRequest(Object payload, String endpoint) {
         return requestSpecification
                .header("Content-type","application/json")
                .body(payload)
                .post(endpoint);
    }
}
