package com.practice.junit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FirstDayAtSchoolTest {
	
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };
	
	private FirstDayAtSchool firstDayAtSchool ; 

	@Before
	public void setUp() throws Exception {
		firstDayAtSchool = new FirstDayAtSchool();
	}

	@After
	public void tearDown() throws Exception {
		firstDayAtSchool = null;
	}
	
	@Ignore
	@Test
	public void testPrepareMyBag() {
		
		assertArrayEquals(bag1, firstDayAtSchool.prepareMyBag());
	}

	@Test
	public void testAddPencils() {
		assertArrayEquals(bag2, firstDayAtSchool.addPencils());
	}

}
