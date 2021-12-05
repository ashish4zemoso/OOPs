package com.zemoso.access_control.authenticate;

import com.zemoso.access_control.model.VisitorSchema;

public abstract class VisitorAuthenticator {
	public boolean authenticate(VisitorSchema newVisitor) {
		return authenticateByVisitorType(newVisitor.getVisitorID());
	}
	protected abstract boolean authenticateByVisitorType(String visitorType);
}
