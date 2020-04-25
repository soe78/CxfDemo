package demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import demo.service.model.IsAlive;
import demo.service.model.IsAliveResponse;

@WebService(targetNamespace = "http://demo", name = "DemoPort")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DemoPortType {

    /**
     * Monitoring Operation des Service.
     */
    @WebMethod
    @WebResult(name = "isAliveResponse", targetNamespace = "http://isalive", partName = "isAliveResponse")
    public IsAliveResponse isAlive(
            @WebParam(partName = "isAlive", name = "isAlive", targetNamespace = "http://isalive") IsAlive isAlive);

}
