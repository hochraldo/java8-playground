package hochraldo;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambaMethodReference {


    public static void main(String... args) {

        // static method reference
        Predicate<Object> nullCheck = Objects::nonNull;
        System.out.println(nullCheck.test(null));
        System.out.println(nullCheck.test(new Object()));

        // constructor reference
        Supplier<List<Integer>> listSupplier = ArrayList::new;
        List<Integer> list1 = listSupplier.get();
        list1.add(1);
        System.out.println(list1);
        List<Integer> list2 = listSupplier.get();
        list2.add(2);
        list2.add(3);
        System.out.println(list2);

        // method reference
        String s = "Foo";
        Function<Integer, Character> charAt = s::charAt;
        System.out.println(charAt.apply(0));
    }
}

