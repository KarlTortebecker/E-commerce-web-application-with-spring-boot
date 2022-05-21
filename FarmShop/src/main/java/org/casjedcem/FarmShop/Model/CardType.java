package org.casjedcem.FarmShop.Model;
/***********************************************************************
 * Module:  CardType.java
 * Author:  FantasyMachine
 * Purpose: Defines the Class CardType
 ***********************************************************************/


public enum CardType {

	/**
	 * @param : value
	 */
	MTN_MONEY("MTN MONEY"), NONE("NONE"),
	ORANGE_MONEY("ORANGE MONEY"), PAY_PAL("PAY PAL"), UBA_CARD("UBA CARD");


	CardType(String value) {

		this.value = value;
	}

	private final String value;


}
