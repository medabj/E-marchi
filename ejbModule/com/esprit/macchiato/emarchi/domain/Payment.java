package com.esprit.macchiato.emarchi.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Payment
 *
 */
@Entity

public class Payment implements Serializable {

	   
	@Id
	private int IDPayment;
	private Date paymentDate;
	private static final long serialVersionUID = 1L;

	public Payment() {
		super();
	}   
	public int getIDPayment() {
		return this.IDPayment;
	}

	public void setIDPayment(int IDPayment) {
		this.IDPayment = IDPayment;
	}   
	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
   
}
