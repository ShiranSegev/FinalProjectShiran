import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Final15Test {

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void openBrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void openBigBrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void openWebsite() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get(K.DEMOBLAZE);
        Thread.sleep(5000);
    }

    @Test
    public void clickSignUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement sign = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.SIGNUP)));
        sign.click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void clickCart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement cart = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.CART)));
        cart.click();
        Thread.sleep(5000);
        driver.quit();
    }


    @Test
    public void loginUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement login = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGIN)));
        login.click();
        Thread.sleep(2000);
        WebElement loginField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGINID)));
        WebElement passwordField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.PASSWORDID)));
        WebElement loginBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.LOGINBTN)));
        loginField.sendKeys(K.USERNAME);
        Thread.sleep(3000);
        passwordField.sendKeys(K.PASSWORD);
        Thread.sleep(3000);
        loginBtn.click();
        Thread.sleep(3000);

    }

    @Test
    public void wrongUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement login = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGIN)));
        login.click();
        Thread.sleep(2000);
        WebElement loginField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGINID)));
        WebElement passwordField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.PASSWORDID)));
        WebElement loginBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.LOGINBTN)));
        loginField.sendKeys(K.WRONGUSER);
        Thread.sleep(3000);
        passwordField.sendKeys(K.PASSWORD);
        Thread.sleep(3000);
        loginBtn.click();
        Thread.sleep(3000);
    }

        @Test
        public void clickAddCart () throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get(K.DEMOBLAZE);
            Thread.sleep(5000);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement samsung = wait
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.SAMSUNG)));
            samsung.click();
            Thread.sleep(5000);
            WebElement add = wait
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.ADD)));
            add.click();
            Thread.sleep(5000);
            driver.quit();
        }

    @Test
    public void clickAddCart2 () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement samsung = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.NEXUS)));
        samsung.click();
        Thread.sleep(5000);
        WebElement add = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.ADD)));
        add.click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void clickNext() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement next = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.NEXT)));
        next.click();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void signupexist() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement login = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.SIGNUP)));
        login.click();
        Thread.sleep(2000);
        WebElement loginField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.SIGNUPUSER)));
        WebElement passwordField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.SIGNUPPASS)));
        WebElement signBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.SIGNUPBTN)));
        loginField.sendKeys(K.USERNAME);
        Thread.sleep(3000);
        passwordField.sendKeys(K.PASSWORD);
        Thread.sleep(3000);
        signBtn.click();
        Thread.sleep(3000);

    }

    @Test
    public void logOutUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement login = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGIN)));
        login.click();
        Thread.sleep(2000);
        WebElement loginField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGINID)));
        WebElement passwordField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.PASSWORDID)));
        WebElement loginBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.LOGINBTN)));
        loginField.sendKeys(K.USERNAME);
        Thread.sleep(3000);
        passwordField.sendKeys(K.PASSWORD);
        Thread.sleep(3000);
        loginBtn.click();
        Thread.sleep(3000);
        WebElement logoutBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGOUT)));
        Thread.sleep(3000);
        logoutBtn.click();

    }

    @Test
    public void clickCartHome() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement cart = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.CART)));
        cart.click();
        Thread.sleep(3000);
        WebElement home = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.HOME)));
        home.click();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void placeOrder() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement login = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGIN)));
        login.click();
        Thread.sleep(2000);
        WebElement loginField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGINID)));
        WebElement passwordField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.PASSWORDID)));
        WebElement loginBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.LOGINBTN)));
        loginField.sendKeys(K.USERNAME);
        Thread.sleep(3000);
        passwordField.sendKeys(K.PASSWORD);
        Thread.sleep(3000);
        loginBtn.click();
        Thread.sleep(3000);
        WebElement cart = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.CART)));
        Thread.sleep(3000);
        cart.click();
        WebElement placeOrder = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.PLACEORDER)));
        Thread.sleep(3000);
        placeOrder.click();
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void deleteOrder() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.DEMOBLAZE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement login = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGIN)));
        login.click();
        Thread.sleep(2000);
        WebElement loginField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGINID)));
        WebElement passwordField = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.PASSWORDID)));
        WebElement loginBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.LOGINBTN)));
        loginField.sendKeys(K.USERNAME);
        Thread.sleep(3000);
        passwordField.sendKeys(K.PASSWORD);
        Thread.sleep(3000);
        loginBtn.click();
        Thread.sleep(3000);
        WebElement cart = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.CART)));
        Thread.sleep(3000);
        cart.click();
        WebElement delete = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.DELETE)));
        Thread.sleep(3000);
        delete.click();
        Thread.sleep(3000);
        driver.quit();

    }

}
