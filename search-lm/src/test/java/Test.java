/*
Copyright Härnösands kommun(C) 2014 

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    All rights reserved. This program and the accompanying materials
    are made available under the terms of the GNU Affero General Public License
    which accompanies this distribution, and is available at
    http://www.gnu.org/licenses/agpl-3.0.html
 */
import java.io.IOException;

import junit.framework.Assert;
import junit.framework.TestCase;
import se.riges.search.lm.RegisterServiceUtils;


public class Test extends TestCase {

	public void testFindObjektidentitet() throws IOException {
		try{
//		Assert.assertEquals("909a6a81-0618-90ec-e040-ed8f66444c3f", RegisterServiceUtils.findRegisterbeteckning("SUNDSVALL TOMMING 2:6").get(0).getObjektidentitet(), "sundsvall");
		}catch(Exception x){
			System.out.println(x);
		}
//		Assert.assertEquals(8, RegisterServiceUtils.findRegisterbeteckning("SUNDSVALL NYTTAN", "sundsvall").size());
	}
}