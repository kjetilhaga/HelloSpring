package no.haga.hellospring.services;

import no.haga.hellospring.services.InternalService;

public class InternalServiceImpl implements InternalService {
    @Override
    public String generateGreetingMessage() {
        return "Hello Spring!";
    }
}
