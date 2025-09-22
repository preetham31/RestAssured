package com.api.tests;

import com.api.models.request.SignUpRequest;
import com.api.services.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AccountCreationTest {

    @Test
    public void createAccount(){
        SignUpRequest signUpRequest=new SignUpRequest.Builder().username("preetham").password("preetham").email("preetham@gmail.com").firstName("preetham").lastName("nayini").mobileNumber("9866620646").build();
        AuthService authService=new AuthService();
        Response response=authService.signup(signUpRequest);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.asPrettyString(),"Error: Username is already taken!");
    }



}
