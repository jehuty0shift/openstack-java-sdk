package org.openstack.swift.api;

import javax.xml.ws.Response;

import org.openstack.base.client.OpenStackClientConnector;
import org.openstack.base.client.OpenStackRequest;
import org.openstack.swift.SwiftCommand;

public class ShowAccount implements SwiftCommand<Response>{

	@Override
	public Response execute(OpenStackClientConnector connector, OpenStackRequest request) {
//		return target.request(MediaType.APPLICATION_JSON).head();
		return null;
	}

}
