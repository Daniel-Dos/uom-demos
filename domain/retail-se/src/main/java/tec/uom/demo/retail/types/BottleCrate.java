/*
 * Units of Measurement Demos
 * Copyright © 2005-2016, Jean-Marie Dautelle, Werner Keil, V2COM.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-363, Unit-API nor the names of their contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
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
package tec.uom.demo.retail.types;

import java.util.Collection;
import java.util.function.Supplier;

import javax.measure.Unit;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import tec.uom.domain.retail.Crate;
import tec.uom.lib.common.function.UnitSupplier;

public class BottleCrate implements Supplier<Collection<Bottle>>, UnitSupplier<Crate> {

	private final Collection<Bottle> bottles;
	private final Unit<Crate> unit;
	
	public BottleCrate(Collection<Bottle> b, Unit<Crate> u) {
		this.bottles = b;
		this.unit = u;
	}
	
	@Override
	public Collection<Bottle> get() {
		return bottles;
	}

	@Override
	public Unit<Crate> getUnit() {
		return unit;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
