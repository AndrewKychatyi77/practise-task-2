package my.praktikums;

import org.junit.Assert;
import org.junit.Test;

public class TestTree {

    @Test
    public void test_SanityTest_JUnitWorks(){
        Assert.assertEquals(2, 1+1);
    }

    @Test
    public void test_Person (){
        Assert.assertEquals ("Юрій", new SampleFamilyProvider().makeFamilyTree().getName());
    }

    @Test
    public void test_Father(){
        Assert.assertEquals ("Остап",new SampleFamilyProvider().makeFamilyTree().getFather().getName());
    }

    @Test
    public void test_FirstGrandFather (){
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getName());
    }

    @Test
    public void test_FirstGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getName());
    }

    @Test
    public void test_FirstGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getFather().getName());
    }

    @Test
    public void test_FirstGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getFather().getMother().getName());
    }

    @Test
    public void test_SecondGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getFather().getName());
    }

    @Test
    public void test_SecondGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getFather().getMother().getMother().getName());
    }

    @Test
    public void test_Mother () {
        Assert.assertEquals("Катя", new SampleFamilyProvider().makeFamilyTree().getMother().getName());
    }

    @Test
    public void test_SecondGrandMother () {
        Assert.assertEquals("Марина", new SampleFamilyProvider().makeFamilyTree().getMother(). getMother().getName());
    }

    @Test
    public void test_SecondGrandFather () {
        Assert.assertEquals("Іван", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getName());
    }

    @Test
    public void test_ThirdGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getMother().getMother().getMother().getName());
    }

    @Test
    public void test_ThirdGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getMother().getMother().getFather().getName());
    }

    @Test
    public void test_FourthGrandGrandMother () {
        Assert.assertEquals("Невідома", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getMother().getName());
    }

    @Test
    public void test_FourthGrandGrandFather () {
        Assert.assertEquals("Невідомий", new SampleFamilyProvider().makeFamilyTree().getMother().getFather().getFather().getName());
    }


}
