import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.restdocs.RestDocsRestAssuredConfigurationCustomizer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;
import java.util.TimeZone;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseAPITest {

    @Inject
    public TestRestTemplate restTemplate;

    @Inject
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void runContracts(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
       // RestDocsRestAssuredConfigurationCustomize
    }

    public BaseAPITest(){
        TimeZone utcTime = TimeZone.getTimeZone("UTC");
    }

    @Test
    public void mockTest(){

    }
}


