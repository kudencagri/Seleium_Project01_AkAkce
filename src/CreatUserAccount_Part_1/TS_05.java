package CreatUserAccount_Part_1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TS_05 extends BaseDriver {
@Test
    public void MessageBoxControl(){
    driver.get("https://www.akakce.com/");
    WebElement Sing_in=driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[2]"));
    Sing_in.click();
    MyFunc.wait(2);

    WebElement E_mail=driver.findElement(By.id("life"));
    E_mail.sendKeys("cagricanraskuden@gmail.com");
    MyFunc.wait(1);

    WebElement Password=driver.findElement(By.id("lifp"));
    Password.sendKeys("21Tekno43.");
    MyFunc.wait(1);

    WebElement button=driver.findElement(By.id("lfb"));
    button.click();
    MyFunc.wait(4);

    WebElement MsgBox=driver.findElement(By.xpath("//*[@id='H_f_v8']"));
    MsgBox.click();
    MyFunc.wait(2);

    WebElement bildirim=driver.findElement(By.id("ntf"));
    bildirim.click();

    WebElement BildirimText=driver.findElement(By.xpath("//div[@class='ntf-empty']/h2"));
    System.out.println("BildirimText.getText().contains(Henüz hiç bildiriminiz yok) = " + BildirimText.getText().contains("Henüz hiç bildiriminiz yok"));


    BekleveKapat();



}
}
