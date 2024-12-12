package com.edu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration //makes the bean ready
@ComponentScan(basePackages = "com.edu")
public class ComponentConfiguration {

}
