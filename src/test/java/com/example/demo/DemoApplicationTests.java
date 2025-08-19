package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void createApplicationModuleModel() {
		ApplicationModules modules = ApplicationModules.of(DemoApplication.class);
		modules.forEach(System.out::println);
	}

	@Test
	void verifiesModularStructure() {
		ApplicationModules modules = ApplicationModules.of(DemoApplication.class);
		modules.verify();
	}

	@Test
	void createModuleDocumentation() {
		ApplicationModules modules = ApplicationModules.of(DemoApplication.class);
		new Documenter(modules)
				.writeDocumentation()
				.writeIndividualModulesAsPlantUml();
	}
}
