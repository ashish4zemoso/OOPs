package com.zemoso.access_control.input;

import java.util.Scanner;
import com.zemoso.access_control.constants.Constants;
import com.zemoso.access_control.model.VisitorSchema;

public class InputReader {
	private final static Scanner reader = new Scanner(System.in);
	
	public static VisitorSchema inputDetails() {
		VisitorSchema newVisitor = new VisitorSchema();
		newVisitor.setVisitorType(inputVisitorType());
		newVisitor.setVisitorName(inputVisitorName());
		newVisitor.setVisitorID(inputVisitorID(newVisitor.getVisitorType()));
		return newVisitor;
	}
	
	private static String inputVisitorType() {
		System.out.println("Enter the visitor type");
		String visitorType = reader.nextLine();
		try {  InputValidator.validateVisitorType(visitorType); }
		catch(InvalidInputException e) {
			System.out.println("Incorrect input: "+e.getMessage());
			return inputVisitorType();
		}
		return visitorType;
	}
	
	private static String inputVisitorName() {
		System.out.println("Enter the visitor name:");
		String visitorName = reader.nextLine();
		return visitorName;
	}
	
	private static String inputVisitorID(String visitorType) {
		String visitorID;
		if(visitorType.equalsIgnoreCase(Constants.VISTOR_TYPE_EMPLOYEE)==true) {
			System.out.println("Enter your employee ID:");
			visitorID = reader.nextLine();
			try {  InputValidator.validateEmpID(visitorID); }
			catch(InvalidInputException e) {
				System.out.println("Incorrect format: "+e.getMessage());
				return inputVisitorID(visitorType);
			}
		}
		else {
			System.out.println("Enter the security issued token ID");
			visitorID = reader.nextLine();
			try {  InputValidator.validateNonEmpID(visitorID); }
			catch(InvalidInputException e) {
				System.out.println("Incorrect format: "+e.getMessage());
				return inputVisitorID(visitorType);
			}
		}
		return visitorID;
	}
}
