// Singleton with public final field - Page 17
package org.effectivejava.examples.chapter02.item03.field;

public class Elvis {
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
	}

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		//TODO: algo 5
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}
