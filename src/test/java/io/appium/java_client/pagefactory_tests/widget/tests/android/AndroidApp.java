package io.appium.java_client.pagefactory_tests.widget.tests.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory_tests.widget.tests.ExtendedApp;

import java.util.List;

public class AndroidApp extends WidgetManager implements ExtendedApp {

    @Override
    public DefaultAndroidWidget getWidget() {
        return singleAndroidWidget;
    }

    @Override
    public List<DefaultAndroidWidget> getWidgets() {
        return multipleAndroidWidgets;
    }

    @Override
    public DefaultAndroidWidget getAnnotatedWidget() {
        return singleAnnotatedAndroidWidget;
    }

    @Override
    public List<AnnotatedAndroidWidget> getAnnotatedWidgets() {
        return multipleAnnotatedAndroidWidgets;
    }

    @Override
    public DefaultAndroidWidget getExtendedWidget() {
        return singleExtendedAndroidWidget;
    }

    @Override
    public List<ExtendedAndroidWidget> getExtendedWidgets() {
        return multipleExtendedAndroidWidgets;
    }

    @Override
    public DefaultAndroidWidget getExtendedWidgetWithOverriddenLocators() {
        return singleOverriddenAndroidWidget;
    }

    @Override
    public List<ExtendedAndroidWidget> getExtendedWidgetsWithOverriddenLocators() {
        return multipleOverriddenAndroidWidgets;
    }
}
