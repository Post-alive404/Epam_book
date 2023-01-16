package by.epam.learn.tranfer.action;
import  by.epam.learn.tranfer.bean.Account;
public class TransferIntoAction {
    public boolean transferIntoAccount(double asset, Account from, Account to){
        if (asset<=0 || from==null || to==null){
            throw new IllegalArgumentException();
        }
        boolean isDone = false;
        double demand = from.getAsset() - asset;
        if (demand>=0){
            from.setAsset(demand);
            to.setAsset(asset);
            isDone = true;
        }
        return isDone;
    }
}
