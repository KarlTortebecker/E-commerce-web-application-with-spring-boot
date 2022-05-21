package org.casjedcem.FarmShop.Model;


public enum OrderState {

    RELEASE("RELEASE"), ONGOING("ONGOING"),
    FAILURE("FAILURE"),  CANCELLED("CANCELLED");

    private final String value;

    OrderState(String value) {

        this.value = value;
    }
}
