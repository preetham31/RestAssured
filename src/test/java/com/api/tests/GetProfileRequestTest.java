package com.api.tests;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.services.AuthService;
import com.api.services.UserManagementService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileRequestTest {

    @Test
    public void getProfile() {
        AuthService authService = new AuthService();
        Response response= authService.login(new LoginRequest("preetham", "preetham"));
        LoginResponse loginResponse=response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());

        UserManagementService userManagementService=new UserManagementService();
        response= userManagementService.getProfile(loginResponse.getToken());
        System.out.println(response.asPrettyString());
    }
}
