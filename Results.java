package objectRepository;

import org.openqa.selenium.By;

public class Results 
{
	//Electricity only
	public static By electicitry_ResultsHeading = By.xpath("//div[@class='mm_t61_summary_line_wrapper']/h1");
	public static By electricity = By.xpath("//div[@id='page-container']/div/div/ul/li/span");
	public static By electricity_AllResults = By.xpath("//label[@id='mm_t61_f_rate_all']/span");
	
	//Gas Only
	public static By gas_ResultsHeading = By.xpath("//div[@class='mm_t61_summary_line_wrapper']/h1");
	public static By gas = By.xpath("//div[@id='page-container']/div/div/ul/li[2]/span");
	public static By gas_AllResults = By.xpath("//label[@id='mm_t61_f_rate_all']/span[2]");
}
