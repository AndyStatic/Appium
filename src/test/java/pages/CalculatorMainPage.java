package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CalculatorMainPage extends BasePage  {

    By operandOneTxt = By.id("editTextFirstOperand");
    By operandTwoTxt = By.id("editTextSecondOperand");
    By plusBtn = By.id("buttonPlus");
    By minusBtn = By.id("buttonMinus");
    By divideBtn = By.id("buttonDivide");
    By multiplyBtn = By.id("buttonMultiply");
    By optionLbl = By.id("textViewOperator");
    By calculateBtn = By.id("buttonCalculate");
    By resultLbl = By.id("textViewResult");

    public CalculatorMainPage(WebDriver driver) {
        super(driver);
    }

    public CalculatorMainPage sum() {
        waitForVisibilityOf(resultLbl);
        //first operand
        driver.findElement(operandOneTxt).clear();
        driver.findElement(operandOneTxt).sendKeys("3");
        driver.navigate().back(); //older appium
        //second operand
        driver.findElement(operandTwoTxt).clear();
        driver.findElement(operandTwoTxt).sendKeys("3");
        driver.navigate().back();
        //press button
        driver.findElement(plusBtn).click();
        Assert.assertTrue(driver.findElement(optionLbl).getText().equalsIgnoreCase("+"));
        //press calculate
        driver.findElement(calculateBtn).click();
        //assert result
        Assert.assertTrue(driver.findElement(resultLbl).getText().equalsIgnoreCase("6.0"));
        return new CalculatorMainPage(driver);
    }

    public CalculatorMainPage subtract() {
        waitForVisibilityOf(resultLbl);
        //first operand
        driver.findElement(operandOneTxt).clear();
        driver.findElement(operandOneTxt).sendKeys("3");
        driver.navigate().back();
        //second operand
        driver.findElement(operandTwoTxt).clear();
        driver.findElement(operandTwoTxt).sendKeys("3");
        driver.navigate().back();
        //press button
        driver.findElement(minusBtn).click();
        Assert.assertTrue(driver.findElement(optionLbl).getText().equalsIgnoreCase("-"));
        //press calculate
        driver.findElement(calculateBtn).click();
        //assert result
        Assert.assertTrue(driver.findElement(resultLbl).getText().equalsIgnoreCase("0.0"));
        return new CalculatorMainPage(driver);
    }

    public CalculatorMainPage divide() {
        waitForVisibilityOf(resultLbl);
        //first operand
        driver.findElement(operandOneTxt).clear();
        driver.findElement(operandOneTxt).sendKeys("3");
        driver.navigate().back();
        //second operand
        driver.findElement(operandTwoTxt).clear();
        driver.findElement(operandTwoTxt).sendKeys("3");
        driver.navigate().back();
        //press button
        driver.findElement(divideBtn).click();
        Assert.assertTrue(driver.findElement(optionLbl).getText().equalsIgnoreCase("/"));
        //press calculate
        driver.findElement(calculateBtn).click();
        //assert result
        Assert.assertTrue(driver.findElement(resultLbl).getText().equalsIgnoreCase("1.0"));
        return new CalculatorMainPage(driver);
    }

    public CalculatorMainPage multiply() {
        waitForVisibilityOf(resultLbl);
        //first operand
        driver.findElement(operandOneTxt).clear();
        driver.findElement(operandOneTxt).sendKeys("3");
        driver.navigate().back();
        //second operand
        driver.findElement(operandTwoTxt).clear();
        driver.findElement(operandTwoTxt).sendKeys("3");
        driver.navigate().back();
        //press button
        driver.findElement(multiplyBtn).click();
        Assert.assertTrue(driver.findElement(optionLbl).getText().equalsIgnoreCase("*"));
        //press calculate
        driver.findElement(calculateBtn).click();
        //assert result
        Assert.assertTrue(driver.findElement(resultLbl).getText().equalsIgnoreCase("9.0"));
        return new CalculatorMainPage(driver);
    }
}
