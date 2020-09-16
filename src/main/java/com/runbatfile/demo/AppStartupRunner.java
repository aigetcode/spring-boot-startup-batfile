package com.runbatfile.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements ApplicationRunner {

    @Value("${path.to.bat.file}")
    private String pathToBatFile;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Runtime.getRuntime().exec(pathToBatFile);
    }
}
