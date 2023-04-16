package assignments.assignment3.user.menu;

import assignments.assignment3.user.Member;

import java.util.Scanner;

public abstract class SystemCLI {
    protected Member[] memberList = new Member[0];
    protected Member loginMember;
    protected Scanner in;

    /**
     * Otentikasi pengguna dengan ID dan password yang diberikan dan memulai sesi pengguna.
     * Akan berhenti jika logout atau ID / Password salah.
     *
     * @param in -> Scanner object untuk membaca input.
     * @param inputId -> ID user yang akan diautentikasi.
     * @param inputPassword -> password user yang akan diautentikasi.
     */
    public void login(Scanner in, String inputId, String inputPassword){
        Member authMember = authUser(inputId, inputPassword);

        if (authMember != null) {
            this.in = in;
            System.out.println("Login successful!");
            run(in, authMember);
            return;
        }

        System.out.println("Invalid ID or password.");
    };

    /**
     * Memulai sesi pengguna dan menangani input.
     *
     * @param in -> Scanner object untuk membaca input.
     * @param member -> Member object yang menggunakan sistem.
     */
    public void run(Scanner in, Member member){
        loginMember = member;
        boolean logout = false;
        while (!logout) {
            displayMenu();
            int choice = in.nextInt();
            in.nextLine();
            logout = processChoice(choice);
        }
        loginMember = null;
        System.out.println("Logging out...");
    }

    /**
     * Mengecek semua user dengan ID dan password yang diberikan.
     *
     * @param id -> ID pengguna yang akan diautentikasi.
     * @param pass -> password pengguna untuk mengautentikasi.
     * @return  Member object yang diautentikasi, null jika autentikasi gagal.
     */
    public Member authUser(String id, String pass) {
        for (Member user : memberList) {
            if (!user.getId().equals(id)) {
                continue;
            }
            if(user.login(id, pass)){
                return user;
            }
            return null;
        }
        return null;
    };

    /**
     * Memeriksa apakah ada Member dengan ID yang diberikan.
     *
     * @param id -> ID yang akan diperiksa.
     * @return true jika ada member dengan ID yang diberikan, false jika tidak.
     */
    public boolean isMemberExist(String id){
        for (Member member:
                memberList) {
            if(member.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    /**
     * Displays main menu untuk user yang menggunakan sistem.
     */
    protected void displayMenu(){
        System.out.printf("\nLogin as : %s\nSelamat datang %s!\n\n", loginMember.getId(), loginMember.getNama());
        displaySpecificMenu();
        System.out.print("Apa yang ingin Anda lakukan hari ini? ");
    }

    /**
     * Memproses pilihan dari pengguna yang menggunakan sistem sesuai dengan rolesnya.
     *
     * @param choice -> pilihan pengguna.
     * @return true jika user log.
     */
    protected abstract boolean processChoice(int choice);

    /**
     * Displays specific menu sesuai class yang menginheritnya.
     */
    protected abstract void displaySpecificMenu();
}