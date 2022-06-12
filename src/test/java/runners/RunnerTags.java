package runners;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/user_register.feature",
        tags = "@scenario1",
        glue = "co.com.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )


public class RunnerTags {
}
