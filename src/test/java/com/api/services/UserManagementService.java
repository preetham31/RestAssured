package com.api.services;

import io.restassured.response.Response;

public class UserManagementService extends BaseService {
        private static final String BASE_PATH = "/api/users";

        public Response getProfile(String token) {
        setAuth(token);
        return getRequest(BASE_PATH +"/profile");}
}
