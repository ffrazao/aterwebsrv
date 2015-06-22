package br.gov.df.emater.aterwebsrv;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AterWebApplication.class)
@WebAppConfiguration
public class AterWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
