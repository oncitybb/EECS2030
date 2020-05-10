package eecs2030.test3;

import java.util.Calendar;
import java.util.Date;

/**
 * This class represents a card.
 * 
 * @author eecs2030
 */

public abstract class Card {

	private String name;
	private Date birthDate;
	// @ invariant name != null && birthDate != null

	/**
	 * Initializes this card with the given name and birth date.
	 * 
	 * @param name
	 *            the name of the holder of this card. 
	 * @pre. name != null
	 * @param birthDate
	 *            the birth date of the holder of this card. 
	 * @pre. birthDate != null
	 */
	public Card(String name, Date birthDate) {
		this.setName(name);
		this.setBirthDate(birthDate);
	}

	/**
	 * Returns the name of the holder of this card.
	 * 
	 * @return the name of the holder of this card.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns the birth date of the holder of this card.
	 * 
	 * @return the birth date of the holder of this card.
	 */
	private Date getBirthDate() {
		return this.birthDate;
	}

	/**
	 * Sets the name of the holder of this card to the given name.
	 * 
	 * @param name
	 *            the name of the holder of this card. 
	 * @pre. name != null
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the birth date of the holder of this card to the given date.
	 * 
	 * @param birthDate
	 *            the birth date of the holder of this card. 
	 * @pre. birthDate != null
	 */
	private void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * Returns the day of the birth date of the holder of this card.
	 * 
	 * @return the day of the birth date of the holder of this card.
	 */
	public int getBirthDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthDate);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * Returns the month of the birth date of the holder of this card.
	 * 
	 * @return the month of the birth date of the holder of this card.
	 */
	public int getBirthMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthDate);
		return 1 + calendar.get(Calendar.MONTH);
	}

	/**
	 * Tests whether this card is the same as the given object. Two cards the
	 * same if they have the same name and birth date.
	 * 
	 * @param object
	 *            an object.
	 * @return true if this card is the same as the given object, false
	 *         otherwise.
	 */
	public boolean equals(Object object) {
		boolean equals;
		if (object != null && this.getClass() == object.getClass()) {
			Card other = (Card) object;
			equals = this.getName().equals(other.getName()) && this.getBirthDate().equals(other.getBirthDate());
		} else {
			equals = false;
		}
		return equals;
	}

	/**
	 * Returns the hash code of this card.
	 * 
	 * @return the hash code of this card.
	 */
	public int hashCode() {
		return this.getName().hashCode() + this.getBirthDate().hashCode();
	}

	/**
	 * Returns a string representation of this card.
	 * 
	 * @return a string representation of this card.
	 */
	public String toString() {
		return String.format("Card of %s", this.getName());
	}

}
