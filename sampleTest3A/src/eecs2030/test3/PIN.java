package eecs2030.test3;

import java.util.Random;

/**
 * This class represents a personal identification number, or
 * PIN for short.  Each PIN consists of four digits.
 * 
 */

public class PIN {

	private StringBuffer number;

	/**
	 * Length of a PIN.
	 */
	public static final int LENGTH = 4;

	/**
	 * Pseudorandom number generator.
	 */
	private Random random = new Random(System.currentTimeMillis());

	/**
	 * Initializes this PIN randomly.
	 */
	public PIN()
	{
		final int MAX = 9999;
		this.setNumber("" + (1 + random.nextInt(MAX)));
	}

	/**
	 * Initializes this PIN with the given number.
	 *
	 * @param number the number of this PIN.
	 * @pre. number != null AND number.length() == PIN.NUMBER
	 * @throws IllegalArgumentException if number does not consist of digits 
	 */
	public PIN(String number) throws IllegalArgumentException
	{
		this.setNumber(number);
	}

	/**
	 * Returns the number of this PIN.
	 * 
	 * @return the number of this PIN.
	 */
	public StringBuffer getNumber() 
	{
		return this.number;
	}

	/**
	 * Sets the number of this PIN to the given number.
	 * 
	 * @param number the number of this PIN.
	 * @pre. number != null AND number.length() == PIN.NUMBER
	 * @param IllegalArgumentException if number does not consist of digits
	 */
	private void setNumber(String number) throws IllegalArgumentException
	{
		if (!number.matches("\\d*"))
		{
			throw new IllegalArgumentException("Number does not consist only of digits");
		}
		this.number = new StringBuffer(number);
	}

	/**
	 * Returns the hash code of this PIN.
	 * 
	 * @return the hash code of this PIN.
	 */
	public int hashCode() 
	{
		return this.getNumber().hashCode();
	}

	/**
	 * Tests whether this PIN is the same as the given object.
	 * Two PINs are the same if they have the same number.
	 * 
	 * @param object an object.
	 * @return true if this PIN is the same as the given object,
	 * false otherwise.
	 */
	public boolean equals(Object object) 
	{
		boolean equals;
		if (object != null && this.getClass() == object.getClass())
		{
			PIN other = (PIN) object;
			equals = this.toString().equals(other.toString());
		}
		else
		{
			equals = false;
		}
		return equals;
	}

	/**
	 * Returns a string representation of this PIN consisting of
	 * its number.
	 * 
	 * @return a string representation of this PIN.
	 */
	public String toString() 
	{
		return this.getNumber().toString();
	}
}
