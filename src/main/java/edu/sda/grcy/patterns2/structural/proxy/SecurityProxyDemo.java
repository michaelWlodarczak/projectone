package edu.sda.grcy.patterns2.structural.proxy;


// TODO - not really working, to be cont.
public class SecurityProxyDemo {
    public static void main(String[] args) {
        TokenValidator tokenValidator = new TokenValidator();
        SessionTokens sessionTokens = new SessionTokens();
        String userName = "Krzysztof";
        String channelName = "design_patterns";
        String message = "I will learn what proxy is! (or Not?)";
        sessionTokens.createTokenForUser(userName);

        MessageSender realMessageSender = new SlackMessageSender();
        MessageSender proxy = new SlackMessageSenderProxy(realMessageSender,sessionTokens,tokenValidator);

        proxy.sendMessage(channelName,userName,message);
    }
}
