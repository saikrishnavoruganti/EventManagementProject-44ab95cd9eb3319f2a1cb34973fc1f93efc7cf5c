package com.project.model;
// Generated Apr 11, 2017 7:41:13 PM by Hibernate Tools 4.3.5.Final

/**
 * Eventtype generated by hbm2java
 */
public class Eventtype implements java.io.Serializable {

	private EventtypeId id;
	private String eventtypename;
	private String eventtypedescription;

	public Eventtype() {
	}

	public Eventtype(EventtypeId id) {
		this.id = id;
	}

	public Eventtype(EventtypeId id, String eventtypename, String eventtypedescription) {
		this.id = id;
		this.eventtypename = eventtypename;
		this.eventtypedescription = eventtypedescription;
	}

	public EventtypeId getId() {
		return this.id;
	}

	public void setId(EventtypeId id) {
		this.id = id;
	}

	public String getEventtypename() {
		return this.eventtypename;
	}

	public void setEventtypename(String eventtypename) {
		this.eventtypename = eventtypename;
	}

	public String getEventtypedescription() {
		return this.eventtypedescription;
	}

	public void setEventtypedescription(String eventtypedescription) {
		this.eventtypedescription = eventtypedescription;
	}

}
