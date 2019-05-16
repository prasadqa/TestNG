package runXmlProgramatically;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class XmlFile 
{
	public void TestNgXmlSuite()
	{
		// for multiple suites
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		// for multiple classes
		List<XmlClass> classes = new ArrayList<XmlClass>();
		//Listeners 
		List<Class> ListenerClass = new ArrayList<Class>();
		ListenerClass.add(itestListener.MyListenerTest.class);
		
		
		//to create suite 
		XmlSuite suite = new XmlSuite();
		suite.setName("Manual suite");
		
		//to create Test
		XmlTest test1 = new XmlTest(suite);
		test1.setName("Manual Test1");
		
		XmlTest test2 = new XmlTest(suite);
		test2.setName("Manual Test2");
		
		//multiple classes
		XmlClass class1 = new XmlClass("runXmlProgramatically.SampleTestDemo");
		System.out.println(class1);
		classes.add(class1);
		
		
		XmlClass class2 = new XmlClass("runXmlProgramatically.SampleTestDemo2");
		System.out.println(class2);
		classes.add(class2);
		
		//adding above classes to list classes
		
		
		
		
		//adding classes to Test
		test1.setXmlClasses(classes);
		test2.setXmlClasses(classes);
		
		
		
		// Adding suite
		suites.add(suite);
		
		//to run Xml file
		TestNG tng = new TestNG();
		tng.setXmlSuites(suites);
		tng.setListenerClasses(ListenerClass);
		tng.run();
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		XmlFile run = new XmlFile();
		run.TestNgXmlSuite();
	}
}
