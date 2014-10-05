package seriousGame;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

import uws.chaudy.generator.Engage;

public class SGManipulation {

	@Test
	public void testCreateSGString() {
		try {
			String dsl = readFile("configFile2.txt");
			Engage engage = new Engage();
			int idSG = engage.createSG(dsl);
			assertTrue(idSG > 0);
		} 
		catch (Exception e) {
			fail(e.toString());
		}	
		
	}

	@Test
	public void testUpdateSG() {
		try {
			String jsonUpdateString = readFile("configFile2Update.txt");			
			JSONObject jsonUpdate = (JSONObject) new JSONParser().parse(jsonUpdateString);
			Engage engage = new Engage();
			int idSG = engage.updateSG(jsonUpdate);
			assertTrue(idSG > 0);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	private static String readFile( String file ) throws IOException {
	    @SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader( new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    while( ( line = reader.readLine() ) != null ) {
	        stringBuilder.append( line );
	        stringBuilder.append( ls );
	    }

	    return stringBuilder.toString();
	}

}
