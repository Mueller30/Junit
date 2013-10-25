package junit_student_muellerK;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TreeSet;

public class Student extends Person implements Comparable<Student> {
	
		

        public Student(String firstName, String lastName, Date gebdat) {
                this(firstName, lastName, false);
                this.birthDate=gebdat;
        }

        public Student(String firstName, String lastName, boolean selfEntitled) {
                super(firstName, lastName);
                setSelfEntitled(selfEntitled);
        }

        private boolean selfEntitled;
        private Date birthDate; // TODO add getter,setter,Constructors

        public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(int y, int m, int d) {
			Date x= new Date(y,m,d);
			this.birthDate = x;
		}

		public void setSelfEntitled(boolean selfEntitled) {
                this.selfEntitled = selfEntitled;
        }

        @Override
        public int compareTo(Student o) {
                int result = 1;
                if ((result = getLastName().compareTo(o.getLastName())) == 0) {
                        if ((result = getFirstName().compareTo(o.getFirstName())) == 0) {
                                result = birthDate.compareTo(o.getBirthDate()); 
                                                                                                                        // getter after
                                                                                                                        // implementation
                        }
                }
                return result;
        }
        
        public boolean compareTogebdat(Student o){
			boolean answer=false;
			if(getBirthDate().compareTo(o.getBirthDate())== 0)
			{
				answer=true;
			}
			else{
				answer=false;
			}
        	return answer;
        	
        }
        
        public ArrayList<Student> sortgebdat(ArrayList<Student> as){
			
        	Collections.sort(as,new Comparator<Student>() {

				@Override
				public int compare(Student arg0, Student arg1) {
					
					// TODO Auto-generated method stub
					return arg0.getBirthDate().compareTo(arg1.getBirthDate());
					
					
					//return 0;
					
				} 
			});
        	
        	
        	return as;
        	/*GregorianCalendar o1= o.getBirthDate();
        	GregorianCalendar p1= p.getBirthDate();
        	TreeSet<GregorianCalendar> x= new TreeSet<GregorianCalendar>();
        	x.add(o1);
        	x.add(p1);
        	x. */
        	
        }

        @Override
        public String toString() {
                // TODO missing implementation
                //return super.toString();
                return "VORNAME: " + getFirstName() + " NACHNAME: " + getLastName() + " GEBDAT: " + getBirthDate();
                		
        }
}
