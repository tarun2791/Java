package com.tk20.seleniumtestassessment.test.corses;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="automation-configuration")
public class AutomationConfiguration
{
	private String suite;
	private List<FileMapping> mapping;
	
}