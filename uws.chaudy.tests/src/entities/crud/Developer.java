package entities.crud;

import static org.junit.Assert.*;

import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Test;

import uws.chaudy.generator.Engage;

public class Developer {
	
	// There is a test row in the database: id=1, name=test, surname=test, email=test@test.com and password=test

	@Test
	public void testCreateDeveloper() {
		
		Engage engage = new Engage();
		
		JSONObject developer = new JSONObject();
		developer.put("name", "yaelle");
		developer.put("surname", "chaudy");
		developer.put("email", "yaelle.chaudy@gmail.com");
		developer.put("password", "Engage2014");
		
		try {
			assertEquals(1, engage.createDeveloper(developer));		
			
			// clean up
			JSONObject dev = engage.loginDeveloper("yaelle.chaudy@gmail.com", "Engage2014");
			engage.deleteDeveloper(Integer.parseInt(dev.get("id").toString()));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGoodLoginDeveloper() {
		
		Engage engage = new Engage();
		try {
			JSONObject dev = engage.loginDeveloper("test@test.com", "test");
			assertNotNull(dev);
			assertEquals("test", dev.get("name"));
			assertEquals("test", dev.get("surname"));
			assertEquals("test@test.com", dev.get("email"));
			assertEquals("test", dev.get("password"));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void testWrongLoginDeveloper() {
		
		Engage engage = new Engage();
		JSONObject developer;
		try {
			developer = engage.loginDeveloper("inexisting address", "Engage2014");
			assertNull(developer);
			
			developer = engage.loginDeveloper("yaelle.chaudy@gmail.com", "Wrong password");
			assertNull(developer);
		} catch (Exception e) {
			fail(e.toString());
		}		
	}

	@Test
	public void testDeleteDeveloper() {
		Engage engage = new Engage();
		try {
			JSONObject developer = new JSONObject();
			developer.put("name", "yaelle");
			developer.put("surname", "chaudy");
			developer.put("email", "yaelle.chaudy@gmail.com");
			developer.put("password", "Engage2014");
			engage.createDeveloper(developer);
			
			JSONObject dev = engage.loginDeveloper("yaelle.chaudy@gmail.com", "Engage2014");		
			assertEquals(1, engage.deleteDeveloper(Integer.parseInt(dev.get("id").toString())));
			JSONObject dev2 = engage.loginDeveloper("yaelle.chaudy@gmail.com", "Engage2014");		
			assertNull(dev2);
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testUpdateDeveloper() {
		Engage engage = new Engage();
		try {
			JSONObject developer = new JSONObject();
			developer.put("name", "yaelle");
			developer.put("surname", "chaudy");
			developer.put("email", "yaelle.chaudy@gmail.com");
			developer.put("password", "Engage2014");
			engage.createDeveloper(developer);
			
			JSONObject dev = engage.loginDeveloper("yaelle.chaudy@gmail.com", "Engage2014");		
			dev.remove("email");
			dev.put("email", "yaelle.chaudy@uws.ac.uk");
			
			assertEquals(1, engage.updateDeveloper(dev));
			
			assertNotNull(engage.loginDeveloper("yaelle.chaudy@uws.ac.uk", "Engage2014"));
			assertNull(engage.loginDeveloper("yaelle.chaudy@gmail.com", "Engage2014"));
			
			// clean up
			engage.deleteDeveloper(Integer.parseInt(dev.get("id").toString()));
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}

}
