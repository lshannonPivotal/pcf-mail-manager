package io.pivotal.fe.pcf.mailmanager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MailSenderApplication.class)
@WebAppConfiguration
public class MailSenderApplicationTests {

	@Test
	public void contextLoads() {
	}

}