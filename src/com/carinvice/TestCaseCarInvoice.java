package com.carinvice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCaseCarInvoice {

	CarInvoice carinvoice=new CarInvoice();
	@Test
	void TotalFareForOneRide() 
	{
		int distance=4; //kilometer
		int time=20; //min
		//carInvice(Distance_In_Kilometer,Time_In_Minute)
		int returnValue=carinvoice.carInvoice(distance, time);
		//assertEquals(Experted(Distance_In_Kilometer*MAXIMUM_COST_PER_KILOMETER + Time_In_Minute*COST_PER_MINUTE),Actual_Return_Value)
		Assertions.assertEquals(60, returnValue, 0.0);
	}
	
}
