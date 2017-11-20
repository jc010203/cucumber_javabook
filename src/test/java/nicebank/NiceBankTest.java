package nicebank;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by juan.hernandez on 11/17/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty","junit:target/junit.xml"})
public class NiceBankTest {
}
