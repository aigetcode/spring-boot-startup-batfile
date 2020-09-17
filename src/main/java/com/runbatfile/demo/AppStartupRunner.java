package com.runbatfile.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements CommandLineRunner {

    @Value("${path.to.bat.file}")
    private String pathToBatFile;

    @Override
    public void run(String... args) throws Exception {
        try {
            System.out.println(" --- Start bat file");
            Runtime.getRuntime().exec("cmd /c start \"\" " + pathToBatFile);
            System.out.println(" --- End bat file");

            RunbatfileApplication.context.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
