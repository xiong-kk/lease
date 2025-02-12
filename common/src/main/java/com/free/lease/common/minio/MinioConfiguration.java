package com.free.lease.common.minio;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties(MinioProperties.class)
@ConfigurationPropertiesScan("com.free.lease.common.minio")
public class MinioConfiguration {

    @Autowired
    private MinioProperties properties;
    @Bean
    public MinioClient minioClient(){
        return MinioClient.builder().endpoint(properties.getEndpoint()).credentials(properties.getAccessKey(), properties.getSecretKey()).build();
    }
}
