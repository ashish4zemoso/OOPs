package com.zemoso.access_control.input;

import java.util.Arrays;
import com.zemoso.access_control.constants.Constants;

public class InputValidator {
	public static void validateVisitorType(String visitorType) throws InvalidInputException {
		if(!Arrays.asList(Constants.LIST_OF_VISITOR_TYPES).contains(visitorType.toLowerCase())) {
			throw new InvalidInputException("Visitor type must be employee or non-employee");
		}
	}
	
	public static void validateEmpID(String empID) throws InvalidInputException {
		if(empID.length()!=6) {
			throw new InvalidInputException("Employee ID must be 6 characters only");
		}
	}
	
	public static void validateNonEmpID(String nonEmpID) throws InvalidInputException{
		if(nonEmpID.length()!=4) {
			throw new InvalidInputException("Non Employee tokens must be 4 characters only");
		}
	}

}
