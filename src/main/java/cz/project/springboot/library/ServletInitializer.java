package cz.project.springboot.library;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy // включаем использование AspectJ
@ComponentScan(basePackages = {"cz.project.springboot.library"})
public class ServletInitializer extends SpringBootServletInitializer {

}