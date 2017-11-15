package uk.co.restservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
	
	@POST
	@Path("/jsoninput")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public Response inputJsonRequest(Employee emp)
	{
		return Response.status(200).entity("<html> " + "<title>" + "Hello HTML Response" + "</title><body><b>"+emp.getName() + emp.getId()+"</b></body></html>").build();
		//return emp.getName() + emp.getId();
	}
	

}
