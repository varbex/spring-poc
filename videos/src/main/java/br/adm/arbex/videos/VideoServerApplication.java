package br.adm.arbex.videos;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class VideoServerApplication {

  private static final Logger log = LoggerFactory.getLogger(VideoServerApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(VideoServerApplication.class);
  }

}