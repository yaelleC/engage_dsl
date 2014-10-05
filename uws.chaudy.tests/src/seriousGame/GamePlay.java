package seriousGame;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.junit.Test;

import uws.chaudy.generator.Engage;

public class GamePlay {

	@Test
	public void testGetParametersRequired() {
		Engage engage = new Engage();		
		try {
			assertNotNull(engage.getParametersRequired(2, 27, 0));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void testGetNoParametersRequired() {
		Engage engage = new Engage();		
		try {
			ArrayList<JSONObject> params = new ArrayList<JSONObject>();
			assertEquals(params, engage.getParametersRequired(1, 17, 1));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testStartGamePlayWithKnownPlayer() {
		Engage engage = new Engage();		
		try {
			assertTrue(engage.startGamePlay(17, 1, 1, null) > 0);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testStartGamePlay() {
		Engage engage = new Engage();		
		try {
			ArrayList<JSONObject> params = engage.getParametersRequired(2, 27, 0);
			
			for (JSONObject p : params) {
				switch (p.get("name").toString()) {
				case "gender":
					p.put("value", "m");
					break;
				case "age":
					p.put("value", 15);
					break;
				case "country":
					p.put("value", "France");
					break;
				default:
					p.put("value", "NULL");
					break;
				}
				
			}
			
			System.out.println(params);
			
			assertTrue(engage.startGamePlay(27, 0, 2, params) > 0);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}
	
	@Test
	public void testAssess() {
		Engage engage = new Engage();		
		try {
			JSONObject action = new JSONObject();
			action.put("action", "associate_CountyCapital");
			JSONObject values = new JSONObject();
			values.put("capital", "London");
			values.put("country", "UK");
			action.put("values", values);
			
			ArrayList<JSONObject> feedback = new ArrayList<JSONObject>();
			JSONObject f = new JSONObject();
			f.put("name", "correct_match");
			f.put("type", "POSITIVE");
			f.put("message", "Well done! London is indeed the capital of UK.");
			f.put("id", 192);
			
			feedback.add(f);
			assertEquals(feedback, engage.assess(44, action));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}
	@Test
	public void testGetScores() {
		Engage engage = new Engage();		
		try {
			assertNotNull(engage.getScores(44));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}
	@Test
	public void testGetScore() {
		Engage engage = new Engage();		
		try {
			assertNotNull(engage.getScore(44, 117));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGetFeedback() {
		Engage engage = new Engage();		
		try {
			assertNotNull(engage.getFeedback(50));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testGetLog() {
		Engage engage = new Engage();		
		try {
			assertNotNull(engage.getLog(44));
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	public void testEndGamePlay() {
		Engage engage = new Engage();		
		try {
			assertTrue(engage.endGamePlay(44) > 0);
		} 
		catch (Exception e) {
			fail(e.toString());
		}
	}

}
