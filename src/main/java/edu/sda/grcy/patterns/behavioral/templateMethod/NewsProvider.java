package edu.sda.grcy.patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private String message;

    public NewsProvider(String message) {
        this.message = message;
    }

    //metoda ktora musimy nadpisac
    public abstract boolean authorize();

    //metoda ktora pozostaje niezmieniona
    public final boolean sendMessage(){
        System.out.println(" Message sent : " + message);
        return true;
    }

    //metoda opcjonalnie do nadpisania, zalezne od ustawienia kanalu komunikacji
    public boolean endConnection(){
        System.out.println("Generic end connection");
        return true;
    }

    //metoda przechowujaca algorytm, nie mozna jej nadpisac (rozszerzyc)
    public final void provideNews() {
        if (authorize()) {
            sendMessage();
            endConnection();
        }else {
            System.out.println("Can't send to unauthorized");
        }
    }
}
