package uk.co.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import uk.co.model.EmployeeClient;

public class PostJsonClient {

	public static void main(String args[])
	{
		EmployeeClient emp = new EmployeeClient();
		emp.setId("1");
		emp.setNamee("palak");
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target("http://localhost:8080/restservice/rest/service/jsoninput");
		String response = target.request().accept(MediaType.TEXT_HTML).post(Entity.entity(emp, MediaType.APPLICATION_JSON), String.class);
		 System.out.println(response);
	}
}
