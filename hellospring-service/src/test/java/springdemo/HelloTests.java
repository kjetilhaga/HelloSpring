package springdemo;

import no.haga.hellospring.ws.HelloService;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class HelloTests {
    private HelloService helloService;

    @Before
    public void setup() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationClientContext.xml");
        helloService = (HelloService) context.getBean("helloService");
    }

    @Test
    public void testSayHello() {
        Assert.assertSame("Hello Spring", helloService.hello());
    }
}
