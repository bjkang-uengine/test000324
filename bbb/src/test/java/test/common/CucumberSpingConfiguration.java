package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.BbbApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { BbbApplication.class })
public class CucumberSpingConfiguration {}
