package com.api.tests;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.services.AuthService;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginApiTest {

    @Test
    public void login() {
        LoginRequest loginRequest = new LoginRequest("uday12345", "uday1234");
        AuthService authService = new AuthService();
        Response response =  authService.login(loginRequest);
        LoginResponse loginResponse=response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getToken());

        Assert.assertEquals(loginResponse.getId(),1);
    }



}