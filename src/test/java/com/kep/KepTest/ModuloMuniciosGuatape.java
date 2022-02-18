package com.kep.KepTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.kep.KepTest.Recursos.metodos;

public class ModuloMuniciosGuatape {

public static WebDriver driver;
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.edge.driver", "src\\test\\resources\\WebDriver\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	
	
	@Test
	public void test1(){	
		
		driver.manage().window().maximize();

		driver.get("http://localhost:8080/kep/");
		
		metodos.Wait(1000);
		
		WebElement municipio = driver.findElement(By.cssSelector("#navbarSupportedContent > ul > li:nth-child(3) > a"));
		municipio.click();
				
		metodos.Wait(1000);
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", ""); 
		
		metodos.Wait(1000);
		
		WebElement sitio = driver.findElement( By.cssSelector("div.container > div > div:nth-child(1) > div > a"));
		sitio.click();
		
		metodos.Wait(1000);

		assertNotNull("Sitio Encontrado", sitio);
		assertNotNull("Municipio Encontrado",municipio);
		
	}
	
	
	@Test
	public void test2(){	
		
		driver.manage().window().maximize();

		driver.get("http://localhost:8080/kep/");
		
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", ""); 
		
		metodos.Wait(1000);
		
		WebElement municipio = driver.findElement(By.xpath("//*[@id=\"2\"]"));
		municipio.click();
		
		
		metodos.Wait(1000);
		
		js.executeScript("window.scrollBy(0,500)", ""); 
		
		
		metodos.Wait(1000);
		
		WebElement sitio = driver.findElement( By.cssSelector("div.container > div > div:nth-child(1) > div > a"));
		sitio.click();
			
		metodos.Wait(1000);
		
		assertNotNull("Sitio Encontrado", sitio);
		assertNotNull("Municipio Encontrado",municipio);
	}
	
	
	
	@After
	public void close() {
		driver.close();
		driver.quit();

	}

}
