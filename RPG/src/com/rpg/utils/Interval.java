package com.rpg.utils;

import java.util.Date;
import java.util.Random;

public class Interval{
	
	private Integer minimum;
	private Integer maximum;
	
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	
	public Interval(Integer minimum, Integer maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	public Integer getRandom(){
		
			Random rnd = new Random(new Date().getTime());
			Integer valeur = minimum + rnd.nextInt(maximum - minimum);
			return valeur;
		
	}
	
}
