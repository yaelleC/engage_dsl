package entities.crud;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.Test;

import uws.chaudy.generator.Engage;

public class School {

	// There is a test row in the database: id=1, name=test, country=test, city=test


	@Test
	public void testCreateSchool() {
		Engage engage = new Engage();
		
		JSONObject school = new JSONObject();
		school.put("name", "uws");
		school.put("country", "uk");
		school.put("city", "paisley");
		
		try {
			assertEquals(1, engage.createSchool(school));		
			
			// clean up
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void testGetSchoolById() {
Engage engage = new Engage();
		
		JSONObject school = new JSONObject();
		school.put("id", 1);
		school.put("name", "test");
		school.put("country", "test");
		school.put("city", "test");
		
		try {
			assertEquals(school, engage.getSchoolById(1));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testUpdateSchool() {
		Engage engage = new Engage();
		
		JSONObject school = new JSONObject();
		school.put("id", 2);
		school.put("name", "uws2");
		school.put("country", "uk2");
		school.put("city", "paisley2");
		
		try {
			assertEquals(1, engage.updateSchool(school));
			JSONObject school2 = engage.getSchoolById(2);	
			assertNotNull(school2);
			assertEquals(school, school2);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testDeleteSchool() {
		Engage engage = new Engage();
		try {
			assertEquals(1, engage.deleteSchool(4));
			assertEquals(new JSONObject(), engage.getSchoolById(4));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	

}
