/*
 * Copyright 2007 The Kuali Foundation
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
package org.kuali.rice.kns.document.authorization;

import org.apache.commons.lang.StringUtils;
import org.kuali.rice.kim.bo.Person;
import org.kuali.rice.kim.service.KIMServiceLocator;
import org.kuali.rice.kns.bo.Parameter;
import org.kuali.rice.kns.document.Document;
import org.kuali.rice.kns.document.MaintenanceDocument;

/**
 * This is a description of what this class does - kellerj don't forget to fill this in. 
 * 
 * @author Kuali Rice Team (kuali-rice@googlegroups.com)
 *
 */
public class ParameterMaintenanceDocumentAuthorizer extends MaintenanceDocumentAuthorizerBase {

    /**
     * This overridden method ...
     * 
     * @see org.kuali.rice.kns.document.authorization.DocumentAuthorizerBase#hasInitiateAuthorization(org.kuali.rice.kns.document.Document, org.kuali.rice.kim.bo.Person)
     */
    @Override
    public boolean hasInitiateAuthorization(Document document, Person user) {
        boolean hasInitiateAuth = super.hasInitiateAuthorization(document, user);
        
        // user can not initiate if they are not in the workgroup
        if ( hasInitiateAuth ) {
            Parameter oldParm = (Parameter)((MaintenanceDocument)document).getOldMaintainableObject().getBusinessObject();
            // don't enforce the workgroup limitation when creating a new parameter
            if ( oldParm != null && oldParm.getParameterName() != null ) {
                Parameter parm = (Parameter)((MaintenanceDocument)document).getNewMaintainableObject().getBusinessObject();
                if ( parm != null 
            	    && StringUtils.isNotBlank( parm.getParameterWorkgroupName() ) 
            	    && !KIMServiceLocator.getIdentityManagementService().isMemberOfGroup(user.getPrincipalId(), org.kuali.rice.kim.util.KimConstants.TEMP_GROUP_NAMESPACE, parm.getParameterWorkgroupName() ) ) {
                	hasInitiateAuth = false;
                }
            }
        }
        
        return hasInitiateAuth;
    }
    
}

