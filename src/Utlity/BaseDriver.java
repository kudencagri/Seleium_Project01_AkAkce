package Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;// SingletonDriver method

    static {// public static driverBaşlat otamatik extend  BaseDriver olması ve başta yer alması
        driver=new ChromeDriver();
        driver.manage().window().maximize();// ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// 30 sn mühlet : sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 30 sn mühlet : elementi bulma mühleti
    }
    public  static void  BekleveKapat(){
        MyFunc.wait(5);
        driver.quit();

    }

}
