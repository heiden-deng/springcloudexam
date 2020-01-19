package com.heiden.spring.appdemo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class TaskDemoApplication {
    public static void main(String[] args){
        SpringApplication.run(TaskDemoApplication.class,args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return new HelloWorldCommandLineRuner();
    }

    public static class HelloWorldCommandLineRuner implements CommandLineRunner{
        @Override
        public void run(String... args) throws Exception {
            System.out.println("Hello World");
        }
    }
}
