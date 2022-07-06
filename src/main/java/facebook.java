
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author otxtan
 */
public class facebook {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dicmu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        // And now use this to visit Google

              driver.get("http://www.facebook.com");
              WebElement email=driver.findElementByXPath("//*[@id=\"email\"]");
              
              email.sendKeys("duchaylike@gmail.com");
             
              
        }
      
        
        
    }

