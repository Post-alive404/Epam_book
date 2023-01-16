package by.epam.learn.optional;
import by.epam.learn.entity.Order;
import java.util.*;
public class OptionMain {
    public static void main(String[] args){
        List<Order> list = new ArrayList<>();
        list.add(new Order(71L, 100D));
        list.add(new Order(18L, 132D));
        list.add(new Order(24L, 210D));
        list.add(new Order(35L, 639D));
        OrderAction action = new OrderAction();
        Optional<Order> optionalOrder = action.findById(list, 35);
        if(optionalOrder.isPresent()){
            System.out.println(optionalOrder.get());
        }
        Set<Order> set = new HashSet<>();
        optionalOrder.ifPresent(set::add);
        System.out.println(set);

    }
}
