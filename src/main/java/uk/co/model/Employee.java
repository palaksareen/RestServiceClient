package uk.co.model;

import javax.xml.bind.annotation.XmlRootElement;
//JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
//@XmlRootElement
public class Employee {

	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
}
