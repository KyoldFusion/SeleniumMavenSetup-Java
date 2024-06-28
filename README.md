# Selenium Maven Setup -Java

Hello! This is a guide on how to setup a quick Selenium Automation framework for your personal use or for setting up a testing suite. I have it organized by folders and you can create your own with the templates I provide inside of templates if you'd like to copy and paste those into your original code. I hope you enjoy them and this is a useful experience for you! If you have any questions or concerns on how to implement anything testing feel free to message me and I will try to support you troubleshooting!

## IDE Setup (IntelliJ)

IntelliJ Site: https://www.jetbrains.com/
    - Navigate to Downloads page
    - Scroll to get community edition (free)

Install everything on default (if you have an old version to uninstall check uninstall silently)
![image](https://github.com/KyoldFusion/SeleniumMavenSetup-Java/assets/58031145/e2453da6-f57f-4215-853c-9b09df243f40)

When At the Installation Options Page Check the following:
- Create Desktop Shortcut
- Update PATH Variable
- Update Context Menu
- Assocation: .java

  ![image](https://github.com/KyoldFusion/SeleniumMavenSetup-Java/assets/58031145/f17aad83-1d46-4331-abba-8499165ce309)

# Dependencies:

The require dependencies that you will need for your project to be successful downloaded from https://mvnrepository.com:

https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.20.0

https://mvnrepository.com/artifact/io.cucumber/gherkin/28.0.0

https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.12

https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.1

https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/7.16.1

https://mvnrepository.com/artifact/ch.qos.logback/logback-classic/1.4.11

https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.16.1


```
<dependencies>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.16.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/ch.qos.logback/logback-classic -->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.4.11</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.16.1</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.10.1</version>
            <scope>test</scope>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.slf4j/slf4j-api -->
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>2.0.12</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/io.cucumber/gherkin -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>gherkin</artifactId>
            <version>28.0.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.20.0</version>
        </dependency>


    </dependencies>
```

### Plugins:

You will access these by clicking Files -> Settings -> Plugins

on the marketplace make sure to get "Cucumber for Java" and "Gherkin"

![image](https://github.com/KyoldFusion/SeleniumMavenSetup-Java/assets/58031145/6c1855b0-7c53-4653-b086-aef2755249d1)


# Logback configuraton:

In your logback.xml you will want to copy this configuration and paste it in your project folder outside of the src (under the pom.xml)

```
<configuration>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <root level="INFO">
        <appender-ref ref="STDOUT" />
    </root>
</configuration>
```

# Knowledge Documents

These are a couple of documents that will help when creating your future automations including the Gherkin and Cucumber language!

Quick explanation of BDD "Given When Then"

https://martinfowler.com/bliki/GivenWhenThen.html

Keywords Gherkin References

https://cucumber.io/docs/gherkin/reference/



