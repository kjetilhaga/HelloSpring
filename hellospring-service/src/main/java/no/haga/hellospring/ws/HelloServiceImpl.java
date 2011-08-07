package no.haga.hellospring.ws;

import no.haga.hellospring.services.InternalService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class HelloServiceImpl implements HelloService {

    @Autowired
    InternalService internalService;

    @Override
    public String hello() {
        return internalService.generateGreetingMessage();
    }
}
