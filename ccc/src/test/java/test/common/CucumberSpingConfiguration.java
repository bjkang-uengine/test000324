package test.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import test.CccApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CccApplication.class })
public class CucumberSpingConfiguration {}
