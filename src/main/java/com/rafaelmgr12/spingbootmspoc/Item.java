package com.rafaelmgr12.spingbootmspoc;

import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Item {

  //write your code here
  
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
            Objects.equals(id, item.id) &&
            Objects.equals(name, item.name) &&
            Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price);
    }

    @Override
    public String toString() {
        return "Item{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", price=" + price +
            '}';
    }

}
