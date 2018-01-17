/**
 *   File Name: RevNumberTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 16, 2018
 *   
 */

package org.challange.reverseString;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * RevNumberTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class RevNumberTest {
	RevNumber rn;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		rn = new RevNumber();
	}
	
	@Test(enabled = true, groups = {"number", "reverse", "bat", "all"}, priority = 0)
	public void testreverseNumber() {
		int expected = 54321;
		int number = 12345;
		Assert.assertEquals(rn.reverseNumber(number), expected, "reversed number doesn't match to expected");
	}
}
