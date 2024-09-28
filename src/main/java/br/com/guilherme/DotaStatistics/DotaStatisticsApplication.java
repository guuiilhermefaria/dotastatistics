package br.com.guilherme.DotaStatistics;

import br.com.guilherme.DotaStatistics.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DotaStatisticsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DotaStatisticsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main mainClass = new Main();
		mainClass.showMenu();
	}
}
