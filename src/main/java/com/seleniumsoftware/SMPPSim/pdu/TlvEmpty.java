/****************************************************************************
 * Tlv.java
 *
 * Copyright (C) Selenium Software Ltd 2006
 *
 * This file is part of SMPPSim.
 *
 * SMPPSim is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * SMPPSim is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with SMPPSim; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * @author martin@seleniumsoftware.com
 * http://www.woolleynet.com
 * http://www.seleniumsoftware.com
 * $Header: /var/cvsroot/SMPPSim2/distribution/2.6.0/SMPPSim/src/java/com/seleniumsoftware/SMPPSim/pdu/TlvEmpty.java,v 1.1 2009/03/11 08:41:45 martin Exp $
 ****************************************************************************/

package com.seleniumsoftware.SMPPSim.pdu;
import com.seleniumsoftware.SMPPSim.pdu.util.*;

public class TlvEmpty extends Tlv {
	
	private short tag;
	private short len;
	
	public TlvEmpty(short t, short l) {
		tag = t;
		len = l;
	}
	
	/**
	 * @return Returns the len.
	 */
	public short getLen() {
		return len;
	}
	/**
	 * @param len The len to set.
	 */
	public void setLen(short len) {
		this.len = len;
	}
	/**
	 * @return Returns the tag.
	 */
	public short getTag() {
		return tag;
	}
	/**
	 * @param tag The tag to set.
	 */
	public void setTag(short tag) {
		this.tag = tag;
	}
	
	public String toString() {
		return "tag="+tag+",len="+len;
	}
}