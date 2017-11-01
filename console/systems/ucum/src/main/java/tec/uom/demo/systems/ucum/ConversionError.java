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
package tec.uom.demo.systems.ucum;

import javax.measure.Unit;
import javax.measure.format.UnitFormat;

import systems.uom.ucum.format.UCUMFormat;
import systems.uom.ucum.format.UCUMFormat.Variant;

public class ConversionError {

    public static void main(String[] args) {

      final UnitFormat ucumFormat = UCUMFormat.getInstance(Variant.CASE_SENSITIVE);
      final UnitFormat ucumFormatPrint = UCUMFormat.getInstance(Variant.PRINT);
      Unit<?> glomerular = ucumFormat.parse("mL/min/((173/100).m2)");
       System.out.println(glomerular);
       System.out.println(ucumFormat.format(glomerular));
       System.out.println(ucumFormatPrint.format(glomerular));
      ucumFormat.parse(ucumFormat.format(glomerular));
    }
  }
