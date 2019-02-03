package com.sunnie.java8.examples.chapter3;

import com.sunnie.java8.examples.common.Album;
import org.junit.Test;

import java.util.Set;

import static com.sunnie.java8.examples.chapter3.GetBankNationalities19.getBankNationalities19;
import static com.sunnie.java8.examples.common.Print.printSet;
import static com.sunnie.java8.examples.common.SampleData.aLoveSupreme;

public class GetBankNationalities19Test {
    @Test
    public void testGetBankNationalities19() {
        Album album = aLoveSupreme;
        System.out.println(album);
        Set<String> set = getBankNationalities19(album);
        printSet(set);
    }
}
