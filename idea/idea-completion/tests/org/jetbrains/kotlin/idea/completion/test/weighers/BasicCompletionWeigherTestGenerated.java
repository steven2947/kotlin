/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.completion.test.weighers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/weighers/basic")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BasicCompletionWeigherTestGenerated extends AbstractBasicCompletionWeigherTest {
    @TestMetadata("AfterNullable.kt")
    public void testAfterNullable() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/AfterNullable.kt");
        doTest(fileName);
    }

    public void testAllFilesPresentInBasic() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/weighers/basic"), Pattern.compile("^([^.]+)\\.kt$"), true);
    }

    @TestMetadata("CallableReference_NothingLast.kt")
    public void testCallableReference_NothingLast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/CallableReference_NothingLast.kt");
        doTest(fileName);
    }

    @TestMetadata("Callables.kt")
    public void testCallables() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/Callables.kt");
        doTest(fileName);
    }

    @TestMetadata("DelegateToOtherObject.kt")
    public void testDelegateToOtherObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/DelegateToOtherObject.kt");
        doTest(fileName);
    }

    @TestMetadata("DeprecatedFun.kt")
    public void testDeprecatedFun() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/DeprecatedFun.kt");
        doTest(fileName);
    }

    @TestMetadata("DeprecatedJavaClass.kt")
    public void testDeprecatedJavaClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/DeprecatedJavaClass.kt");
        doTest(fileName);
    }

    @TestMetadata("ExactMatchForKeyword.kt")
    public void testExactMatchForKeyword() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/ExactMatchForKeyword.kt");
        doTest(fileName);
    }

    @TestMetadata("ImportedFirst.kt")
    public void testImportedFirst() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/ImportedFirst.kt");
        doTest(fileName);
    }

    @TestMetadata("ImportedFirstForJavaClass.kt")
    public void testImportedFirstForJavaClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/ImportedFirstForJavaClass.kt");
        doTest(fileName);
    }

    @TestMetadata("ImportedOrder.kt")
    public void testImportedOrder() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/ImportedOrder.kt");
        doTest(fileName);
    }

    @TestMetadata("KeywordsLast.kt")
    public void testKeywordsLast() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/KeywordsLast.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalFileBeforeImported.kt")
    public void testLocalFileBeforeImported() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/LocalFileBeforeImported.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalValuesAndParams.kt")
    public void testLocalValuesAndParams() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/LocalValuesAndParams.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalsBeforeKeywords.kt")
    public void testLocalsBeforeKeywords() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/LocalsBeforeKeywords.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalsPropertiesKeywords.kt")
    public void testLocalsPropertiesKeywords() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/LocalsPropertiesKeywords.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedParameters.kt")
    public void testNamedParameters() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/NamedParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedParameters2.kt")
    public void testNamedParameters2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/NamedParameters2.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedParameters3.kt")
    public void testNamedParameters3() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/NamedParameters3.kt");
        doTest(fileName);
    }

    @TestMetadata("Packages.kt")
    public void testPackages() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/Packages.kt");
        doTest(fileName);
    }

    @TestMetadata("ParametersBeforeKeywords.kt")
    public void testParametersBeforeKeywords() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/ParametersBeforeKeywords.kt");
        doTest(fileName);
    }

    @TestMetadata("PreferFromJdk.kt")
    public void testPreferFromJdk() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/PreferFromJdk.kt");
        doTest(fileName);
    }

    @TestMetadata("PreferGetMethodToProperty.kt")
    public void testPreferGetMethodToProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/PreferGetMethodToProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("PropertiesBeforeKeywords.kt")
    public void testPropertiesBeforeKeywords() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/PropertiesBeforeKeywords.kt");
        doTest(fileName);
    }

    @TestMetadata("StaticMembers.kt")
    public void testStaticMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/StaticMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("SuperMembers.kt")
    public void testSuperMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/SuperMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ExpectedInfo extends AbstractBasicCompletionWeigherTest {
        @TestMetadata("AfterAs.kt")
        public void testAfterAs() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/AfterAs.kt");
            doTest(fileName);
        }

        public void testAllFilesPresentInExpectedInfo() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/weighers/basic/expectedInfo"), Pattern.compile("^([^.]+)\\.kt$"), true);
        }

        @TestMetadata("CompanionObjectMethod.kt")
        public void testCompanionObjectMethod() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/CompanionObjectMethod.kt");
            doTest(fileName);
        }

        @TestMetadata("EnumEntries.kt")
        public void testEnumEntries() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/EnumEntries.kt");
            doTest(fileName);
        }

        @TestMetadata("ExpectedType.kt")
        public void testExpectedType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/ExpectedType.kt");
            doTest(fileName);
        }

        @TestMetadata("ExpectedType2.kt")
        public void testExpectedType2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/ExpectedType2.kt");
            doTest(fileName);
        }

        @TestMetadata("LambdaValue.kt")
        public void testLambdaValue() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/LambdaValue.kt");
            doTest(fileName);
        }

        @TestMetadata("MultiArgsItem.kt")
        public void testMultiArgsItem() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/MultiArgsItem.kt");
            doTest(fileName);
        }

        @TestMetadata("NameSimilarity.kt")
        public void testNameSimilarity() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/NameSimilarity.kt");
            doTest(fileName);
        }

        @TestMetadata("NameSimilarityAndNoExpectedType.kt")
        public void testNameSimilarityAndNoExpectedType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/NameSimilarityAndNoExpectedType.kt");
            doTest(fileName);
        }

        @TestMetadata("NameSimilarityAndNoExpectedType2.kt")
        public void testNameSimilarityAndNoExpectedType2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/NameSimilarityAndNoExpectedType2.kt");
            doTest(fileName);
        }

        @TestMetadata("NoStupidComparison.kt")
        public void testNoStupidComparison() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/NoStupidComparison.kt");
            doTest(fileName);
        }

        @TestMetadata("Null.kt")
        public void testNull() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/Null.kt");
            doTest(fileName);
        }

        @TestMetadata("PreferMatchingThis.kt")
        public void testPreferMatchingThis() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/PreferMatchingThis.kt");
            doTest(fileName);
        }

        @TestMetadata("TrueFalse.kt")
        public void testTrueFalse() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/TrueFalse.kt");
            doTest(fileName);
        }

        @TestMetadata("WhenByEnum.kt")
        public void testWhenByEnum() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo/WhenByEnum.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ParameterNameAndType extends AbstractBasicCompletionWeigherTest {
        public void testAllFilesPresentInParameterNameAndType() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/weighers/basic/parameterNameAndType"), Pattern.compile("^([^.]+)\\.kt$"), true);
        }

        @TestMetadata("Deprecated.kt")
        public void testDeprecated() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType/Deprecated.kt");
            doTest(fileName);
        }

        @TestMetadata("FromCurrentFilePriority.kt")
        public void testFromCurrentFilePriority() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType/FromCurrentFilePriority.kt");
            doTest(fileName);
        }

        @TestMetadata("ImportedFirst.kt")
        public void testImportedFirst() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType/ImportedFirst.kt");
            doTest(fileName);
        }

        @TestMetadata("MoreWordsMatchFirst.kt")
        public void testMoreWordsMatchFirst() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType/MoreWordsMatchFirst.kt");
            doTest(fileName);
        }

        @TestMetadata("ShorterFirst.kt")
        public void testShorterFirst() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType/ShorterFirst.kt");
            doTest(fileName);
        }

        @TestMetadata("StartMatchFirst.kt")
        public void testStartMatchFirst() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType/StartMatchFirst.kt");
            doTest(fileName);
        }

        @TestMetadata("UserPrefix.kt")
        public void testUserPrefix() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType/UserPrefix.kt");
            doTest(fileName);
        }
    }
}
