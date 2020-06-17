package com.hrms.practice;

import com.hrms.utils.API_Constants;
import com.hrms.utils.CommonMethods;

public class Test extends CommonMethods{

	public static void main(String[] args) {
		
		String json=readJson(API_Constants.GENERATE_TOKEN_JSON_FILEPATH);
		System.out.println(json);
	}
}
