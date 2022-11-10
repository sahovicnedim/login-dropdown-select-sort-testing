package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.selenium.pom.base.BasePage;
import org.selenium.pom.objects.DropDown;
import org.selenium.pom.objects.Login;

public class Product extends BasePage {

    private final By dropDown = By.cssSelector(".product_sort_container");
    private final By addToCartButton1= By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    private final By addToCartButton2= By.cssSelector("#add-to-cart-sauce-labs-backpack");
    private final By addToCartButton3= By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
    private final By addToCartButton4= By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > button:nth-child(2)");
    private final By addToCartButton5= By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    private final By addToCartButton6= By.cssSelector("#add-to-cart-sauce-labs-onesie");


    public Product(WebDriver driver) {
        super(driver);
    }


    public Product selectDropDown(String option){

        //select klasa ne radi za firefox samo za chrome pa mijenjamo kod da radi za oba browsera
      /*  wait.until(ExpectedConditions.elementToBeClickable(dropDown)).click(); //kliknemo na dropdown menu da opcije budu vidljive
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='" + option + "']"))); //option element tj nas element koji zadamo
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",e); //pomocu ovog skrolamo do naseg elementa
        e.click(); // onda kliknemo na njeg
        return this;*/
        Select select = new Select(driver.findElement(dropDown));
        select.selectByVisibleText(option);
        return this;

    }

    public Product clickAddToCartButton1(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton1)).click();
        return this;
    }
    public Product clickAddToCartButton2(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton2)).click();
        return this;
    }
    public Product clickAddToCartButton3(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton3)).click();
        return this;
    }
    public Product clickAddToCartButton4(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton4)).click();
        return this;
    }
    public Product clickAddToCartButton5(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton5)).click();
        return this;
    }
    public Product clickAddToCartButton6(){
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton6)).click();
        return this;
    }

    public Product setDropDown(DropDown dropDown){
        return  selectDropDown(dropDown.getDropDown());
    }





}
