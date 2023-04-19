package org.magnus.bdd.cucumber

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/cucumber/features"),
  publish = true,
  tags = "@wip"
)
class TestRunner {}