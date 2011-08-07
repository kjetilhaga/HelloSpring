package no.haga.hellospring.tests;

import no.haga.hellospring.client.HelloServiceImpl;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class HelloTests {
    private HelloServiceImpl helloService;

    @Before
    public void setup() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationClientContext.xml");
        helloService = (HelloServiceImpl) context.getBean("helloService");
    }

    @Test
    public void testSayHello() {
        Assert.assertEquals("Hello Spring!", helloService.hello());
    }
}