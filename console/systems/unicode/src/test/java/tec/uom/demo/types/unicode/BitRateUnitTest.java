/**
 *  Unit-API - Units of Measurement API for Java
 *  Copyright (c) 2005-2016, Jean-Marie Dautelle, Werner Keil, V2COM.
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
 * 3. Neither the name of JSR-363 nor the names of its contributors may be used to endorse or promote products
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
package tec.uom.demo.types.unicode;

import org.hamcrest.Matchers;
import org.junit.Test;

import tech.uom.demo.types.enums.BitRateUnit;

import static org.junit.Assert.assertThat;

/**
 * @author Werner Keil
 * Date: 7/23/11
 * Time: 4:50 PM
 */
public class BitRateUnitTest {

    @Test
    public void testAlternate() throws Exception {
        BitRateUnit bru = BitRateUnit.Kbps;
        BitRateUnit alternate = (BitRateUnit)bru.alternate("K");
        assertThat(alternate, Matchers.equalTo(BitRateUnit.Kbps));
    }

    @Test
    public void testGetBySymbolLower() throws Exception {
        BitRateUnit bru = BitRateUnit.getBySymbol("kbps");
        assertThat(bru, Matchers.equalTo(BitRateUnit.Kbps));
    }

    @Test
    public void testGetBySymbolUpper() throws Exception {
        BitRateUnit bru = BitRateUnit.getBySymbol("MBPS");
        assertThat(bru, Matchers.equalTo(BitRateUnit.Mbps));
    }
}
