package ro.ubb.lab7.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ro.ubb.lab7.core.repository", "ro.ubb.lab7.core.service", "ro.ubb.lab7.core.ui"})
public class CatalogConfig {


}
