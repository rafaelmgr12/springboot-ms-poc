
package com.rafaelmgr12.spingbootmspoc;

import java.util.Objects;


class CartItem {

	//write your code here 
    
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CartItem cartItem = (CartItem) o;
		return quantity == cartItem.quantity && Objects.equals(item, cartItem.item);
	}

	@Override
	public int hashCode() {
		return Objects.hash(item, quantity);
	}

	@Override
	public String toString() {
		return "CartItem{" + "item=" + item + ", quantity=" + quantity + '}';
	}
}
