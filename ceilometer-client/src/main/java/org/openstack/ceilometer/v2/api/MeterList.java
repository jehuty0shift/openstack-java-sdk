package org.openstack.ceilometer.v2.api;

import java.util.List;

import org.openstack.base.client.OpenStackClientConnector;
import org.openstack.base.client.OpenStackRequest;
import org.openstack.ceilometer.QueriableCeilometerCommand;
import org.openstack.ceilometer.v2.model.Meter;

public class MeterList extends QueriableCeilometerCommand<MeterList,List<Meter>> {
		
	@Override
	public List<Meter> execute(OpenStackClientConnector connector, OpenStackRequest request) {
		//return query(target.path("meters")).request(MediaType.APPLICATION_JSON).get(new GenericType<List<Meter>>() {});
		return null;
	}

}