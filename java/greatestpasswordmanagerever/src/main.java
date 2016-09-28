import selenium-2.53.*;
public class main {
    public static void main(String[] args) {
        
    }
    public  WebDriver webdriver;
    public Selenium selenium;
  public WebDriver driver;

  @Before
  public void setup() throws Exception{
  driver = new FirefoxDriver();
      driver.get("http://www.fb.com");
  }
  @Test
  public void Test() throws Exception{
      //selenium.type("id=gs_htif0", "test");
      System.out.println("hi");
      // driver.findElement(By.cssSelector("#gb_1 > span.gbts")).click();
          selenium.waitForPageToLoad("300000000");

          WebElement email=driver.findElement(By.id("email"));

          email.sendKeys("nshakuntalas@gmail.com");
          driver.findElement(By.id("u_0_b")).click();
  }
  @After
  public void Close() throws Exception{
      System.out.println("how are you?");
  }

}
