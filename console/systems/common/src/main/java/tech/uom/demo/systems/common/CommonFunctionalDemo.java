package tech.uom.demo.systems.common;

import javax.measure.Quantity;
import javax.measure.quantity.Length;

import systems.uom.common.USCustomary;
import tech.units.indriya.quantity.NumberQuantity;
import tech.units.indriya.unit.Units;

public class CommonFunctionalDemo {

	public static void main(String[] args) {
		Quantity<Length> len = NumberQuantity.of(10, Units.METRE);
		Quantity<Length> len2 = len.to(USCustomary.FOOT);
		System.out.println(len2);
	}
}
