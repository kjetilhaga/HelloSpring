package springdemo.client;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "HelloServiceImplService", targetNamespace = "http://ws.springdemo/")
public interface HelloService {
    @WebMethod
    String hello();
}
