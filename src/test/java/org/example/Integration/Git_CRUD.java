package org.example.Integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.path.json.JsonPath;
import org.GITHUB.Constants.Git_Constants;
import org.GITHUB.PayloadManager.PayloadManager;
import org.example.Common.BaseTest;
import org.testng.annotations.Test;

public class Git_CRUD extends BaseTest {
    PayloadManager payloadManager;
    public static JsonPath jsonPath;
    public static String reponame;
    public static String updatedreponame;

    @Test
    public void createrepo() throws JsonProcessingException {
        payloadManager = new PayloadManager();
        requestSpecification.basePath(Git_Constants.createrepo);
        response = requestSpecification.when().body(payloadManager.createrepo()).post();
        jsonPath = JsonPath.from(response.asString());
        reponame = jsonPath.getString("name");
        System.out.println(reponame);


//        extract repo name from here and provide below
    }

    @Test(dependsOnMethods = "createrepo")
    public void getrepos() throws JsonProcessingException {
        requestSpecification.basePath(Git_Constants.Getrepospath)
                .when().get().then().log().all();
    }

    @Test(dependsOnMethods = "getrepos")
    public void getlanguagesrepos() throws JsonProcessingException {
        requestSpecification.basePath("/repos/Nikhil-Pophale/" + reponame + "/languages")
//        requestSpecification.basePath("/repos/Nikhil-Pophale/My_API_Automation_FrameworK/languages")
                .when().get().then().log().all();
    }

    @Test(dependsOnMethods = "getlanguagesrepos")
    public void updaterepo() throws JsonProcessingException {
        payloadManager = new PayloadManager();
        requestSpecification.basePath(Git_Constants.updaterepo + reponame);
        response = requestSpecification.when().body(payloadManager.updaterepo()).post();
        jsonPath = JsonPath.from(response.asString());
        updatedreponame = jsonPath.getString("name");
        System.out.println(response.asString());
    }

    @Test(dependsOnMethods = "updaterepo")
    public void Deleterepos() {
        requestSpecification.basePath(Git_Constants.deleterepo + updatedreponame);
        response = requestSpecification.when().delete();
        validatableResponse = response.then().log().all().statusCode(204);
    }
}
