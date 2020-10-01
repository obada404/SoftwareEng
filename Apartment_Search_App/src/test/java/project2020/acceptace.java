package project2020;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features= "case",
plugin = { "html:target/cucumber/wikipedia.html"},
monochrome=true,
snippets=SnippetType.CAMELCASE,
glue = { "project2020"},
strict=true )
public class acceptace {

}
