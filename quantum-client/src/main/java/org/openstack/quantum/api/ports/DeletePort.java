package org.openstack.quantum.api.ports;

import org.openstack.base.client.OpenStackClientConnector;
import org.openstack.base.client.OpenStackRequest;
import org.openstack.quantum.client.QuantumCommand;

public class DeletePort implements QuantumCommand<Void> {

private String id;
	
	public DeletePort(String portId){
		this.id = portId;
	}

	public Void execute(OpenStackClientConnector connector, OpenStackRequest request) {
//		target.path("v2.0").path("ports").path(id).request(MediaType.APPLICATION_JSON).delete();
		return null;
	}
}
