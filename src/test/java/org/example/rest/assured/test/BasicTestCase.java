package org.example.rest.assured.test;

import org.junit.Test;

import static io.restassured.RestAssured.get;

public class BasicTestCase {

    @Test
    public void testAppEndpoint() {
        String resourceURL = "https://any-api.com/oxforddictionaries_com/oxforddictionaries_com/docs/_domains_source_language_/GET";
        get(resourceURL).then()
                .statusCode(200)
        ;
    }
}
