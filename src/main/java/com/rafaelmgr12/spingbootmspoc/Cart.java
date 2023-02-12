package com.rafaelmgr12.spingbootmspoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;

class Cart {

	//write your code here
    
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Cart cart = (Cart) o;
		return Objects.equals(id, cart.id) && Objects.equals(cartItems, cart.cartItems);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, cartItems);
	}

	@Override
	public String toString() {
		return "Cart{" + "id='" + id + '\'' + ", cartItems=" + cartItems + '}';
	}
}
