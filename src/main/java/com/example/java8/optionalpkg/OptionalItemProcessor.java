package com.example.java8.optionalpkg;

import java.util.Optional;

public class OptionalItemProcessor {
	public Optional<Item> getItemEmpty() {
		// Some logic here like webservice calls or db calls..
		// if item is successfully processed in our logic..then create optional
		// using Optional.of(Object)
		// else if no item is returned from our logic then
		return Optional.empty();

	}
	
	public Optional<Item> getItem() {
		Item item = new Item();
		item.setName("abc");
		// Some logic here like webservice calls or db calls..
		// if item is successfully processed in our logic..then create optional
		// using Optional.of(Object)
		return Optional.of(item);
		// else if no item is returned from our logic then

	}
}
