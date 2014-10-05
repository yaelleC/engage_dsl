package entities.crud;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.Test;

import uws.chaudy.generator.Engage;

public class Teacher {
	
	// There is a test row in the database: id=1, name=test, surname=test, email=test@test.com, password=test and isSchool = 1

	@Test
	public void testCreateTeacher() {
		
		Engage engage = new Engage();
		
		JSONObject teacher = new JSONObject();
		teacher.put("name", "yaelle");
		teacher.put("surname", "chaudy");
		teacher.put("email", "yaelle.chaudy@gmail.com");
		teacher.put("password", "Engage2014");
		teacher.put("idSchool", 1);
		
		try {
			assertEquals(1, engage.createTeacher(teacher));		
			
			// clean up
			JSONObject teacher2 = engage.loginTeacher("yaelle.chaudy@gmail.com", "Engage2014");
			engage.deleteTeacher(Integer.parseInt(teacher2.get("id").toString()));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGoodLoginTeacher() {
		
		Engage engage = new Engage();
		try {
			JSONObject teacher = engage.loginTeacher("test@test.com", "test");
			assertNotNull(teacher);
			assertEquals("test", teacher.get("name"));
			assertEquals("test", teacher.get("surname"));
			assertEquals("test@test.com", teacher.get("email"));
			assertEquals("test", teacher.get("password"));
			assertEquals(1, Integer.parseInt(teacher.get("idSchool").toString()));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void testWrongLoginTeacher() {
		
		Engage engage = new Engage();
		JSONObject teacher;
		try {
			teacher = engage.loginTeacher("inexisting address", "Engage2014");
			assertNull(teacher);
			
			teacher = engage.loginTeacher("yaelle.chaudy@gmail.com", "Wrong password");
			assertNull(teacher);
		} catch (Exception e) {
			fail(e.toString());
		}		
	}

	@Test
	public void testDeleteTeacher() {
		Engage engage = new Engage();
		try {
			JSONObject teacher = new JSONObject();
			teacher.put("name", "yaelle");
			teacher.put("surname", "chaudy");
			teacher.put("email", "yaelle.chaudy@gmail.com");
			teacher.put("password", "Engage2014");
			teacher.put("idSchool", 1);
			engage.createTeacher(teacher);
			
			JSONObject teacher1 = engage.loginTeacher("yaelle.chaudy@gmail.com", "Engage2014");		
			assertEquals(1, engage.deleteTeacher(Integer.parseInt(teacher1.get("id").toString())));
			
			JSONObject teacher2 = engage.loginTeacher("yaelle.chaudy@gmail.com", "Engage2014");		
			assertNull(teacher2);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testUpdateTeacher() {
		Engage engage = new Engage();
		try {
			JSONObject teacher = new JSONObject();
			teacher.put("name", "yaelle");
			teacher.put("surname", "chaudy");
			teacher.put("email", "yaelle.chaudy@gmail.com");
			teacher.put("password", "Engage2014");
			teacher.put("idSchool", "1");
			engage.createTeacher(teacher);
			
			JSONObject teacher2 = engage.loginTeacher("yaelle.chaudy@gmail.com", "Engage2014");		
			teacher2.remove("email");
			teacher2.put("email", "yaelle.chaudy@uws.ac.uk");
			
			assertEquals(1, engage.updateTeacher(teacher2));
			
			assertNotNull(engage.loginTeacher("yaelle.chaudy@uws.ac.uk", "Engage2014"));
			assertNull(engage.loginTeacher("yaelle.chaudy@gmail.com", "Engage2014"));
			
			// clean up
			engage.deleteTeacher(Integer.parseInt(teacher2.get("id").toString()));
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}

}
