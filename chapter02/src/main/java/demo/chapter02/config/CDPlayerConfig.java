package demo.chapter02.config;

import demo.chapter02.soundsystem.SoundSystemMarkInterface;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "demo.chapter02.soundsystem")
@ComponentScan(basePackageClasses = SoundSystemMarkInterface.class)
public class CDPlayerConfig {
}
