package by.epam.learn.tranfer.action;

import by.epam.learn.tranfer.bean.Account;

public class TransferAction {
    public static int taxRate = 12;
    private double amountTaxes;
    public double getAmountTaxes(){
        return amountTaxes;
    }

    public static void increaseTaxRate(){
        taxRate++;
    }

    public boolean transferIntoAccount(double asset, Account from, Account to){
        if(asset<=0 || from== null || to==null){
            throw new IllegalArgumentException();
        }
        boolean isDone = false;
        double currentAmountTaxes = asset/taxRate;
        amountTaxes+=currentAmountTaxes;
        double demand = from.getAsset() - asset * (1 + currentAmountTaxes);
        if (demand>=0){
            from.setAsset(demand);
            to.setAsset(asset);
            isDone = true;
        }
        return isDone;
    }
}
