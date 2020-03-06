/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.projectWizard.cli;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ProjectTemplateBuildFileGenerationTestGenerated extends AbstractProjectTemplateBuildFileGenerationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInProjectTemplatesBuildFileGeneration() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("androidApplication")
    public void testAndroidApplication() throws Exception {
        runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration/androidApplication/");
    }

    @TestMetadata("emptyMultiplatform")
    public void testEmptyMultiplatform() throws Exception {
        runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration/emptyMultiplatform/");
    }

    @TestMetadata("emptySingleplatform")
    public void testEmptySingleplatform() throws Exception {
        runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration/emptySingleplatform/");
    }

    @TestMetadata("jsBrowserApplication")
    public void testJsBrowserApplication() throws Exception {
        runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration/jsBrowserApplication/");
    }

    @TestMetadata("jvmConsoleApplication")
    public void testJvmConsoleApplication() throws Exception {
        runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration/jvmConsoleApplication/");
    }

    @TestMetadata("jvmServerJsClient")
    public void testJvmServerJsClient() throws Exception {
        runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration/jvmServerJsClient/");
    }

    @TestMetadata("multiplatformLibrary")
    public void testMultiplatformLibrary() throws Exception {
        runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration/multiplatformLibrary/");
    }

    @TestMetadata("nativeConsoleApplication")
    public void testNativeConsoleApplication() throws Exception {
        runTest("libraries/tools/new-project-wizard/new-project-wizard-cli/testData/projectTemplatesBuildFileGeneration/nativeConsoleApplication/");
    }
}
