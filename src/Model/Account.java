package Model;

public class Account {
    private String accountId;
    private String accountPw;
    private String role;
    private boolean sta;
    public Account() {
    }

    public Account(String accountId, String accountPw, String role, boolean sta) {
        this.accountId = accountId;
        this.accountPw = accountPw;
        this.role = role;
        this.sta = sta;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountPw() {
        return accountPw;
    }

    public String getRole() {
        return role;
    }

    public boolean isSta() {
        return sta;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setAccountPw(String accountPw) {
        this.accountPw = accountPw;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSta(boolean sta) {
        this.sta = sta;
    }

    

}