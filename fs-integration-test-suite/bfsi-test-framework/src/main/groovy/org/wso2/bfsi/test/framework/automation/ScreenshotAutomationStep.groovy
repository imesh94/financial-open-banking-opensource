/**
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 * <p>
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 *     http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.bfsi.test.framework.automation

import org.openqa.selenium.OutputType
import org.openqa.selenium.remote.RemoteWebDriver
import org.testng.Reporter

/**
 * Class for automate Screenshots
 */
class ScreenshotAutomationStep implements BrowserAutomationStep {

    private static final String TITLE_TEMPLATE = "<h3>%s</h3>"
    private static final String IMAGE_TEMPLATE = "<img src=\"data:image/png;base64, %s\">"
    private String title = "Screenshot"

    /**
     * Initialize Screenshot Automation Step.
     */
    public ScreenshotAutomationStep() {}

    /**
     * Initialize Screenshot Automation Step with title.
     *
     * @param title title of the image
     */
    ScreenshotAutomationStep(String title) {

        this.title = title;
    }

    /**
     * Execute automation using driver.
     *
     * @param webDriver driver object.
     * @param context automation context.
     */
    @Override
    public void execute(RemoteWebDriver webDriver, BrowserAutomation.AutomationContext context) {

        // take screenshot
        String base64 = webDriver.getScreenshotAs(OutputType.BASE64);
        Reporter.log(String.format(TITLE_TEMPLATE, title));
        Reporter.log(String.format(IMAGE_TEMPLATE, base64));
    }

}

