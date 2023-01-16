package by.epam.learn.tranfer.bean;

public class Account {
    private long accountId;
    private double asset;
    public Account(){
        super();
    }

    public Account(long accountId){
        super();
        this.accountId=accountId;
    }

    public Account(long accountId, double asset){
        this.accountId=accountId;
        this.asset=asset;
    }

    public double getAsset(){
        return asset;
    }

    public void setAsset(double asset){
        this.asset=asset;
    }

    public long getAccountId(){
        return accountId;
    }

    public void setId(long accountId){
        this.accountId=accountId;
    }

}
