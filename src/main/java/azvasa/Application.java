package azvasa;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.commons.dbcp2.BasicDataSource;
import com.vmware.vim25.mo.ServiceInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vmware.vim25.mo.ServiceInstance;

@SpringBootApplication()
@ComponentScan(basePackages = {"azvasa"})
@PropertySource(value = {"classpath:/properties/vm.properties","classpath:/properties/db.properties"},ignoreResourceNotFound = false)
public class Application {

    @Value("${vcenter.url}")
    String vcenterUrl;
    @Value("${vcenter.password}")
    String password;

    @Value("${vcenter.username}")
    String vcenterUsername;

    @Value("${spring.datasource.url}")
    String dataSourceUrl;

    @Value("${spring.datasource.username}")
    String dbUserName;

    @Value("${spring.datasource.password}")
    String dbPassword;

    @Value("${spring.datasource.driver-class-name}")
    String dbDriver;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean @Lazy()
    public ServiceInstance getServiceInstance() throws MalformedURLException, RemoteException {
        return new ServiceInstance(new URL(vcenterUrl),vcenterUsername,password,true);
    }

    @Bean
    BasicDataSource getDataSource(){
        final BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dataSourceUrl);
        basicDataSource.setUsername(dbUserName);
        basicDataSource.setPassword(dbPassword);
        return basicDataSource;
    }

    @Bean
    JdbcTemplate JdbcDB() {
        return new JdbcTemplate(getDataSource());
    }

}
