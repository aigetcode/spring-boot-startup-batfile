package com.runbatfile.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements CommandLineRunner {

    @Value("${path.to.bat.file}")
    private String pathToBatFile;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(" --- Start bat file");
        Runtime.getRuntime().exec("cmd /c start \"\" " + pathToBatFile);
        System.out.println(" --- End bat file");

        SpringApplication.exit(RunbatfileApplication.context, () -> 0);
    }
}
