package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	@FindBy(name="q")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
	
	
	
	
	
	
	
	
	
}
