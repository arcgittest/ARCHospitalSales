package com.archs.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			properties = new Properties();
			properties.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getLoginURL()
	{
		String url=properties.getProperty("archsdqaURL");
		return url;
	}
	
	public String getUsername()
	{
		String username=properties.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=properties.getProperty("password");
		return password;
	}
	
	public String getAccountURL()
	{
		String accounturl=properties.getProperty("arcaccountURL");
		return accounturl;
	}
	
	
	public String getArcCATURL()
	{
		String arccaturl=properties.getProperty("arccatURL");
		return arccaturl;
	}
	
	public String getArcAccountDetailURL()
	{
		String arcacntdetailurl=properties.getProperty("arcaccountdetailURL");
		return arcacntdetailurl;
	}
	
	public String getArcContractAssessmentURL()
	{
		String arcacontractassessmenturl=properties.getProperty("arccontractassessmentURL");
		return arcacontractassessmenturl;
	}
	
	public String getArcContractListViewURL()
	{
		String arcacontractassessmenturl=properties.getProperty("arccontractlistviewURL");
		return arcacontractassessmenturl;
	}
	
	public String getChromePath()
	{
		String chromepath=properties.getProperty("chromepath");
		return chromepath;
	}
}
