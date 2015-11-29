package net.songpon.hellorx;

import rx.Observable;

/**
 *
 */
public class HelloRx {

    public static void hello(String... names) {
        Observable.from(names).subscribe(s -> {
            System.out.println("Hello " + s + "!");
        });
    }
}
