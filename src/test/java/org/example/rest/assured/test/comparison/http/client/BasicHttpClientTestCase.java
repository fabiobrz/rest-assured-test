package org.example.rest.assured.test.comparison.http.client;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.example.rest.assured.test.utils.TestCaseHelper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class BasicHttpClientTestCase {
    @Test
    public void testAppEndpoint() throws  IOException {
        String resourceURL = TestCaseHelper.TEST_URI_DEFAULT;

        try (CloseableHttpClient client = HttpClientBuilder.create().build()) {
            try (CloseableHttpResponse response = client.execute(new HttpGet(resourceURL))) {
                Assert.assertEquals(200, response.getStatusLine().getStatusCode());
            }
        }
    }
}
