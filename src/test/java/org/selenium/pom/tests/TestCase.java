package org.selenium.pom.tests;

import org.junit.jupiter.api.Test;
import org.selenium.pom.base.BaseTest;
import org.selenium.pom.objects.DropDown;
import org.selenium.pom.objects.Login;

import org.selenium.pom.pages.*;
import org.selenium.pom.utils.JacksonUtils;

import java.io.IOException;


public class TestCase extends BaseTest {
    @Test
    public void Test() throws IOException {

        Login login = JacksonUtils.deserializeJson("login.json", Login.class);
        Product product = new HomePage(driver).
                load().setLogin(login).clickLoginButton();

        DropDown dropDown = JacksonUtils.deserializeJson("dropDown.json", DropDown.class);
        product.setDropDown(dropDown).clickAddToCartButton1().clickAddToCartButton2().clickAddToCartButton3().clickAddToCartButton4().clickAddToCartButton5().clickAddToCartButton6();








    }
}
