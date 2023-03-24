package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.AaaApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { AaaApplication.class })
public class CucumberSpingConfiguration {}
