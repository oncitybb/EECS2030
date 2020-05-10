package test3;

import java.util.Date;

/**
 * A transit pass that holds a prepaid amount of value.
 * Every prepaid pass has a balance that is greater than or
 * equal to zero. 
 *
 */
public class PrepaidPass extends TransitPass {

	private int balance;
	
	/**
	 * Initialize this pass so that its expiry date is
	 * equal to the given expiry date and its balance is equal
	 * to the given balance.
	 * 
	 * @param expiryDate the expiry date for this pass
	 * @param balance the balance for this pass
	 * @throws IllegalArgumentException if balance is negative or zero
	 */
	public PrepaidPass(Date expiryDate, int balance) {
		super(expiryDate);
		if(balance > 0) {
			this.balance = balance;
		}else {
			throw new IllegalArgumentException("");
		}
	}
	
	/**
	 * Returns the balance of this pass.
	 * 
	 * @return the balance of this pass
	 */
	public int getBalance() {
		return this.balance;
	}
	
	/**
	 * Adds the given amount to the balance of this pass.
	 * 
	 * @param amount an amount of value to add to the balance of this pass
	 * @pre. amount &gt; 0
	 */
	public void add(int amount) {
		this.balance += amount;
	}
	
	/**
	 * Returns true if this pass is valid for the given
	 * date and fare. A pass is valid if its expiry date is
	 * after the given date and if its balance is greater than
	 * or equal to the fare amount.
	 * 
	 * @param date the date of the trip
	 * @param fare the fare amount for the trip
	 * @return true if this transit pass is valid for the given
	 * trip date and fare amount, and false otherwise
	 * @pre. fare &gt; 0
	 */
	@Override
	public boolean isValid(Date date, int fare) {
		if(this.getExpiryDate().after(date) && fare <= balance) {
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Use this pass to pay for a trip on the given
	 * date and fare amount, and increment the number of times
	 * that this pass has been used. The fare amount is deducted from
	 * the balance of this pass.
	 * 
	 * @param date the date of the trip
	 * @param fare the fare amount for the trip
	 * @throws RuntimeException if the pass is not
	 * valid for the given trip date and fare amount
	 * @pre. fare &gt; 0
	 */
	@Override
	public void payFare(Date date, int fare) {
		if(!this.isValid(date, fare)) {
			throw new  RuntimeException();
		}
		super.payFare(date, fare);
		this.balance -= fare;
	}

	
}
