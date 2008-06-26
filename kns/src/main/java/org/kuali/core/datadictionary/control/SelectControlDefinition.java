/*
 * Copyright 2005-2006 The Kuali Foundation.
 * 
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kuali.core.datadictionary.control;


/**
    The select element will render an HTML select control.
    The valuesFinderClass will have a getKeyValues() method
    that returns a list of KeyLabelPair objects.

    An optional script attribute allows java script code to be
    entered.  This code will be run when the user selects a new
    value.
 */
public class SelectControlDefinition extends MultivalueControlDefinitionBase {

    public SelectControlDefinition() {
    }

    /**
     * @see org.kuali.core.datadictionary.control.ControlDefinition#isSelect()
     */
    public boolean isSelect() {
        return true;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "SelectControlDefinition";
    }

}