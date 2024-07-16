package io.appium.java_client.pagefactory_tests.widget.tests.android;

import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class WidgetManager {

    public static String ANDROID_DEFAULT_WIDGET_LOCATOR = "SOME_ANDROID_DEFAULT_LOCATOR";

    public static String ANDROID_EXTERNALLY_DEFINED_WIDGET_LOCATOR = "SOME_ANDROID_EXTERNALLY_DEFINED_LOCATOR";

    @AndroidFindBy(uiAutomator = "SOME_ANDROID_DEFAULT_LOCATOR")
    protected DefaultAndroidWidget singleAndroidWidget;

    @AndroidFindBy(uiAutomator = "SOME_ANDROID_DEFAULT_LOCATOR")
    protected List<DefaultAndroidWidget> multipleAndroidWidgets;

    /**
     * This class is annotated by {@link AndroidFindBy}
     * This field was added to check that locator is created correctly according to current platform
     * and current automation.
     */
    protected AnnotatedAndroidWidget singleAnnotatedAndroidWidget;

    /**
     * This class is annotated by {@link AndroidFindBy}
     * This field was added to check that locator is created correctly according to current platform
     * and current automation.
     */
    protected List<AnnotatedAndroidWidget> multipleAnnotatedAndroidWidgets;

    /**
     * This class is not annotated by {@link AndroidFindBy}
     * But the superclass is annotated by these annotations. This field was added to check that locator is
     * created correctly according to current platform and current automation.
     */
    protected ExtendedAndroidWidget singleExtendedAndroidWidget;

    /**
     * This class is not annotated by {@link AndroidFindBy}
     * But the superclass is annotated by these annotations. This field was added to check that locator is
     * created correctly according to current platform and current automation.
     */
    protected List<ExtendedAndroidWidget> multipleExtendedAndroidWidgets;

    /**
     * The superclass is annotated by {@link AndroidFindBy}
     * However there is the field which is annotated by this annotations.
     * This field was added to check that locator is
     * created correctly according to current platform and current automation and
     * annotations that mark the field.
     */
    @AndroidFindBy(uiAutomator = "SOME_ANDROID_EXTERNALLY_DEFINED_LOCATOR")
    protected ExtendedAndroidWidget singleOverriddenAndroidWidget;

    /**
     * The superclass is annotated by {@link AndroidFindBy}
     * However there is the field which is annotated by this annotations.
     * This field was added to check that locator is
     * created correctly according to current platform and current automation and
     * annotations that mark the field.
     */
    @AndroidFindBy(uiAutomator = "SOME_ANDROID_EXTERNALLY_DEFINED_LOCATOR")
    protected List<ExtendedAndroidWidget> multipleOverriddenAndroidWidgets;
}
