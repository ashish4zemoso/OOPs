package com.zemoso.access_control.authenticate;

import java.util.Arrays;

import com.zemoso.access_control.constants.Constants;
import com.zemoso.access_control.model.VisitorSchema;

public class NonEmployeeAuthenticator extends VisitorAuthenticator {

	@Override
	protected boolean authenticateByVisitorType(String visitorID) {
		// TODO Auto-generated method stub
		if(! Arrays.asList(Constants.LIST_OF_VALID_VISITOR_TOKENS).contains(visitorID)) {
			return false;
		}
		return true;
	}
	
}
