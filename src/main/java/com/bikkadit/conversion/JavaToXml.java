package com.bikkadit.conversion;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.bikkadit.Student;

public class JavaToXml {
	public static void main(String[] args) throws JAXBException {
		
		Student stu=new Student();
		stu.setId(11);
		stu.setName("tanuj");
		stu.setAge(75);
		stu.setRank(1);
		
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(stu, System.out);
	}

}
