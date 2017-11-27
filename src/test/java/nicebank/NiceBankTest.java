package nicebank;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by juan.hernandez on 11/17/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:out"}, snippets = SnippetType.CAMELCASE)
public class NiceBankTest {
}
