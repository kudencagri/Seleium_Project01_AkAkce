package CreatUserAccount_Part_1;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utlity.BaseDriver.BekleveKapat;
import static Utlity.BaseDriver.driver;

public class TS_01 { // User Story 1 bitti.
    @Test
    public void CreatUserAccount(){
        driver.get("https://www.akakce.com/");

        WebElement HesapAc=driver.findElement(By.xpath("//*[@id='H_rl_v8']/a[1]")); // kayıd ol sayfasına gider
        HesapAc.click();
        MyFunc.wait(2);

        WebElement ad=driver.findElement(By.id("rnufn"));
        WebElement soyad=driver.findElement(By.id("rnufs"));
        WebElement email=driver.findElement(By.id("rnufe1"));
        WebElement emailTe=driver.findElement(By.id("rnufe2"));
        WebElement Sifre=driver.findElement(By.id("rnufp1"));
        WebElement SifreTe=driver.findElement(By.id("rnufp2"));

        ad.sendKeys("Çağrı Canras");
        MyFunc.wait(1);
        soyad.sendKeys("Küden");
        MyFunc.wait(1);
        email.sendKeys("cagricanraskuden@gmail.com");
        MyFunc.wait(1);
        emailTe.sendKeys("cagricanraskuden@gmail.com");
        MyFunc.wait(1);
        Sifre.sendKeys("21Tekno43.");
        MyFunc.wait(1);
        SifreTe.sendKeys("21Tekno43.");
        MyFunc.wait(1);

        WebElement Cinsiyet=driver.findElement(By.id("rngm"));
        WebElement il=driver.findElement(By.id("locpr"));
        WebElement ilce=driver.findElement(By.id("locds"));
        WebElement gun=driver.findElement(By.id("bd"));
        WebElement ay=driver.findElement(By.id("bm"));
        WebElement yil=driver.findElement(By.id("by"));
        WebElement kullanici=driver.findElement(By.id("rnufpca"));
        WebElement hesapAc=driver.findElement(By.id("rfb"));

        Cinsiyet.click();
        MyFunc.wait(3);

        Select select=new Select(il);
        select.selectByVisibleText("Diyarbakır");
        MyFunc.wait(5);

        Select selectIlce=new Select(ilce);
        selectIlce.selectByVisibleText("Yenişehir");
        MyFunc.wait(1);

        Select selectgun=new Select(gun);
        selectgun.selectByVisibleText("3");
        MyFunc.wait(1);

        Select selectay=new Select(ay);
        selectay.selectByVisibleText("8");
        MyFunc.wait(1);

        Select selectyil=new Select(yil);
        selectyil.selectByVisibleText("1997");
        MyFunc.wait(1);

        kullanici.click();
        MyFunc.wait(1);
        hesapAc.click();


        BekleveKapat();

    }
}
