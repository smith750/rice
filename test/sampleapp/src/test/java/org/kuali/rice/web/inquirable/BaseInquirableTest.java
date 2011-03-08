/*
 * Copyright 2007 The Kuali Foundation
 * 
 * Licensed under the Educational Community License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.opensource.org/licenses/ecl2.php
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.kuali.rice.web.inquirable;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.kuali.rice.test.web.HtmlUnitUtil;
import org.kuali.rice.web.test.ServerTestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Ignore
public class BaseInquirableTest extends ServerTestBase {

	private WebClient webClient;
	
	@Before
	public void setupClient() {
		webClient = new WebClient(BrowserVersion.INTERNET_EXPLORER_6);
	}
	
	@After
	public void cleanupClient() {
        if (webClient != null) {
            webClient.closeAllWindows();
        }
        webClient = null;
	}
	
	@Test
	public void testInquiryFetch() throws Exception {
		HtmlPage inquiryPage = HtmlUnitUtil.gotoPageAndLogin(webClient, HtmlUnitUtil.BASE_URL + "/kr/inquiry.do?businessObjectClassName=edu.sampleu.travel.bo.TravelAccount&number=a1&methodToCall=start");
		assertEquals("Kuali :: Inquiry", inquiryPage.getTitleText());
		assertTrue("Inquiry page should have 'Travel Account Inquiry' in title bar", HtmlUnitUtil.pageContainsText(inquiryPage, "Travel Account Inquiry"));
	}

}
