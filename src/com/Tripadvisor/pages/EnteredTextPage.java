package com.Tripadvisor.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class EnteredTextPage
{
	@FindBy(css="html body#BODY_BLOCK_JQUERY_REFLOW.rebrand_2017.desktop_web.Search.js_logging div.page div.delineation div.ui_container.main_wrap div.ui_columns.is-gapless div.ui_column.is-12 div.relWrap div.column_wrap.ui_columns.is-multiline div.content_column.ui_column.is-9-desktop.is-12-tablet.is-12-mobile div.prw_rup.prw_search_search_results_lazy div.ui_columns.sections_wrapper div.ui_column.is-12.srp_result_sections div.prw_rup.prw_search_search_results.ajax-content div.section_wrapper.ui_columns.is-multiline div.main_content.ui_column.is-12 div.search-results-list div.ui_columns div.ui_column.is-12.card-wrap div.ui_columns.is-multiline.is-mobile div.ui_column.is-12.content-column.result-card.result-card-default div.prw_rup.prw_search_search_result_poi div.result.inner-columns-wrapper div.ui_columns.is-mobile.result-content-columns div.ui_column.is-9-desktop.is-8-mobile.is-9-tablet.content-block-column div.location-meta-block div.rating-review-count div.prw_rup.prw_common_responsive_rating_and_review_count a.review_count")
	private WebElement review;
	
//	@FindBy(xpath="//*[@id=\"component_12\"]/div/div[2]/div/div[2]/div/div[1]/a")
	
	@FindBy(xpath="//a[text()='Write a review']")
	private WebElement writereview;
	
	
	
	public EnteredTextPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonreviewpage()
	{
		review.click();
		
		
		JavascriptExecutor driver = null;
		JavascriptExecutor js= driver;
		js.executeScript("window.scrollBy(0,2000)");
		
	}
	
	public void clickonwrite()
	{
	
		writereview.click();
	}
}
