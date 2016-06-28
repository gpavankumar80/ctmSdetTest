package objectRepository;

import org.openqa.selenium.By;

public class Supplier 
{
	public static By supplierHeading  = By.className("main-heading");
	public static By enterPostCode = By.id("your-postcode");
	public static By findPostCode = By.id("find-postcode");
	public static By changePostCode = By.id("change-postcode");
	//public static By changePostCode = By.xpath("button[@id='change-postcode' and @class='arrow-before']");
	public static By haveMyBill = By.xpath("//div[@class='answer radio-buttons']/label/span");
	public static By dontHaveMyBill = By.xpath("//label[@id='no-bill-label']/span/span");
	public static By gasAndElectricity_Compare = By.xpath("//label[@id='compare-both-label']/span/span");
	public static By electicity_Compare = By.xpath("//label[@id='compare-electricity-label']/span/span");
	public static By gas_Compare = By.xpath("//label[@id='compare-gas-label']/span/span");
	public static By gasAndElectricity_SameSupplier_Yes = By.xpath("//div[@class='answer radio-ticks']/label/span");
	public static By gasAndElectricity_SameSupplier_No = By.xpath("//div[@class='answer radio-ticks']/label[2]/span");
	public static By suppliesGas_BritishGas = By.xpath("//span[@class='icon top-6-british-gas']");
	public static By suppliesElectricity_BritishGas = By.xpath("//fieldset[@id='elec-energy-suppliers-question']/div/div/div[1]/label[1]/span/span");
	public static By suppliesGasAndelectricity_BritishGas = By.xpath("//fieldset[@id='dual-energy-suppliers-question']/div/div/label/span/span");
	public static By next_SuppliersPage = By.id("goto-your-supplier-details");
	
}
