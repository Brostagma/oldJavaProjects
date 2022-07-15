package com.brostagma.java;

import java.io.Serializable;

public class Words implements Serializable {

	private static final long serialVersionUID = 01L;
	private char word;
	private boolean prediction = false;
	
	 public Words(char word) {
		 this.word = word;
	 }

	public char getWord() {
		return word;
	}

	public void setWord(char word) {
		this.word = word;
	}

	public boolean isPrediction() {
		return prediction;
	}

	public void setPrediction(boolean prediction) {
		this.prediction = prediction;
	}
	 
	 
}
