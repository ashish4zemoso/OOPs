package com.zemoso.access_control.model;

public class VisitorSchema {
	private String visitorType;
	private String visitorName;
	private String visitorID;
	
	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getVisitorID() {
		return visitorID;
	}

	public void setVisitorID(String visitorID) {
		this.visitorID = visitorID;
	}

	public VisitorSchema() {
		this.visitorType="";
	}
	
	public static void entryMessage() {
		 System.err.println("==========================================================================================================================\n");
		 System.out.println("New Visitor Record Entry -->\n");
	}

	public String getVisitorType() {
		return visitorType;
	}

	public void setVisitorType(String visitorType) {
		this.visitorType = visitorType;
	}
	
	
}
