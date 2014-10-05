package entities.crud;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.json.simple.JSONObject;
import org.junit.Test;

import uws.chaudy.generator.Engage;

public class Student {

	// There is a test row in the student table of the database: id=1, username=test, password=test, age=10, gender='m', idSchool=1
	// There is a test row in the student_teacher table of the database: idStudent=1, idTeacher=1
	
	
	@Test
	public void testCreateStudent() {
		try {
			Engage engage = new Engage();
			
			JSONObject student = new JSONObject();
			student.put("username", "test2");
			student.put("password", "test2");
			
			student.put("dateBirth", "2008-07-19");
			
			student.put("gender", "f");
			student.put("idSchool", 1);

		
			assertEquals(1, engage.createStudent(student));
			
		} catch (Exception e) {
			fail(e.toString());
		}
		
	}

	@Test
	public void testUpdateStudent() {
		
		try {
			JSONObject student = new JSONObject();
			student.put("id", 5);
			student.put("username", "test4");
			student.put("password", "test4");
			
			student.put("dateBirth", "2004-01-01");
			
			student.put("gender", "f");
			student.put("idSchool", 1);
			
			Engage engage = new Engage();
			
			assertEquals(1, engage.updateStudent(student));
			JSONObject student2 = engage.getStudentById(5);	
			assertNotNull(student2);
			assertEquals(student, student2);
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testDeleteStudent() {
		Engage engage = new Engage();
		try {
					
			assertEquals(1, engage.deleteStudent(6));
			JSONObject student = engage.getStudentById(6);	
			assertNull(student);
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGetStudentById() {
		Engage engage = new Engage();
		try {
			JSONObject student = new JSONObject();
			student.put("id", 1);
			student.put("username", "test");
			student.put("password", "test");
			
			student.put("dateBirth", "2008-07-19");
			
			student.put("gender", "m");
			student.put("idSchool", 1);
			System.out.println(student.toJSONString());
						
			JSONObject student2 = engage.getStudentById(1);	
			assertEquals(student, student2);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGetStudentsOfTeacher() {
		Engage engage = new Engage();
		try {
			ArrayList<JSONObject> students = new ArrayList<JSONObject>();
			
			JSONObject student = new JSONObject();
			student.put("id", 1);
			student.put("username", "test");
			student.put("password", "test");
			
			student.put("dateBirth", "2008-07-19");
			
			student.put("gender", "m");
			student.put("idSchool", 1);
			student.put("groupName", "test");
			
			students.add(student);
			
			ArrayList<JSONObject> students2 =  engage.getStudentsOfTeacher(1);
			
			System.out.println(students.toString());
			System.out.println(students2.toString());
			
			assertEquals(students, students2);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testAddStudentToTeacherIntInt() {
		Engage engage = new Engage();
		try {
			assertEquals(1, engage.addStudentToTeacher(2, 2));	
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testAddStudentToTeacherIntIntString() {
		Engage engage = new Engage();
		try {
			assertEquals(1, engage.addStudentToTeacher(2, 2, "class205"));			
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGetStudentsOfTeacherByClass() {
		Engage engage = new Engage();
		try {
			ArrayList<JSONObject> students = new ArrayList<JSONObject>();
			
			JSONObject student = new JSONObject();
			student.put("id", 1);
			student.put("username", "test");
			student.put("password", "test");
			
			student.put("dateBirth", "2008-07-19");
			
			student.put("gender", "m");
			student.put("idSchool", 1);
			student.put("groupName", "test");
			
			students.add(student);
			
			ArrayList<JSONObject> students2 =  engage.getStudentsOfTeacherByClass(1, "test");
			
			System.out.println(students.toString());
			System.out.println(students2.toString());
			
			assertEquals(students, students2);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testRemoveStudentFromTeacher()
	{
		Engage engage = new Engage();
		try {
			assertEquals(1, engage.removeStudentFromTeacher(2, 2));			
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void testRemoveStudentFromTeacherByClass()
	{
		Engage engage = new Engage();
		try {
			assertEquals(1, engage.removeStudentFromTeacherByClass(2, 2, "class205"));			
			
		} catch (Exception e) {
			fail(e.toString());
		}
	}

}
