package com.cucumberFramework.pageObjects;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.xml.sax.SAXException;
import io.qameta.allure.Step;


public class Pageobject {
	
	private WebDriver driver;	
	org.w3c.dom.Document document;

	public Pageobject(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void DocumentBuilderFactory() throws Exception {			
	//Get Document Builder
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	//Build Document
	document = builder.parse(new File(".//Test Data//employees.xml"));}
			
	
	public void getDocumentElement() throws Exception {			
	document.getDocumentElement().normalize();		 
	Element root = document.getDocumentElement();
	System.out.println(root.getNodeName());
	}
		
	public void ReadXML() throws Exception {			
	
	//Get all employees
	NodeList nList = document.getElementsByTagName("employee");
	System.out.println("============================");			
	for (int temp = 0; temp < nList.getLength(); temp++)
		{
		 Node node = nList.item(temp);
		 System.out.println("");    //Just a separator
		if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		    System.out.println("Employee id : "  + eElement.getAttribute("id"));
		    System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
		    System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
		    System.out.println("Location : "    + eElement.getElementsByTagName("location").item(0).getTextContent());
		 }
		
		}
	
	}
}

