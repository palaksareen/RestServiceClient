package uk.co.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeClient {

	@JsonProperty("name")
	private String namee;
	private String id;
	
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [namee=" + namee + ", id=" + id + "]";
	}
	
}
