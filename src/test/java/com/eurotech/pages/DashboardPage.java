package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{



           @FindBy(xpath = "//p[contains(text(),'Welcome')]")
           public WebElement welcomeMessage;

           @FindBy(css = "#navbar-menu-list2>li")
           public List<WebElement> menuList;

           @FindBy(xpath = "//a[text()='All Posts']")
           public WebElement allPosts;

           @FindBy(xpath = "//a[text()='Developers']")
           public WebElement developers;

           @FindBy(xpath = "//a[text()='My Account']")
           public WebElement myAccount;

           @FindBy(css = "#post-form-btn")
           public WebElement submitBtn;

           @FindBy(xpath = "//*[text()='Edit Profile']")
            public WebElement editProfile;

          @FindBy(xpath = "//*[text()='Test Automation Engineer']/../td[2]")
          public WebElement jobTitle;

          @FindBy(xpath = "//td[text()='Apple']")
          public WebElement companyName;



           public void navigateToSubMenu(String subMenu){
               Driver.get().findElement(By.xpath("//span[text()='"+subMenu+"']")).click();
           }

           public void navigateToDashboardMenu(String menuName){
               Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
           }

           public String  getTitle(String title){
            return   Driver.get().findElement(By.xpath("//td[text()='"+title+"']")).getText();
           }

           public String getCompany(String companyName){
             return   Driver.get().findElement(By.xpath("//td[text()='"+companyName+"']")).getText();
           }

          public String getHeaderText(String headerName){
           return Driver.get().findElement(By.xpath("//section[@class='container']/*[text()='"+headerName+"']")).getText();
          }

          public String  getCompanyName(String name){
             return   Driver.get().findElement(By.xpath("//*[text()='"+name+"']")).getText();
          }



}
