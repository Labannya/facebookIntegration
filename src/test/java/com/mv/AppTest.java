package com.mv;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
   public WebDriver driver;
   @Given("^I have navigated to the facebook url$")

    public void openFacebook(){
       getDriver();
       driver.get("https://www.facebook.com");
   }

   @When("^I enter invalid login credentials$")
    public void invalidLogin(){
       loginDetails("labasaha@gmail.com","mithunlabannya0612saha");
       driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
    @When("^I enter valid login credentials$")
    public void validLogin(){
        loginDetails("labannyasaha@gmail.com","mithunlabannya0612saha");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
    @Then("^I should to get error message$")
        public void getErrormessage(){
        driver.findElement(By.xpath("//span[contains(text(),'Log in to Facebook1')]")).isDisplayed();
        driver.close();
    }

    @Then ("^I should to be logged in successfully$")

    public void succeslogin(){
        driver.findElement(By.xpath("//div[@dir='ltr' and contains(text(),'Labannya Prova Saha')]")).isDisplayed();
        driver.close();
    }


    public void loginDetails(String username,String password){

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

    }

    public void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NewPC\\Downloads\\chromedriver.exe");

    }
    public void getDriver(){
        setDriver();
        driver = new ChromeDriver();

    }
}
