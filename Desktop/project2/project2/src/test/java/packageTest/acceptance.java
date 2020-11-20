package packageTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features= "use-case",
plugin = { "html:target/cucumber/wikipedia.html"},
monochrome=true,
snippets=SnippetType.CAMELCASE,
glue = { ""},
strict=true )
public class acceptance {

}
