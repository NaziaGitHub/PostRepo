package Pack1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ACCER\\Downloads\\ChromeDriver83\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Set<Cookie> cook=driver.manage().getCookies();
		for(Cookie c:cook)
		{
			System.out.println(c.getName()+" "+c.getValue());
		}
		Cookie cook1=new Cookie("CustomCookie","CustomValue");
		driver.manage().addCookie(cook1);
		cook=driver.manage().getCookies();
		Cookie cook11=new Cookie("CustomCookie1","CustomValue1");
		driver.manage().addCookie(cook11);
		cook=driver.manage().getCookies();
		System.out.println("New Cookies");
		for(Cookie c:cook)
		{
			System.out.println(c.getName()+"------"+c.getValue());
		}	
		driver.manage().deleteCookie(cook1);
		cook=driver.manage().getCookies();
		System.out.println("New Cookies");
		for(Cookie c:cook)
		{
			System.out.println(c.getName()+" "+c.getValue());
		}
		driver.manage().deleteCookieNamed("CustomCookie");
		cook=driver.manage().getCookies();
		System.out.println("New Cookies");
		for(Cookie c:cook)
		{
			System.out.println(c.getName()+" "+c.getValue());
		}	
		driver.manage().deleteAllCookies();
		cook=driver.manage().getCookies();
		System.out.println("New Cookies");
		for(Cookie c:cook)
		{
			System.out.println(c.getName()+" "+c.getValue());
		}
	}
}
