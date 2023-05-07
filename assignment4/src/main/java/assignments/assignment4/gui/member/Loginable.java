package assignments.assignment4.gui.member;

public interface Loginable {
    boolean login(String id, String password);
    void logout();
    String getPageName();

}
