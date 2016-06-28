package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import custWebCommands.ActionCommands;
import dataDriven.Excel;
import objectRepository.Details;
import objectRepository.Energy;
import objectRepository.Results;
import objectRepository.Supplier;

public class GasAndElect extends ActionCommands
{
	  int urlCol = 0, urlRow = 1, pCodeCol = 1, pCodeRow = 1, emailCol = 2, emailRow = 1;
	  @Test
	  public void GasAndElectricity() 
	  {
		//get the url from the excel sheet and store in string url
			String url = Excel.reader(urlCol, urlRow, "Sheet1");
			
			//Suppliers Tab
			//get the postcode from the excel sheet and store in string postcode
			String postCode = Excel.reader(pCodeCol, pCodeRow, "Sheet1");
			//get the emailID from the excel sheet and store in string emailId
			String emailId = Excel.reader(emailCol, emailRow, "Sheet1");
			//open FireFox Browser
			BrowserSelection("FireFox"); 
			//opens the url in browser
			url(url); 
			//verify the main heading Your Supplier to check the url is launched the correct page or not
			Assert.assertEquals(isDisplay(Supplier.supplierHeading), true);
			//Enter PsotCode in PostCode text box
			sendText(Supplier.enterPostCode, postCode);
			//click on the find postcode button
			click(Supplier.findPostCode);
			//Click on the electricity only label under "what do you want to compare"
			click(Supplier.gasAndElectricity_Compare);  
			//Click on the BritishGas label under "who supplies your electricity"
			click(Supplier.suppliesGasAndelectricity_BritishGas);
			//Click on the next button in Supplier tab  to navigate to energy tab.
			click(Supplier.next_SuppliersPage);
			
			//Energy Tab
			// Verify the Your energy heading of the energy tab for validation to check the correct tab is displayed or not
			Assert.assertEquals(isDisplay(Energy.energyHeading), true);
			// select the 8th option in the electricity tariff list box
			dropDown(Energy.gasAndElectricityTariff_dropDown, Energy.gasAndElectricityTariff_dropDownList);
			// check the "yes" check box for Economy 7 meter
			click(Energy.gasAndElectricy_Economy7Meter);
			// select the 2nd option in the pay your electricity list box
			dropDown(Energy.gasAndElecticity_PayForElectricity_DropDown, Energy.gasAndElectricity_PayForElectricity_DropDownList);
			// check the "yes" check box for "is electricity is your main source of heating" 
			click(Energy.gasAndElectricity_MainSourceOfHeating_Yes);
			//Enter text in "Economy7DayUsage" text box
			sendText(Energy.gasAndElectricity_Economy7DayUsage, "100");
			//Enter text in "Economy7NightUsage" text box
			sendText(Energy.gasAndElectricity_Economy7NightUsage,"50");
			//Click on the next button in energy tab  to navigate to details tab.
			click(Energy.next_EnergyPage);
			// Verify the Your energy heading of the energy tab for validation to check the correct tab is displayed or not
			Assert.assertEquals(isDisplay(Energy.gasAndElectricityenergyHeading), true);
			//select "yes" check box for gas is main source of heating
			click(Energy.gasAndElectricityMainSourceOfHeating_yes);
			//Enter text in current gas usage spent text box
			sendText(Energy.currentGasAndElectricityUsageSpent, "50");
			//dropDown(Energy.typeOfGasBillChoosen_dropDown,Energy.typeOfGasBillChoosen_dropDownList);
			////Click on the next button in energy tab  to navigate to details tab.
			click(Energy.next_EnergyPage);
			
			//Details Tab
			//Select the fixed tariff label for "what tariff you are interested in " option
			click(Details.electricity_TariffInterestedIn_fixedTariff);
			//Select the PAyonreciept label for "what payment type you are interested in " option
			//click(Details.electricity_paymentType_PayOnReciept);
			//Enter emailID in email text box. emailId is entered from excel sheet.
			sendText(Details.email, emailId);
			// Check the AgreeCTM checkbox
			click(Details.electricity_AgreeCTM);
			// Check the TermsAndConditions checkbox
			click(Details.electricity_TermsAndConditions);
			//Click on the next button in details tab  to navigate to results tab.
			click(Details.goToPrices_button);
			
			// Results Tab
			//// Verify the Your estimated usage heading of the results tab for validation to check the correct tab is displayed or not
			Assert.assertEquals(isDisplay(Results.electicitry_ResultsHeading), true);
			//Storing the results in actualResult variable
			String actualResult = driver.findElement(Results.electricity_AllResults).getText().toString();
			// expected result value
			String expectedResult = "6";
			//comparing the actaul and expected result values.
			Assert.assertEquals(actualResult, expectedResult);
			
			driver.close();
	  }
}
