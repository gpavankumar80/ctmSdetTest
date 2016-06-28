package objectRepository;

import org.openqa.selenium.By;

public class Details 
{
	// Gas only
	public static By detailsHeading = By.className("main-heading");
	public static By tariffInterestedIn_fixedTariff = By.xpath("//label[@class='fixed-rate']");
	public static By tariffInterestedIn_variableTariff = By.xpath("//label[@class='variable-rate']");
	public static By tariffInterestedIn_allTariffs = By.xpath("//label[@class='both-rate']");
	public static By paymentType_Monthly = By.xpath("//label[@class='payment-monthly']");
	public static By paymentType_Quarterly = By.xpath("//label[@class='payment-quarterly']");
	public static By paymentType_PayOnReciept = By.xpath("//label[@class='payment-onbill']");
	public static By paymentType_allPaymentTypes = By.xpath("//label[@class='payment-all']");
	public static By email = By.id("Email");
	public static By agreeCTM = By.xpath("//fieldset[@id='marketingT']/div/div[2]/label/span[2]");
	public static By termsAndConditions = By.xpath("//label[@id='terms-label']/span[2]");
	public static By goToPrices_button = By.id("email-submit");
	
	// Electricity Only Details Page
	public static By electricity_TariffInterestedIn_fixedTariff = By.xpath("//label[@class='fixed-rate']");
	public static By electricity_paymentType_PayOnReciept = By.xpath("//label[@class='payment-onbill']");
	public static By electricity_AgreeCTM = By.xpath("//label[@class='single-check']/span[2]");
	public static By electricity_TermsAndConditions = By.xpath("//label[@id='terms-label']/span[2]");
	
}
