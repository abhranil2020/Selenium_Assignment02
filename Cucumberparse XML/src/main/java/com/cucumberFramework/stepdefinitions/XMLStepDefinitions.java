package com.cucumberFramework.stepdefinitions;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.w3c.dom.*;

import com.cucumberFramework.pageObjects.Pageobject;
import com.cucumberFramework.testBase.TestBase;

import javax.xml.parsers.*;
import java.io.*;

public class XMLStepDefinitions extends TestBase {


	private static final NodeList nList = null;
	Pageobject PobjPage = new Pageobject(driver);


	@Given("^I parse an xml file \"([^\"]*)\"$")
	public void i_parse_an_xml_file(String arg1) throws Throwable {
		PobjPage.DocumentBuilderFactory();
	}
	
	@Then("^I print tag names$")
	public void i_print_tag_names() throws Throwable {
		PobjPage.getDocumentElement();	
	}	   

	@Then("^print dictionary of attributes and text for all the element$")
	public void print_dictionary_of_attributes_and_text_for_all_the_element() throws Throwable {
		PobjPage.ReadXML();				
	}



}