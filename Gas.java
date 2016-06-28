package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import custWebCommands.ActionCommands;
import dataDriven.Excel;
import objectRepository.Details;
import objectRepository.Energy;
import objectRepository.Results;
import objectRepository.Supplier;

public class Gas extends ActionCommands
{
	int urlCol = 0, urlRow = 1, pCodeCol = 1, pCodeRow = 1, emailCol = 2, emailRow = 1;
  @Test
  public void GasComparision()
  {
	  	//get the url from the excel sheet and store in string url
		String url = Excel.reader(urlCol, urlRow, "Sheet1");
		//get the postcode from the excel sheet and store in string postcode
		String postCode = Excel.reader(pCodeCol, pCodeRow, "Sheet1");
		String emailId = Excel.reader(emailCol, emailRow, "Sheet1");
		//open FireFox Browser
		BrowserSelection("FireFox"); 
		url(url); 
		
		//Supplier Tab
		//verify the main heading Your Supplier to check the url is launched the correct page or not
		Assert.assertEquals(isDisplay(Supplier.supplierHeading), true);
		//Enter PsotCode in PostCode text box
		sendText(Supplier.enterPostCode, postCode);
		//click on the find postcode button
		click(Supplier.findPostCode);
		//Click on the Gas only label under "what do you want to compare"
		click(Supplier.gas_Compare);
		//Click on the BritishGas label under "who supplies your electricity"
		click(Supplier.suppliesGas_BritishGas);
		//Click on the next button in Supplier tab  to navigate to energy tab.
		click(Supplier.next_SuppliersPage);
		
		//Energy Tab
		// Verify the Your energy heading of the energy tab for validation to check the correct tab is displayed or not
		Assert.assertEquals(isDisplay(Energy.energyHeading), true);
		// select the 8th option in the electricity tariff list box
		dropDown(Energy.gasTariff_dropDown, Energy.gasTariff_dropDownList);
		// select the 4th option in pay for your gas list box
		dropDown(Energy.payyourGas_dropDown, Energy.payYourGas_dropDownList);
		//select "yes" check box for gas is main source of heating
		click(Energy.gasMainSourceOfHeating_yes);
		//select "kWh" check box for current gas usage
		click(Energy.currentGasUsage_kWh);
		//Enter text in current gas usage spent text box
		sendText(Energy.currentGasUsageSpent, "50");
		//dropDown(Energy.typeOfGasBillChoosen_dropDown,Energy.typeOfGasBillChoosen_dropDownList);
		////Click on the next button in energy tab  to navigate to details tab.
		click(Energy.next_EnergyPage);
		
		//Details Tab
		//// Verify the Your details heading of the details tab for validation to check the correct tab is displayed or not
		Assert.assertEquals(isDisplay(Details.detailsHeading), true);
		//Select the fixed tariff label for "what tariff you are interested in " option
		click(Details.tariffInterestedIn_fixedTariff);
		//Select the Payment type Monthly label for "what payment type you are interested in " option
		click(Details.paymentType_Monthly);
		//Enter emailID in email text box. emailId is entered from excel sheet.
		sendText(Details.email, emailId);
		// Check the AgreeCTM checkbox
		click(Details.agreeCTM);
		// Check the TermsAndConditions checkbox
		click(Details.termsAndConditions);
		//Click on the next button in details tab  to navigate to results tab.
		click(Details.goToPrices_button);
		
		// Results Tab
		// Verify the Your estimated usage heading of the results tab for validation to check the correct tab is displayed or not
		Assert.assertEquals(isDisplay(Results.gas_ResultsHeading), true);
		//Storing the results in actualResult variable
		String actualResult = driver.findElement(Results.gas_AllResults).getText().toString();
		// expected result value
		String expectedResult = "33";
		//comparing the actaul and expected result values.
		Assert.assertEquals(actualResult, expectedResult);
		
		driver.close();
	
  }
}
