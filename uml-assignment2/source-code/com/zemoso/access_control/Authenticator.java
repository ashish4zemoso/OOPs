package com.zemoso.access_control;


import com.zemoso.access_control.constants.Constants;
import com.zemoso.access_control.input.InputReader;
import com.zemoso.access_control.model.VisitorSchema;
import com.zemoso.access_control.output.OutputWriter;
import com.zemoso.access_control.time.Timer;


public class Authenticator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(Timer.checkCurrentTime()==true) {
			VisitorSchema.entryMessage();
			VisitorSchema newVisitor = new VisitorSchema();
			newVisitor = InputReader.inputDetails();
			OutputWriter.displayDetails(newVisitor);
		}
		//System.out.println("test");
	}

}
