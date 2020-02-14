import cucumber.api.CucumberOptions;
import org.glassfish.jersey.internal.inject.Custom;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@CucumberOptions(features = {"src/test/resources"}, glue = {"com.sapient.steps"})

@RunWith(Runner.class)
public class CumcumberSuitRunner {


}
