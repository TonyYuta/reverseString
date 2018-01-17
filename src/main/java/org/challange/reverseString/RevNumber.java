/**
 *   File Name: RevNumber.java<br>
 *
 *   Yutaka<br>
 *   Created: Jan 16, 2018
 *   
 */

package org.challange.reverseString;

/**
 * RevNumber 
 * not using toString()
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class RevNumber {
	
	int reverseNumber(int num) {
		String resStr = "";
		char[] charArr = String.valueOf(num).toCharArray();
		
		for(int i = String.valueOf(num).length()-1; i >= 0; i--) {
			resStr += charArr[i];
		}
		
		return Integer.valueOf(resStr);
	}	
	
}
