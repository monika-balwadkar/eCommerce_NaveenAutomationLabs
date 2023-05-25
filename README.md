# eCommerce End to End Testing

In this Project I have used an eCommerce website [Naveen Automationlabs](https://naveenautomationlabs.com/opencart/  "Your Store") where I have covered all the basic as well as high level functionality testing such as Register new user, login and Add to Cart and much more. I have used Selenium with java, TestNG Framework, Page object model as a design pattern, Excel utilites and for reporting I have used Extent Reports. 

## Test Enviorment Setup 

* Pull the Code or Clone it in your system.
* Latest Eclipse should be installed in your system.
* JDK version - 17 
* Windows 64 bit.
* Latest Chrome Version.

### Dependencies 
Selenium Dependency
```xml
<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.6.0</version>
</dependency>
```
TestNG Dependency
```xml
<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.6.1</version>
<scope>test</scope>
</dependency>
```
Github Dependency
```xml
<dependency>
<groupId>io.github.bonigarcia</groupId>
<artifactId>webdrivermanager</artifactId>
<version>5.3.1</version>
</dependency>
```
Apache poi Dependency for Excel 
```xml
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi</artifactId>
<version>5.2.3</version>
</dependency>
```
```xml
<dependency>
<groupId>org.apache.poi</groupId>
<artifactId>poi-ooxml</artifactId>
<version>5.2.3</version>
</dependency>
```
Extent Report Dependency
```xml
<dependency>
<groupId>com.aventstack</groupId>
<artifactId>extentreports</artifactId>
<version>5.0.9</version>
</dependency>
```
Add all this dependencies in your **POM.xml** if you are creating entire project all by yourself or you can cross verify the version of dependencies incase if you are pulling it.

##  Project details 

**Functionalities covered**
1] Verify Add to Cart
2] Verify Delete from Cart
3] Verify Footer 
4] Verify Header
5] Verify MenuBar
6] Verify Product Comparison
7] Verify Login
8] Verify User Registration 

## Acknowledgement 
In this project I have done the Functionality testing on the eCommerce website by [Naveen Automationlabs](https://naveenautomationlabs.com/opencart/  "Your Store")
