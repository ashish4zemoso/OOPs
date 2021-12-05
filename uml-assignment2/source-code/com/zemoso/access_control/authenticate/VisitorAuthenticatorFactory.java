package com.zemoso.access_control.authenticate;

import com.zemoso.access_control.constants.Constants;
import com.zemoso.access_control.model.VisitorSchema;

public class VisitorAuthenticatorFactory {
	public static VisitorAuthenticator getVisitorAuthenticator(VisitorSchema newVisitor) {
		VisitorAuthenticator visitorTypeObj = null;
		
		switch(newVisitor.getVisitorType().toLowerCase()) {
		case Constants.VISTOR_TYPE_EMPLOYEE:
			visitorTypeObj = new EmployeeAuthenticator();
			break;
		case Constants.VISITOR_TYPE_NON_EMPLOYEE:
			visitorTypeObj = new NonEmployeeAuthenticator();
			break;
		}
		return visitorTypeObj;
	}
}
