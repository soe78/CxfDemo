package demo.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.service.DemoPortType;

@Configuration
public class WebServiceConfig {

    @Bean
    public Endpoint endpoint(final Bus bus, final DemoPortType demo) {
        EndpointImpl endpoint = new EndpointImpl(bus, demo);
        endpoint.publish("/demo");
        return endpoint;
    }

}