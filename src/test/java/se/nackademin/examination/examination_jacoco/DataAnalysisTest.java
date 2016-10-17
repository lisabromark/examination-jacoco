package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void test1() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

		ArrayList<String> values2 = new ArrayList<String>();
		values2.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "Uppsala"));
		String result2 = dataAnalysis.buildFinalString(values2);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30' ",
				result2.contains("The name of the homecity is big and the participant is younger than 30"));

		ArrayList<String> values3 = new ArrayList<String>();
		values3.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Rio"));
		String result3 = dataAnalysis.buildFinalString(values3);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or older' ",
				result3.contains("The name of the homecity is small and the participant is 30 or older"));

		ArrayList<String> values4 = new ArrayList<String>();
		values4.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "Rio"));
		String result4 = dataAnalysis.buildFinalString(values4);
		assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
				result4.contains("The name of the homecity is small and the participant is younger than 30"));

		ArrayList<String> values5 = new ArrayList<String>();
		values5.addAll(Arrays.asList("Game", "Lisa", "Bromark", "F", "30", "Rio"));
		String result5 = dataAnalysis.buildFinalString(values5);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
				result5.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

		ArrayList<String> values6 = new ArrayList<String>();
		values6.addAll(Arrays.asList("Game", "Lisa", "Brom", "F", "30", "Rio"));
		String result6 = dataAnalysis.buildFinalString(values6);
		assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younger' ",
				result6.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));

		ArrayList<String> values7 = new ArrayList<String>();
		values7.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Rio"));
		String result7 = dataAnalysis.buildFinalString(values7);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result7.contains("The first name is greater or equals in size to the last name and the participant older than 30"));

		ArrayList<String> values8 = new ArrayList<String>();
		values8.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "31", "Rio"));
		String result8 = dataAnalysis.buildFinalString(values8);
		assertTrue("The result should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result8.contains("The first name is greater or equals in size to the last name and the participant older than 30"));

	}

}
