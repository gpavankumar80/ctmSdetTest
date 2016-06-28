package objectRepository;

import org.openqa.selenium.By;

public @interface Energy 
{
	//Gas only
	public static By energyHeading = By.className("main-heading");
	public static By gasTariff_dropDown = By.xpath("//div[@id='gas_tariff_additional_info_chosen']/a/div/b");
	public static By gasTariff_dropDownList = By.xpath("//div[@class='chosen-drop']/ul/li[8]");
	public static By payyourGas_dropDown = By.xpath("//div[@id='gas_payment_method_dropdown_link_chosen']/a/div/b");
	public static By payYourGas_dropDownList = By.xpath("//div[@class='chosen-drop']/ul/li[4]");
	public static By gasMainSourceOfHeating_yes = By.xpath("//fieldset[@id='gas-main-heating-source-question']/div/div/label/span");
	public static By gasMainSourceOfHeating_No = By.xpath(".//*[@id='gas-main-heating-source-question']/div/div/label[2]/span");
	public static By currentGasUsage_kWh = By.xpath(".//*[@id='gas-type-of-bill-question']/div/div/div[1]/label[1]/span");
	public static By currentGasUsageSpent = By.xpath("//fieldset[@id='gas-type-of-bill-question']/div/div/div[4]/input");
	public static By typeOfGasBillChoosen_dropDown = By.xpath("//div[@id='type_of_Gas_bill_usage_dropdown_chosen']/a/div/b");
	public static By typeOfGasBillChoosen_dropDownList = By.xpath("//div[@class='chosen-drop']/ul/li[3]");
	
	
	//Electricity Only
	public static By electricityTariff_dropDown = By.xpath("//div[@id='electricity_tariff_additional_info_chosen']/a/div/b");
	public static By electricityTariff_dropDownList = By.xpath("//div[@class='chosen-drop']/ul/li[8]");
	public static By electricy_Economy7Meter = By.xpath("//div[@class='answer radio-ticks']/label/span");
	public static By electicity_PayForElectricity_DropDown = By.xpath("//div[@id='electricity_payment_method_dropdown_link_chosen']/a/div/b");
	public static By electricity_PayForElectricity_DropDownList = By.xpath("//div[@class='chosen-drop']/ul/li[2]");
	public static By electricity_MainSourceOfHeating_Yes = By.xpath("//fieldset[@id='electricity-main-heating-source-question']/div/div/label[1]/span");
	public static By electricity_CurrentElectUsage_kWh_CheckBox = By.xpath("//fieldset[@id='electricity-usage-question']/div/div/div/label[1]/span");
	public static By electricity_Economy7DayUsage = By.id("economy-7-day-usage");
	public static By electricity_Economy7NightUsage = By.id("economy-7-night-usage");
	public static By next_EnergyPage = By.id("goto-your-energy");
	
	//GasAndelectricity
	public static By gasAndElectricityTariff_dropDown = By.xpath("//div[@id='electricity_tariff_additional_info_chosen']/a/div/b");
	public static By gasAndElectricityTariff_dropDownList = By.xpath("//div[@class='chosen-drop']/ul/li[8]");
	public static By gasAndElectricy_Economy7Meter = By.xpath("//div[@class='answer radio-ticks']/label/span");
	public static By gasAndElecticity_PayForElectricity_DropDown = By.xpath("//div[@id='electricity_payment_method_dropdown_link_chosen']/a/div/b");
	public static By gasAndElectricity_PayForElectricity_DropDownList = By.xpath("//div[@class='chosen-drop']/ul/li[1]");
	public static By gasAndElectricity_MainSourceOfHeating_Yes = By.xpath("//fieldset[@id='electricity-main-heating-source-question']/div/div/label/span");
	public static By gasAndElectricity_Economy7DayUsage = By.id("economy-7-day-usage");
	public static By gasAndElectricity_Economy7NightUsage = By.id("economy-7-night-usage");
	public static By gasAndElectricityenergyHeading = By.className("main-heading");
	public static By gasAndelectricityTariff_dropDown = By.xpath("//div[@id='gas_tariff_additional_info_chosen']/a/div/b");
	public static By gasAndElectricity1Tariff_dropDownList = By.xpath("//div[@class='chosen-drop']/ul/li[8]");
	public static By gasAndElectricityMainSourceOfHeating_yes = By.xpath("//fieldset[@id='gas-main-heating-source-question']/div/div/label/span");
	public static By currentGasAndElectricityUsageSpent = By.xpath("//fieldset[@id='gas-type-of-bill-question']/div/div/div[4]/input");
	
	
}

