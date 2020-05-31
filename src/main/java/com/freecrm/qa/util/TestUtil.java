package com.freecrm.qa.util;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestUtil {
	
	public static long PAGE_LOAD_TIMEOUT = 3000;
	public static long IMPLICIT_WAIT = 5000;
	
	public static String[] readMenuData(String jSONParentData, String jSONChildData) throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("C:\\Users\\debasida\\Desktop\\SeleniumFramework\\FREECRMCucumberFrameworkDesign\\src\\main\\java\\com\\freecrm\\qa\\testdata\\CreateContact.json");
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject menuList = (JSONObject) obj;
		JSONArray menuListJSONArray = (JSONArray) menuList.get(jSONParentData);
		
		String menuListJAVAArray[] = new String[menuListJSONArray.size()];
		
		for(int i=0; i<menuListJSONArray.size(); i++) {
			
			JSONObject menus = (JSONObject) menuListJSONArray.get(i);
			String reqMenuToSelect = (String) menus.get(jSONChildData);
			
			menuListJAVAArray[i] = reqMenuToSelect;
			
		}
		
		return menuListJAVAArray;
	}
}
