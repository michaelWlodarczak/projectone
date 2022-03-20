package edu.sda.grcy.patterns2.behavioral.observer;

public class ObserverUsage {
    public static void main(String[] args) {

        final ChatChannel chatChannel = new ChatChannel("design-patterns");

        final BaseObserver userA = new UserObserver(chatChannel,"Krzysztof");
        final BaseObserver userB = new UserObserver(chatChannel,"Julia");
        final BaseObserver adminA = new AdminObserver(chatChannel,"Michal");
        final BaseObserver adminB = new AdminObserver(chatChannel,"Hanna");

        userA.sendMessage("Hello all");
        userB.sendMessage("Hi Krzysztof");
        adminA.sendMessage("Michal, they cannot see what we write");
        adminB.sendMessage("I know ;)");
    }
}
