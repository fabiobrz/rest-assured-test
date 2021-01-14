package org.example.rest.assured.test;

import org.example.rest.assured.test.utils.TestCaseHelper;
import org.junit.Test;

import static io.restassured.RestAssured.get;

public class BasicTestCase {

    @Test
    public void testAppEndpoint() {
        String resourceURL = TestCaseHelper.TEST_URI_DEFAULT;
        get(resourceURL).then()
                .statusCode(200)
        ;
    }
}
