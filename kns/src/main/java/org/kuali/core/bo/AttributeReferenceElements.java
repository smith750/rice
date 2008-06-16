/*
 * Copyright 2005-2007 The Kuali Foundation.
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
package org.kuali.core.bo;


import java.util.LinkedHashMap;



/**
 * Attribute Reference Dummy Business Object
 */
public class AttributeReferenceElements extends PersistableBusinessObjectExtensionBase {
    private static final long serialVersionUID = -7646503995716194181L;
    private String infoTextArea;
    private String extendedTextArea;

    /**
     * 
     * Constructs a AttributeReferenceDummy.java.
     * 
     */
    public AttributeReferenceElements() {
    }

    /**
     * @see org.kuali.core.bo.BusinessObjectBase#toStringMapper()
     */
    @SuppressWarnings("unchecked")
    protected LinkedHashMap<String, Object> toStringMapper() {
        LinkedHashMap m = new LinkedHashMap();

        m.put("hashCode", Integer.toHexString(hashCode()));

        return m;
    }

    /**
     * Gets the infoTextArea attribute.
     * 
     * @return Returns the infoTextArea.
     */
    public String getInfoTextArea() {
        return infoTextArea;
    }

    /**
     * Sets the infoTextArea attribute value.
     * 
     * @param infoTextArea The infoTextArea to set.
     */
    public void setInfoTextArea(String infoTextArea) {
        this.infoTextArea = infoTextArea;
    }

    /**
     * @return the extendedTextArea
     */
    public final String getExtendedTextArea() {
        return this.extendedTextArea;
    }

    /**
     * @param extendedTextArea the extendedTextArea to set
     */
    public final void setExtendedTextArea(String extendedTextArea) {
        this.extendedTextArea = extendedTextArea;
    }
}