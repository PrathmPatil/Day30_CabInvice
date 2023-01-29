package com.carinvice;

import static org.junit.jupiter.api.DynamicTest.stream;

public class CarInvoice {

	final static int MAXIMUM_COST_PER_KILOMETER=10;
	final static int COST_PER_MINUTE=1;
	final static int MINIMUM_FARE=5;
	
//calculate carinvice 
	static int carInvoice(int kilometer,int minute)
	{
		int invoice=(kilometer*MAXIMUM_COST_PER_KILOMETER)+(minute*COST_PER_MINUTE);
		return invoice;
	}
//calculate minimun fare calculation 
public double MinFare(double kilometer , int minute) {
		
		double invoice=(kilometer*MAXIMUM_COST_PER_KILOMETER)+(minute*COST_PER_MINUTE);
		if(invoice<MINIMUM_FARE)
		{
			return MINIMUM_FARE;
		}
		return invoice;
	}
}
