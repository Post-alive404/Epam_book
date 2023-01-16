package by.epam.learn.abstractClasses;
import java.math.BigDecimal;
public abstract class AbstractCardAction {
    private BigDecimal amount;
    public AbstractCardAction(){}
    public abstract void doPaymant(BigDecimal amountPayment);
    public void setAmount(BigDecimal amount){
        this.amount = amount;
    }
}
