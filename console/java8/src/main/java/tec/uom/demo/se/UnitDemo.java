/*
 *  Units of Measurement Console Demos
 *  Copyright (c) 2005-2017, Werner Keil and others.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-363, Unit-API nor the names of their contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package tec.uom.demo.se;

import static tec.uom.se.unit.MetricPrefix.KILO;

import javax.measure.Unit;
import javax.measure.quantity.Speed;

import tec.uom.se.unit.Units;

public class UnitDemo {

	public static void main(String[] args) {
		Unit<Speed> kmh = KILO(Units.METRE).divide(Units.HOUR).asType(Speed.class);
//		Unit<Speed> kmh2 = SIPrefix.KILO(Units.METRE).multiply(UCUM.HOUR).asType(Speed.class);
		Unit<?> kmh3 = KILO(Units.METRE).multiply(Units.HOUR);		
		Unit<?> result = kmh.multiply(Units.HOUR);
		
		System.out.println(kmh);
//		System.out.println(kmh2);
		System.out.println(kmh3);
		System.out.println(result);
		Unit m = Units.MOLE.divide(Units.CUBIC_METRE);
		System.out.println(m);
		System.out.println(m.getSymbol());
	}

}
