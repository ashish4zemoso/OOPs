package com.zemoso.access_control.output;

import com.zemoso.access_control.Authenticator;
import com.zemoso.access_control.authenticate.VisitorAuthenticator;
import com.zemoso.access_control.authenticate.VisitorAuthenticatorFactory;
import com.zemoso.access_control.model.VisitorSchema;
import com.zemoso.access_control.time.Timer;

public class OutputWriter {
	public static void displayDetails(VisitorSchema newVisitor) {
		VisitorAuthenticator visitorTypeObj =  
				VisitorAuthenticatorFactory.getVisitorAuthenticator(newVisitor);
		if(visitorTypeObj.authenticate(newVisitor)==true) {
			System.out.println(
					"Visitor : "+ newVisitor.getVisitorName()+ "\ntype: "+ 
					newVisitor.getVisitorType()+"\nGranted entry at: "+
					Timer.getCurrentHour()+"00 Hours"+ " and " + 
					Timer.getCurrentMinutes() + " Minutes "+ "\nCredentials Verified"
					);
		}
		else {
			System.out.println("ACCESS DENIED!!!");
		}
	}
}
