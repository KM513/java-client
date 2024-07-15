/* Karim Mamlook
*  B00904184
*  This class is created to solve the insufficient modularization code smell, caused by the class being too large (400 lines)
*  I created this class to hold the test methods that were in the AndroidPageObjectTest class*/


package io.appium.java_client.pagefactory_tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AndroidTests extends AndroidPageObjectTest{

    @Test
    public void findByElementsTest() {
        assertNotEquals(0, textVieWs.size());
    }

    @Test public void findByElementTest() {
        assertNotEquals(null, textView.getAttribute("text"));
    }


    @Test public void androidFindByElementsTest() {
        assertNotEquals(0, androidTextViews.size());
    }

    @Test public void androidFindByElementTest() {
        assertNotEquals(null, androidTextView.getAttribute("text"));
    }

    @Test public void androidOrIOSFindByElementsTest() {
        assertNotEquals(0, androidOriOsTextViews.size());
    }

    @Test public void androidOrIOSFindByElementTest() {
        assertNotEquals(null, androidOriOsTextView.getAttribute("text"));
    }

    @Test public void androidFindByUIAutomatorElementsTest() {
        assertNotEquals(0, androidUIAutomatorViews.size());
    }

    @Test public void androidFindByUIAutomatorElementTest() {
        assertNotEquals(null, androidUIAutomatorView.getAttribute("text"));
    }

    @Test public void areMobileElementsTest() {
        assertNotEquals(0, mobileElementViews.size());
    }

    @Test public void isMobileElementTest() {
        assertNotEquals(null, mobileElementView.getAttribute("text"));
    }

    @Test public void areMobileElementsFindByTest() {
        assertNotEquals(0, mobiletextVieWs.size());
    }

    @Test public void isMobileElementFindByTest() {
        assertNotEquals(null, mobiletextVieW.getAttribute("text"));
    }

    @Test public void areRemoteElementsTest() {
        assertNotEquals(0, remoteElementViews.size());
    }

    @Test public void isRemoteElementTest() {
        assertNotEquals(null, remotetextVieW.getAttribute("text"));
    }

    @Test public void androidChainSearchElementsTest() {
        assertNotEquals(0, chainElementViews.size());
    }

    @Test public void androidChainSearchElementTest() {
        assertNotEquals(null, chainElementView.getAttribute("text"));
    }
    // Changed name from androidOrIOSFindByElementsTestChainSearches to testFindByElements
    @Test public void testFindByElements() {
        assertNotEquals(0, chainAndroidOrIOSUIAutomatorViews.size());
    }

    @Test public void androidOrIOSFindByElementTestChainSearches() {
        assertNotEquals(null, chainAndroidOrIOSUIAutomatorView.getAttribute("text"));
    }

    @Test public void isAndroidElementTest() {
        assertNotEquals(null, androidElementView.getAttribute("text"));
    }

    @Test public void areAndroidElementsTest() {
        assertNotEquals(0, androidElementViews.size());
    }

    @Test public void findAllElementTest() {
        assertNotEquals(null, findAllElementView.getAttribute("text"));
    }

    @Test public void findAllElementsTest() {
        assertNotEquals(0, findAllElementViews.size());
    }

    @Test public void findByAndroidAnnotationOnlyTest() {
        assertNotEquals(null, textAndroidId.getAttribute("text"));
    }

    @Test public void checkThatTestWillNotBeFailedBecauseOfInvalidFindBy() {
        assertThrows(NoSuchElementException.class,
                () -> elementWhenAndroidLocatorIsNotDefinedAndThereIsInvalidFindBy.getAttribute("text"));
    }

    @Test public void checkThatTestWillNotBeFailedBecauseOfInvalidFindByList() {
        assertEquals(0, elementsWhenAndroidLocatorIsNotDefinedAndThereIsInvalidFindBy.size());
    }

    @Test public void checkThatClassObjectMethodsDoNotInvokeTheSearching() {
        assertTrue(WebElement.class.isAssignableFrom(fakeElement.getClass()));
        assertNotEquals(WebElement.class, fakeElement.getClass());
        assertEquals(driver, ((WrapsDriver) fakeElement).getWrappedDriver());
    }

    @Test public void checkThatClassObjectMethodsDoNotInvokeTheSearchingOfElementLest() {
        assertTrue(List.class.isAssignableFrom(fakeElements.getClass()));
        assertNotEquals(ArrayList.class, fakeElements.getClass());
    }

    @Test public void checkCachedElements() {
        assertEquals(((RemoteWebElement) cached).getId(), ((RemoteWebElement) cached).getId());
        assertEquals(cached.hashCode(), cached.hashCode());
        //noinspection SimplifiableAssertion,EqualsWithItself
        assertTrue(cached.equals(cached));
    }

    @Test public void checkCachedLists() {
        assertEquals(cachedViews.hashCode(), cachedViews.hashCode());
        //noinspection SimplifiableAssertion,EqualsWithItself
        assertTrue(cachedViews.equals(cachedViews));
    }

    @Test public void checkListHashing() {
        assertFalse(cachedViews.isEmpty());
        assertEquals(cachedViews.size(), new HashSet<>(cachedViews).size());
    }

    @Test
    public void checkThatElementSearchingThrowsExpectedExceptionIfChainedLocatorIsInvalid() {
        assertThrows(NoSuchElementException.class, () -> elementFoundByInvalidChainedSelector.getAttribute("text"));
    }

    @Test public void checkThatListSearchingWorksIfChainedLocatorIsInvalid() {
        assertEquals(0, elementsFoundByInvalidChainedSelector.size());
    }

    @Test public void checkMixedElementSearching1() {
        assertNotNull(androidElementViewFoundByMixedSearching.getAttribute("text"));
    }

    @Test public void checkMixedElementsSearching1() {
        assertNotEquals(0, androidElementsViewFoundByMixedSearching.size());
    }

    @Disabled("FIXME")
    @Test public void checkMixedElementSearching2() {
        assertNotNull(androidElementViewFoundByMixedSearching2.getAttribute("text"));
    }

    @Test public void checkMixedElementsSearching2() {
        assertNotEquals(0, androidElementsViewFoundByMixedSearching2.size());
    }

    @Test public void checkMixedElementSearching3() {
        assertNotNull(androidElementViewFoundByMixedSearching3.getAttribute("text"));
    }

    @Test public void checkMixedElementsSearching3() {
        assertNotEquals(0, androidElementsViewFoundByMixedSearching3.size());
    }
}
