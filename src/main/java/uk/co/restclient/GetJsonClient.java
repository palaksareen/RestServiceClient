package uk.co.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import uk.co.model.EmployeeClient;

public class GetJsonClient {

	public static void main(String[] args)
	{
		 ClientConfig config = new ClientConfig();
		 Client client = ClientBuilder.newClient(config);
		 WebTarget target = client.target("http://localhost:8080/restservice/rest/service/get");
		 //String response = target.request().accept(MediaType.APPLICATION_JSON).get(String.class);
		 EmployeeClient response = target.request().accept(MediaType.APPLICATION_JSON).get(EmployeeClient.class);
		 
		 System.out.println(response);
	}
}
