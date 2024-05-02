package com.paypay.paypay.constant;





import com.google.common.collect.ImmutableMap;

public class StatusMap {
	
	public static final String SUCCUSS_CODE = "00";
	public static final String ERROR_DATABASE = "01";
	
	
	public static final ImmutableMap<String, String> msgMap = new ImmutableMap.Builder<String,String>()
			.put(SUCCUSS_CODE, "Success")
			.put(ERROR_DATABASE, "Database is Error")
			.build();

}
