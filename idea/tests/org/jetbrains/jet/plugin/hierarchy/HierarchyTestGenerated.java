/*
 * Copyright 2010-2014 JetBrains s.r.o.
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

package org.jetbrains.jet.plugin.hierarchy;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.jet.JUnit3RunnerWithInners;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({HierarchyTestGenerated.Type.class, HierarchyTestGenerated.Super.class, HierarchyTestGenerated.Sub.class, HierarchyTestGenerated.Callers.class, HierarchyTestGenerated.Callees.class, HierarchyTestGenerated.Overrides.class})
@RunWith(JUnit3RunnerWithInners.class)
public class HierarchyTestGenerated extends AbstractHierarchyTest {
    @TestMetadata("idea/testData/hierarchy/class/type")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Type extends AbstractHierarchyTest {
        public void testAllFilesPresentInType() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/class/type"), Pattern.compile("^([^\\.]+)$"), false);
        }

        @TestMetadata("CaretAtAnnotation")
        public void testCaretAtAnnotation() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtAnnotation/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtConstructor")
        public void testCaretAtConstructor() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtConstructor/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtFabricMethod")
        public void testCaretAtFabricMethod() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtFabricMethod/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtImport")
        public void testCaretAtImport() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtImport/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtJavaType")
        public void testCaretAtJavaType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtJavaType/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtModifierList")
        public void testCaretAtModifierList() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtModifierList/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtReceiverExtFun")
        public void testCaretAtReceiverExtFun() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtReceiverExtFun/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtSuperCall")
        public void testCaretAtSuperCall() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtSuperCall/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtSupertypesList")
        public void testCaretAtSupertypesList() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtSupertypesList/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretAtTypeReference")
        public void testCaretAtTypeReference() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretAtTypeReference/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("CaretInClassBody")
        public void testCaretInClassBody() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/CaretInClassBody/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("ClassFromClass")
        public void testClassFromClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/ClassFromClass/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("ClassFromObject")
        public void testClassFromObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/ClassFromObject/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("ClassInClassObject")
        public void testClassInClassObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/ClassInClassObject/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("ClassInPackage")
        public void testClassInPackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/ClassInPackage/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("InnerClass")
        public void testInnerClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/InnerClass/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("JKJHierarchy")
        public void testJKJHierarchy() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/JKJHierarchy/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("JavaFromKotlin")
        public void testJavaFromKotlin() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/JavaFromKotlin/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("JavaFromKotlinByRef")
        public void testJavaFromKotlinByRef() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/JavaFromKotlinByRef/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("JavaFromKotlinForKotlinClass")
        public void testJavaFromKotlinForKotlinClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/JavaFromKotlinForKotlinClass/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("JetInt")
        public void testJetInt() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/JetInt/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("KJKHierarchy")
        public void testKJKHierarchy() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/KJKHierarchy/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("KotlinFromJava")
        public void testKotlinFromJava() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/KotlinFromJava/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("KotlinFromJavaByRef")
        public void testKotlinFromJavaByRef() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/KotlinFromJavaByRef/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("KotlinFromKotlinByRef")
        public void testKotlinFromKotlinByRef() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/KotlinFromKotlinByRef/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("Object")
        public void testObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/Object/");
            doTypeClassHierarchyTest(fileName);
        }

        @TestMetadata("TwoChildren")
        public void testTwoChildren() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/type/TwoChildren/");
            doTypeClassHierarchyTest(fileName);
        }
    }

    @TestMetadata("idea/testData/hierarchy/class/super")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Super extends AbstractHierarchyTest {
        public void testAllFilesPresentInSuper() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/class/super"), Pattern.compile("^([^\\.]+)$"), false);
        }

        @TestMetadata("JetList")
        public void testJetList() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/super/JetList/");
            doSuperClassHierarchyTest(fileName);
        }

        @TestMetadata("TwoTraits")
        public void testTwoTraits() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/super/TwoTraits/");
            doSuperClassHierarchyTest(fileName);
        }
    }

    @TestMetadata("idea/testData/hierarchy/class/sub")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Sub extends AbstractHierarchyTest {
        public void testAllFilesPresentInSub() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/class/sub"), Pattern.compile("^([^\\.]+)$"), false);
        }

        @TestMetadata("AllFromClass")
        public void testAllFromClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/sub/AllFromClass/");
            doSubClassHierarchyTest(fileName);
        }

        @TestMetadata("AllFromTrait")
        public void testAllFromTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/sub/AllFromTrait/");
            doSubClassHierarchyTest(fileName);
        }

        @TestMetadata("ClassFromClass")
        public void testClassFromClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/sub/ClassFromClass/");
            doSubClassHierarchyTest(fileName);
        }

        @TestMetadata("ClassFromTrait")
        public void testClassFromTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/sub/ClassFromTrait/");
            doSubClassHierarchyTest(fileName);
        }

        @TestMetadata("ObjectFromClass")
        public void testObjectFromClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/sub/ObjectFromClass/");
            doSubClassHierarchyTest(fileName);
        }

        @TestMetadata("ObjectFromTrait")
        public void testObjectFromTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/sub/ObjectFromTrait/");
            doSubClassHierarchyTest(fileName);
        }

        @TestMetadata("TraitFromClass")
        public void testTraitFromClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/sub/TraitFromClass/");
            doSubClassHierarchyTest(fileName);
        }

        @TestMetadata("TraitFromTrait")
        public void testTraitFromTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/class/sub/TraitFromTrait/");
            doSubClassHierarchyTest(fileName);
        }
    }

    @TestMetadata("idea/testData/hierarchy/calls/callers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Callers extends AbstractHierarchyTest {
        public void testAllFilesPresentInCallers() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/calls/callers"), Pattern.compile("^([^\\.]+)$"), false);
        }

        @TestMetadata("javaConstructor")
        public void testJavaConstructor() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/javaConstructor/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("javaMethod")
        public void testJavaMethod() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/javaMethod/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinClass")
        public void testKotlinClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinClass/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinFunction")
        public void testKotlinFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinFunction/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinLocalClass")
        public void testKotlinLocalClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinLocalClass/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinLocalFunction")
        public void testKotlinLocalFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinLocalFunction/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinNestedClass")
        public void testKotlinNestedClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinNestedClass/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinNestedInnerClass")
        public void testKotlinNestedInnerClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinNestedInnerClass/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPackageFunction")
        public void testKotlinPackageFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinPackageFunction/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPackageProperty")
        public void testKotlinPackageProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinPackageProperty/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPrivateClass")
        public void testKotlinPrivateClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinPrivateClass/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPrivateFunction")
        public void testKotlinPrivateFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinPrivateFunction/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPrivateProperty")
        public void testKotlinPrivateProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinPrivateProperty/");
            doCallerHierarchyTest(fileName);
        }

        @TestMetadata("kotlinProperty")
        public void testKotlinProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callers/kotlinProperty/");
            doCallerHierarchyTest(fileName);
        }
    }

    @TestMetadata("idea/testData/hierarchy/calls/callees")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Callees extends AbstractHierarchyTest {
        public void testAllFilesPresentInCallees() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/calls/callees"), Pattern.compile("^([^\\.]+)$"), false);
        }

        @TestMetadata("javaConstructor")
        public void testJavaConstructor() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/javaConstructor/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("javaMethod")
        public void testJavaMethod() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/javaMethod/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinAnonymousObject")
        public void testKotlinAnonymousObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinAnonymousObject/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinClass")
        public void testKotlinClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinClass/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinClassObject")
        public void testKotlinClassObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinClassObject/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinEnumClass")
        public void testKotlinEnumClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinEnumClass/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinFunction")
        public void testKotlinFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinFunction/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinLocalClass")
        public void testKotlinLocalClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinLocalClass/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinLocalFunction")
        public void testKotlinLocalFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinLocalFunction/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinNestedClass")
        public void testKotlinNestedClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinNestedClass/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinObject")
        public void testKotlinObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinObject/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPackageFunction")
        public void testKotlinPackageFunction() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinPackageFunction/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPackageProperty")
        public void testKotlinPackageProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinPackageProperty/");
            doCalleeHierarchyTest(fileName);
        }

        @TestMetadata("kotlinProperty")
        public void testKotlinProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/calls/callees/kotlinProperty/");
            doCalleeHierarchyTest(fileName);
        }
    }

    @TestMetadata("idea/testData/hierarchy/overrides")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Overrides extends AbstractHierarchyTest {
        public void testAllFilesPresentInOverrides() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/hierarchy/overrides"), Pattern.compile("^([^\\.]+)$"), false);
        }

        @TestMetadata("javaMethodInClass")
        public void testJavaMethodInClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/overrides/javaMethodInClass/");
            doOverrideHierarchyTest(fileName);
        }

        @TestMetadata("javaMethodInInterface")
        public void testJavaMethodInInterface() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/overrides/javaMethodInInterface/");
            doOverrideHierarchyTest(fileName);
        }

        @TestMetadata("kotlinFunctionInClass")
        public void testKotlinFunctionInClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/overrides/kotlinFunctionInClass/");
            doOverrideHierarchyTest(fileName);
        }

        @TestMetadata("kotlinFunctionInTrait")
        public void testKotlinFunctionInTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/overrides/kotlinFunctionInTrait/");
            doOverrideHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPropertyInClass")
        public void testKotlinPropertyInClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/overrides/kotlinPropertyInClass/");
            doOverrideHierarchyTest(fileName);
        }

        @TestMetadata("kotlinPropertyInTrait")
        public void testKotlinPropertyInTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("idea/testData/hierarchy/overrides/kotlinPropertyInTrait/");
            doOverrideHierarchyTest(fileName);
        }
    }
}
