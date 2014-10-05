package accessToSG;

import static org.junit.Assert.*;

import org.junit.Test;

import uws.chaudy.generator.Engage;

public class SGaccess {

	@Test
	public void testGiveSGaccessToSchool() {
		Engage engage = new Engage();
		try
		{
			assertEquals(1, engage.giveSGaccessToSchool(8, 1));
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGiveSGaccessToStudent() {
		Engage engage = new Engage();
		try
		{
			assertEquals(1, engage.giveSGaccessToStudent(8, 1, 0));
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGetStudentVersionOfSG() {
		Engage engage = new Engage();
		try
		{
			assertEquals(0, engage.getStudentVersionOfSG(8, 1));
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testLoginStudent() {
		Engage engage = new Engage();
		try
		{
			assertEquals(0, engage.loginStudent("test", "test", 8));
		}
		catch (Exception e) {
			fail(e.toString());
		}
	}

}
