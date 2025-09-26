package com.api.tests;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.services.AuthService;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListener.class)
public class LoginApiTest {

    @Test
    public void login() {
        LoginRequest loginRequest = new LoginRequest("preetham", "preetham");
        AuthService authService = new AuthService();
        Response response =  authService.login(loginRequest);
        LoginResponse loginResponse=response.as(LoginResponse.class);
        System.out.println(response.asPrettyString());
        System.out.println(loginResponse.getToken());

        Assert.assertEquals(loginResponse.getId(),2846);
    }



}