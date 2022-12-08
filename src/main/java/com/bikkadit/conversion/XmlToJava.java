package com.bikkadit.conversion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.bikkadit.Student;

public class XmlToJava {
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Unmarshaller marshaller = context.createUnmarshaller();
		Object student = (Student)marshaller.unmarshal(new File("student.xml"));
		System.out.println(student);
	}

}
