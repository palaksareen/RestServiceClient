package uk.co.restservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import uk.co.model.Employee;

@Path("/service")
public class CommonService {
	
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlainResponse()
	{
		return "Helloooo";
	}
	
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getjSONResponse()
	{
		Employee emp = new Employee();
		emp.setName("Palak");
		emp.setId("1");
		return emp;
	}

}
