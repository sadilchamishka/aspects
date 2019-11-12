package com.sample.profileapi.profileapi1;

import net.cake.apiwatch.spring.initializers.ApiWatchConfigService;
import net.cake.apiwatch.spring.initializers.GitPropertyFileRead;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiWatchConfig {

    @Bean
    public ApiWatchConfigService apiWatchConfigService(){
        return new ApiWatchConfigService.Builder()
                //.setHealthEndpoints("Profile API=http://ec2-18-208-160-36.compute-1.amazonaws.com:8383/health")
                //.setApiwatchEndpoints("Operator API=http://ec2-18-208-160-36.compute-1.amazonaws.com:8181/health")
                .setApplicationMemory("true")
                .setSystemMemory("true")
                .registerComponentName("profileapi")
                .build();
    }


    //@Bean
    //public GitPropertyFileRead gitPropertyFileRead(){
        //return new GitPropertyFileRead();
    //}
}
