package azvasa.controller;

import com.vmware.vim25.mo.ServiceInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

@SpringBootApplication()
@ComponentScan(basePackages = {"azvasa"})
@PropertySource(value = {"classpath:/properties/vm.properties"},ignoreResourceNotFound = false)
public class Application {

    @Value("${vcenter.url}")
    String vcenterUrl;
    @Value("${vcenter.password}")
    String password;

    @Value("${vcenter.username}")
    String vcenterUsername;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServiceInstance getServiceInstance() throws MalformedURLException, RemoteException {
        return new ServiceInstance(new URL(vcenterUrl),vcenterUsername,password,true);
    }

}
