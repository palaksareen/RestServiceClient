package uk.co.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientResponse;

public class plainHtmlClient {

	
	public static void main(String[] args)
	{
		 ClientConfig config = new ClientConfig();
		 Client client = ClientBuilder.newClient(config);
		 WebTarget target = client.target("http://localhost:8080/restservice/rest/service/hello");
		 String response = target.request().accept(MediaType.TEXT_PLAIN).get(String.class);
		 //String output = response.getEntity().toString();
		 System.out.println(response);
	}
}
