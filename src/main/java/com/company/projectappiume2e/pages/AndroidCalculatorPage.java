package com.company.projectappiume2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AndroidCalculatorPage {
    protected WebDriver driver;

    public AndroidCalculatorPage(WebDriver driver) {
        this.driver = driver;
    }

    //Numbers
    private By btnZero = By.xpath("//android.widget.Button[@text='0']");
    private By btnOne = By.xpath("//android.widget.Button[@text='1']");
    private By btnTwo = By.xpath("//android.widget.Button[@text='2']");
    private By btnThree = By.xpath("//android.widget.Button[@text='3']");
    private By btnFour = By.xpath("//android.widget.Button[@text='4']");
    private By btnFive = By.xpath("//android.widget.Button[@text='5']");
    private By btnSix = By.xpath("//android.widget.Button[@text='6']");
    private By btnSeven = By.xpath("//android.widget.Button[@text='7']");
    private By btnEight = By.xpath("//android.widget.Button[@text='8']");
    private By btnNine = By.xpath("//android.widget.Button[@text='9']");

    //Operators
    private By btnAdd = By.id("com.google.android.calculator:id/op_add");
    private By btnSub = By.id("com.google.android.calculator:id/op_sub");
    private By btnMultiply = By.id("com.google.android.calculator:id/op_mul");
    private By btnDiv = By.id("com.google.android.calculator:id/op_div");
    private By btnResult = By.id("com.google.android.calculator:id/eq");
    //Result
    private By txtResult = By.id("com.google.android.calculator:id/eq");
}
