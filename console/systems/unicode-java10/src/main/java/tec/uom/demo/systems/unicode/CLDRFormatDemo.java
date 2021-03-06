/*
 * Units of Measurement Systems for Java
 * Copyright (c) 2005-2017, Jean-Marie Dautelle, Werner Keil and others.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-363 nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
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
package tec.uom.demo.systems.unicode;

import javax.measure.Unit;
import javax.measure.format.UnitFormat;
import javax.measure.spi.ServiceProvider;

import systems.uom.quantity.Information;
import tec.uom.se.AbstractUnit;
import tec.uom.se.format.EBNFUnitFormat;
import tec.uom.se.format.SimpleUnitFormat;
import tec.uom.se.unit.Units;

import static systems.uom.unicode.CLDR.*;

public class CLDRFormatDemo {
    public static void main(String[] args) {
	ServiceProvider.current().getSystemOfUnitsService().getSystemOfUnits("CLDR");
//	Unit test = BYTE;
	Unit x = AbstractUnit.parse("B");
	System.out.println(x);

	Unit y = AbstractUnit.parse("N");
	System.out.println(y);
	
        UnitFormat unitFormat = SimpleUnitFormat.getInstance();
        Unit<Information> bit = unitFormat.parse("bit").asType(Information.class);
        System.out.println(bit);
        
        Unit<Information> byteU = unitFormat.parse("byte").asType(Information.class);
        System.out.println(byteU);
//        System.out.println(BYTE.equals(byteU));
        
        UnitFormat format2 = EBNFUnitFormat.getInstance();
        System.out.println(format2.format(FOOT));
        
        System.out.println(format2.format(Units.AMPERE));
        System.out.println(format2.format(METER));
        System.out.println(format2.format(CENTIMETER));
        System.out.println(format2.format(MILLIMETER));
        System.out.println(format2.format(INCH));
        System.out.println(format2.format(YARD));
        
        System.out.println(format2.format(KILOGRAM));
        System.out.println(format2.format(GRAM));
    }

}
