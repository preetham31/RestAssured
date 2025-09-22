package com.api.tests;

import com.api.services.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgetPasswordTest {
    @Test
    public void forgetPassword() {
        AuthService authService = new AuthService();
        Response response = authService.forgotpassword("preetham@gmail.com");
        System.out.println(response.asPrettyString());
    }
}
