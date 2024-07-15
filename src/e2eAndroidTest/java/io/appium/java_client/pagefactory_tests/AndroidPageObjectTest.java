/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.java_client.pagefactory_tests;

import io.appium.java_client.android.BaseAndroidTest;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.HowToUseLocators;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings({"unused", "MismatchedQueryAndUpdateOfCollection"})
public class AndroidPageObjectTest extends BaseAndroidTest {

    private boolean populated = false;

    @FindBy(className = "android.widget.TextView")
    protected List<WebElement> textVieWs;

    @AndroidFindBy(className = "android.widget.TextView")
    protected List<WebElement> androidTextViews;

    @AndroidFindBy(className = "android.widget.TextView")
    protected List<WebElement> androidOriOsTextViews;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\")")
    protected List<WebElement> androidUIAutomatorViews;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\")")
    protected List<WebElement> mobileElementViews;

    @FindBy(className = "android.widget.TextView")
    protected List<WebElement> mobiletextVieWs;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\")")
    protected List<RemoteWebElement> remoteElementViews;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    @AndroidFindBy(className = "android.widget.TextView")
    protected List<WebElement> chainElementViews;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    @AndroidFindBy(id = "android:id/text1")
    protected List<WebElement> chainAndroidOrIOSUIAutomatorViews;

    @FindBy(id = "android:id/text1")
    protected WebElement textView;

    @AndroidFindBy(className = "android.widget.TextView")
    protected WebElement androidTextView;

    @AndroidFindBy(className = "android.widget.TextView")
    protected WebElement androidOriOsTextView;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\")")
    protected WebElement androidUIAutomatorView;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\")")
    protected WebElement mobileElementView;

    @FindBy(className = "android.widget.TextView")
    protected WebElement mobiletextVieW;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/text1\")")
    protected RemoteWebElement remotetextVieW;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    @AndroidFindBy(className = "android.widget.TextView")
    protected WebElement chainElementView;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    @AndroidFindBy(id = "android:id/text1")
    protected WebElement chainAndroidOrIOSUIAutomatorView;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    @AndroidFindBy(id = "android:id/text1")
    protected WebElement androidElementView;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    @AndroidFindBy(id = "android:id/text1")
    protected List<WebElement> androidElementViews;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/Fakecontent\")")
    @AndroidFindBy(id = "android:id/Faketext1")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    //by this locator element is found
    @AndroidFindBy(id = "android:id/FakeId")
    protected List<WebElement> findAllElementViews;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/Fakecontent\")")
    @AndroidFindBy(id = "android:id/Faketext1")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    //by this locator element is found
    @AndroidFindBy(id = "android:id/FakeId")
    protected WebElement findAllElementView;

    @AndroidFindBy(id = "android:id/text1")
    protected WebElement textAndroidId;

    @FindBy(css = "e.e1.e2")
    protected List<WebElement> elementsWhenAndroidLocatorIsNotDefinedAndThereIsInvalidFindBy;

    @FindBy(css = "e.e1.e2")
    protected WebElement elementWhenAndroidLocatorIsNotDefinedAndThereIsInvalidFindBy;

    @FindBy(id = "fakeId")
    protected WebElement fakeElement;

    @FindBy(id = "fakeId")
    protected List<WebElement> fakeElements;

    @FindBy(className = "android.widget.TextView")
    @CacheLookup
    protected List<WebElement> cachedViews;

    @CacheLookup
    @FindBy(className = "android.widget.TextView")
    protected WebElement cached;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    @AndroidFindBy(id = "android:id/Faketext1")
    @AndroidFindBy(id = "android:id/text1")
    protected WebElement elementFoundByInvalidChainedSelector;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")
    @AndroidFindBy(id = "android:id/Faketext1")
    @AndroidFindBy(id = "android:id/text1")
    protected List<WebElement> elementsFoundByInvalidChainedSelector;

    @AndroidFindBy(id = "android:id/text1", priority = 2)
    @AndroidFindAll(value = {
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")"),
        @AndroidBy(id = "android:id/fakeId")}, priority = 1)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")")
    protected WebElement androidElementViewFoundByMixedSearching;

    @AndroidFindBy(id = "android:id/text1", priority = 2)
    @AndroidFindAll(value = {
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")"),
        @AndroidBy(id = "android:id/fakeId")}, priority = 1)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")")
    protected List<WebElement> androidElementsViewFoundByMixedSearching;

    @AndroidFindBys({
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")", priority = 1),
        @AndroidBy(className = "android.widget.FrameLayout")})
    @AndroidFindBys({@AndroidBy(id = "android:id/text1", priority = 1),
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")})
    protected WebElement androidElementViewFoundByMixedSearching2;

    @AndroidFindBys({
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")", priority = 1),
        @AndroidBy(className = "android.widget.FrameLayout")})
    @AndroidFindBys({
        @AndroidBy(id = "android:id/text1", priority = 1),
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")")})
    protected List<WebElement> androidElementsViewFoundByMixedSearching2;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(id = "android:id/fakeId1")
    @AndroidFindBy(id = "android:id/fakeId2", priority = 1)
    @AndroidFindBys(value = {
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")", priority = 1),
        @AndroidBy(id = "android:id/text1", priority = 3),
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")", priority = 2),
        @AndroidBy(className = "android.widget.FrameLayout")}, priority = 2)
    @AndroidFindBy(id = "android:id/fakeId3", priority = 3)
    @AndroidFindBy(id = "android:id/fakeId4", priority = 4)
    protected WebElement androidElementViewFoundByMixedSearching3;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(id = "android:id/fakeId1")
    @AndroidFindBy(id = "android:id/fakeId2", priority = 1)
    @AndroidFindBys(value = {
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/content\")", priority = 1),
        @AndroidBy(id = "android:id/text1", priority = 3),
        @AndroidBy(uiAutomator = "new UiSelector().resourceId(\"android:id/list\")", priority = 2),
        @AndroidBy(className = "android.widget.FrameLayout")}, priority = 2)
    @AndroidFindBy(id = "android:id/fakeId3", priority = 3)
    @AndroidFindBy(id = "android:id/fakeId4", priority = 4)
    protected List<WebElement> androidElementsViewFoundByMixedSearching3;

    /**
     * The setting up.
     */
    @BeforeEach public void setUp() {
        if (!populated) {
            //This time out is set because test can be run on slow Android SDK emulator
            PageFactory.initElements(new AppiumFieldDecorator(driver, ofSeconds(5)), this);
        }

        populated = true;
    }
}
