package org.example.Common;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.GITHUB.Constants.Git_Constants;
import org.GITHUB.PayloadManager.PayloadManager;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public static RequestSpecification requestSpecification = RestAssured.given();
    public static Response response;
    public static ValidatableResponse validatableResponse;
    public static PayloadManager payloadManager;;
    @BeforeMethod(alwaysRun = true)
    public void setup() {
        payloadManager=new PayloadManager();
        requestSpecification = RestAssured.given()
                .baseUri(Git_Constants.BaseUrl).contentType(ContentType.JSON).
                header("Authorization","Bearer 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");


    }
}
