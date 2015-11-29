package net.songpon.hellorx;

import rx.Observable;
import rx.Subscriber;

/**
 *
 *
 */
public class Main {

    public static void main(String[] args) {

//        Observable<String> myObservable = Observable.create(
//                new Observable.OnSubscribe<String>() {
//                    @Override
//                    public void call(Subscriber<? super String> sub) {
//                        sub.onNext("Hello, world!");
//                        sub.onCompleted();
//                    }
//                }
//        );

        Observable<String> myOb = Observable.just("Hello, world!");

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) { System.out.println(s); }

            @Override
            public void onCompleted() { }

            @Override
            public void onError(Throwable e) { }
        };

        myOb.subscribe(mySubscriber);
    }
}
