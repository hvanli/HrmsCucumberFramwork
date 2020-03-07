package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsWebElements extends BaseClass {

	@FindBy(id = "empPic")
	public WebElement empPicture;

	@FindBy(xpath = "//div[@id='profile-pic']/h1")
	public WebElement nameOnPicture;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement empId;

	@FindBy(id = "personal_txtEmpFirstName")
	public WebElement firstName;

	@FindBy(id = "personal_txtEmpMiddleName")
	public WebElement middleName;

	@FindBy(id = "personal_txtEmpLastName")
	public WebElement lastName;

	@FindBy(id = "personal_txtOtherID")
	public WebElement otherId;

	@FindBy(id = "personal_txtLicenNo")
	public WebElement driverLicenseNumber;

	@FindBy(id = "personal_txtLicExpDate")
	public WebElement licenseExpiryDate;

	@FindBy(id = "personal_txtNICNo")
	public WebElement ssnNumber;

	@FindBy(id = "personal_txtSINNo")
	public WebElement sinNumber;

	@FindBy(id = "personal_optGender_1")
	public WebElement maleButton;

	@FindBy(id = "personal_optGender_2")
	public WebElement femaleButton;

	@FindBy(id = "personal_cmbMarital")
	public WebElement maritalStatus;

	@FindBy(id = "personal_cmbNation")
	public WebElement nationality;

	@FindBy(id = "personal_DOB")
	public WebElement dateOfBirth;

	@FindBy(id = "personal_txtEmpNickName")
	public WebElement nickName;

	@FindBy(id = "personal_txtMilitarySer")
	public WebElement militaryService;

	@FindBy(id = "personal_chkSmokeFlag")
	public WebElement smoker;

	@FindBy(id = "btnSave")
	public WebElement edit_SaveBtn;
	
	@FindBy(xpath="")
	public List<WebElement> list;

	public void selectDate(String year, String month, String day) {
		PersonalDetailsWebElements pd = new PersonalDetailsWebElements();
		pd.licenseExpiryDate.clear();
		pd.licenseExpiryDate.click();

		WebElement mnth = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
		Select mSelect = new Select(mnth);
		mSelect.selectByVisibleText(month);

		List<WebElement> years = driver.findElements(By.xpath("//select[@class='ui-datepicker-year']/option"));

		for (WebElement yr : years) {
			if (yr.getText().equals(year)) {
				yr.click();
				break;
			}
		}
		List<WebElement> dayList = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		for (WebElement dy : dayList) {
			if (dy.getText().equals(day)) {
				dy.click();
				break;
			}
		}
	}

	public void genderSelect(String gender) {
		PersonalDetailsWebElements pd = new PersonalDetailsWebElements();
		if (gender.equals("Male")) {
			pd.maleButton.click();
		} else {
			pd.femaleButton.click();
		}
	}

	public PersonalDetailsWebElements() {
		PageFactory.initElements(driver, this);
	}
}
