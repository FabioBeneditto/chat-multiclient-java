package server;

/**
 * Created by samuel on 24/09/15.
 * Updated by fabiobeneditto on 14/10/15.
 */
public class MultiUserExecServer {
    public static void main(String[] args) {
        MultiUserChatServer mucs = new MultiUserChatServer();
        mucs.configServer();
        mucs.waitClients();
    }
}
