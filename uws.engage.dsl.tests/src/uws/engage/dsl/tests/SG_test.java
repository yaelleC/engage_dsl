package uws.engage.dsl.tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.xtext.validation.Issue;
import org.json.simple.JSONObject;
import org.junit.Test;

import uws.engage.dsl.generator.ParseResult;
import uws.engage.dsl.generator.Parser;

public class SG_test {

	@Test
	public void test_getJSON() {
		try {
			String dsl = readFile("configFile2.txt");
			Parser engage = new Parser();
			JSONObject cf = engage.getJSONfromDSL(dsl);
			System.out.println(cf);
			assertNotNull(cf);
		} 
		catch (Exception e) {
			fail(e.toString());
		}	
		
	}
	
	@Test
	public void test_parseDSL() {
		try {
			String dsl = readFile("configFile2.txt");
			Parser engage = new Parser();
			ParseResult result = engage.parse(dsl);
			
			ArrayList<JSONObject> errors = new ArrayList<JSONObject>();
            if (!result.issues.isEmpty()) {
               for (Issue issue : result.issues) {
                    JSONObject errorLog = new JSONObject(); 
                    errorLog.put("line", issue.getLineNumber());
                    errorLog.put("offset", issue.getOffset());
                    errorLog.put("message", issue.getMessage());
                    errors.add(errorLog);
                }
            }
			System.out.println(errors.toString());
			assertNotNull(errors);
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
