package demo.service.impl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.service.DemoPortType;
import demo.service.model.IsAlive;
import demo.service.model.IsAliveResponse;

@WebService(serviceName = "DemoPortTypeImpl", portName = "DemoPort", endpointInterface = "demo.service.DemoPortType", targetNamespace = "http://demo")
@Component
public class DemoPortTypeImpl implements DemoPortType {

    private static final Logger LOG = LoggerFactory.getLogger(DemoPortTypeImpl.class.getName());

    @Autowired
    public DemoPortTypeImpl() {
    }

    @Override
    public IsAliveResponse isAlive(final IsAlive isAlive) {
        IsAliveResponse response = new IsAliveResponse();
        LOG.info("alive");
        return response;
    }
}
