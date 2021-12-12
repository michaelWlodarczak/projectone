package edu.sda.grcy.patterns.structural.proxy;

/**
 * Proxy moze byc warstwa zabaezpieczajaca albo cache (pamiec podreczna)
 * W naszym przypadku to warstwa zabezpieczjaca
 * Przed przyznaniem dostepu sprawdzamy, czy czlowiek ktory prosi o dostep do sieci
 * jest pracownikiem firmy czy nie i dajemy dostep do wszystkich zasobow
 * albo tylko do tych niefirmowych
 *
 * Proxy charakteryzuje sie tym ze implementuje go klasa z tej samej rodziny
 * co klasy wlasciwe (
 */
public class ProxyCompanyInternetNetwork implements CompanyInternetNetwork{
    CompanyInternetNetwork internetNetwork;

    @Override
    public void getAccess(String username) {
        if (isEmployee(username)){
            internetNetwork = new PrivateCompanyInternetNetwork(username);
        }else {
            internetNetwork = new PublicCompanyInternetNetwork(username);
        }
        internetNetwork.getAccess(username);
    }

    private boolean isEmployee(String username){
        return CompanyEmployees.isActiveEmployee(username);
    }
}
