package pl.coderslab;

import com.google.common.collect.Lists;

import java.util.List;

public class MainGuava {

    public static void main( String[] args )
    {

        List<String> names = Lists.newArrayList("Arek", "Czarek", "Darek", "Adam", "Jarek");
        List<String> reversed = Lists.reverse(names);

        System.out.println(names);
        System.out.println(reversed);

    }

}
