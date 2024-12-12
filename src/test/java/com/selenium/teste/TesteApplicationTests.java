package com.selenium.teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

public class TesteApplicationTests {

	@Test
	public void entrarNoFacebook() {
        //pasta onde está o driver
        System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
        //crir um objeto webdriver para acessar o navegador
        WebDriver navegador = new ChromeDriver();
        //informar o tempo máximo de resposta
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //aqui voce indica o endereço web que voce quer abrir
        navegador.get("https://facebook.com");
        //encontrando o elemtento email
        navegador.findElement(By.id("email")).sendKeys("daniellyvitorio@hotmail.com");
        navegador.findElement(By.id("pass")).sendKeys("12345678");
        //encontrando o botão entrar
        navegador.findElement(By.id("u_0_5_KI")).click();
	}

    @Test
    public void entrarNoEspacoDoEstudante() {
        //pasta onde está o driver
        System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
        //crir um objeto webdriver para acessar o navegador
        WebDriver navegador = new ChromeDriver();
        //informar o tempo máximo de resposta
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //aqui voce indica o endereço web que voce quer abrir
        navegador.get("https://estudante.sesisenai.org.br/login");
        //encontrando o elemtento email
        navegador.findElement(By.name("user")).sendKeys("danielly_vitorio@estudante.sesisenai.org.br");
        navegador.findElement(By.name("password")).sendKeys("12345678");
        //encontrando o botão entrar
        navegador.findElement(By.className("login__btn")).click();
    }

    @Test
    public void entrarNoInstagram() {
        //pasta onde está o driver
        System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
        //crir um objeto webdriver para acessar o navegador
        WebDriver navegador = new ChromeDriver();
        //informar o tempo máximo de resposta
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //aqui voce indica o endereço web que voce quer abrir
        navegador.get("https://instagram.com");
        //encontrando o elemtento email
        navegador.findElement(By.name("username")).sendKeys("daniellyvitorio@hotmail.com");
        navegador.findElement(By.name("password")).sendKeys("12345678");
        //encontrando o botão entrar
        navegador.findElement(By.xpath("button[text()='Entrar']")).click();


    }

    @Test
    public void appLeiloes() {
        //pasta onde está o driver
        System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
        //crir um objeto webdriver para acessar o navegador
        WebDriver navegador = new ChromeDriver();
        //informar o tempo máximo de resposta
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //aqui voce indica o endereço web que voce quer abrir
        navegador.get("http://localhost:8081/leiloes");
        //encontrando o elemtento email
        navegador.findElement(By.name("username")).sendKeys("fulano");
        navegador.findElement(By.name("password")).sendKeys("pass");
        //encontrando o botão entrar
        navegador.findElement(By.xpath("//a[contains(@class, 'text-light') and text()='Entrar']")).click();


    }

    @Test
    public void novoLeilao() {
        //pasta onde está o driver
        System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
        //crir um objeto webdriver para acessar o navegador
        WebDriver navegador = new ChromeDriver();
        //informar o tempo máximo de resposta
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //aqui voce indica o endereço web que voce quer abrir
        navegador.get("http://localhost:8081/leiloes/new");
        //encontrando o elemtento email
        navegador.findElement(By.name("nome")).sendKeys("celular s22 ultra");
        navegador.findElement(By.name("valorInicial")).sendKeys("150000");
        navegador.findElement(By.id("dataAbertura")).sendKeys("15/12/2024");

        //entrando no botão salvar
        navegador.findElement(By.id("button-submit")).click();
    }

    @Test
    public void sairLeilao() {
        //pasta onde está o driver
        System.setProperty("webdriver.chrome.driver","c:\\driver\\chromedriver.exe");
        //crir um objeto webdriver para acessar o navegador
        WebDriver navegador = new ChromeDriver();
        //informar o tempo máximo de resposta
        navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //aqui voce indica o endereço web que voce quer abrir
        navegador.get("http://localhost:8081/login");
        // preenchendo o formulario
        navegador.findElement(By.name("username")).sendKeys("fulano");
        navegador.findElement(By.name("password")).sendKeys("pass");

        // clicando no botão sair
        navegador.findElement(By.xpath("//a[contains(@class, 'text-light') and text()='Sair']")).click();

        //fechando navegadorok
        navegador.quit();
    }
}
