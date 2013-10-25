package junit_student_muellerK;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import org.junit.Test;

public class TestStudentJUnit {
	
	GregorianCalendar z1= new GregorianCalendar(1800,11,02);
	GregorianCalendar z2 = new GregorianCalendar(1980,05,05);
	GregorianCalendar z3= new GregorianCalendar(1992,11,05);
	
	Student s1= new Student("Timo","Berger",new Date(1990,02,12));
	Student s2= new Student("Stefan","Kost",new Date(2005, 02, 28));
	Student s3= new Student("Günter","Schoneberger",new Date(2010, 03, 16));
	ArrayList<Student> ar= new ArrayList<Student>();
	ArrayList<Student> af= new ArrayList<Student>();

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void compareToTest(){
		assertSame(s1.compareTo(s2),-9);
	}
	
	//@Test
	public void compareToTest2(){
		assertSame(s2.compareTo(s3),9);
	}
	
	//@Test
	public void compareToGeb(){
		assertSame(s1.compareTogebdat(s2),true);
	}
	
	@Test
	public void sortgebdat(){
	
		af.add(s3);
		af.add(s1);
		af.add(s2);
		
		ar.add(s1); 
		ar.add(s2);
		ar.add(s3);
		
		assertEquals(ar,s2.sortgebdat(af));
	}
	
	//@Test
	public void sortgebdat2(){
	
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		
		af.add(s2);
		af.add(s3);
		af.add(s1);
		
		assertEquals(ar,s1.sortgebdat(af));
	}
	

	
}
