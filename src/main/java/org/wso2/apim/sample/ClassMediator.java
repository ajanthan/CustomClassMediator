package org.wso2.apim.sample;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class ClassMediator extends AbstractMediator { 
	public boolean mediate(MessageContext context) { 
		getLog(context).auditLog("This is a Custom mediator");
		return true;
	}
	
}
