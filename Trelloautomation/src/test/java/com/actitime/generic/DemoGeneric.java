package com.actitime.generic;

import java.io.IOException;

public class DemoGeneric {
public static void main(String[] args) throws IOException {
	Filelib f = new Filelib();
	
	System.out.println(f.getPropertyData("username"));
	
	System.out.println(f.getExcelData("mydata", 1, 0));
}
}

