/*******************************************************************************
 * Copyright (c) 2019-2020 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.pgcase.xobot.runtime.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	
	public static BigInteger md5Custom(String st) throws NoSuchAlgorithmException {
		
	    byte[] digest = new byte[0];
 
	    MessageDigest messageDigest = MessageDigest.getInstance("MD5"); //$NON-NLS-1$
	    messageDigest.reset();
        messageDigest.update(st.getBytes());
        digest = messageDigest.digest();
	   
	    return new BigInteger(1, digest);
	    
	}
}
