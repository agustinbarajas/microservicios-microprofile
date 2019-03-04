package com.example.microservicios.microprofile.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

class TaskEndpointTest {
	private final HttpClient httpClient = HttpClients.createDefault();
	final String URL = "http://localhost:8080/task";
		
	// Test to Connection
	@Test
	void testDoGetDone() { 
		HttpGet httpGet = new HttpGet(URL);
		try {
			HttpResponse response = httpClient.execute(httpGet);
			assertEquals(200, response.getStatusLine().getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testDoPostDone() {
		try {
			HttpPost httpPost = new HttpPost(URL);
			httpPost.addHeader("Content-Type", MediaType.APPLICATION_JSON);
			HttpResponse response = httpClient.execute(httpPost);
			assertEquals(200, response.getStatusLine().getStatusCode());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
