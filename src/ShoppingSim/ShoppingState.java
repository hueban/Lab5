package ShoppingSim;

import ShoppingSim.CustomerThings.CustomerFactory;

public class ShoppingState {
    protected CustomerFactory customerFactory;
    protected ShoppingQueue shoppingqueue;
    protected ArrivalRandom arrivalRandom;
    protected ShopRandom shopRandom;
    protected PayRandom paylRandom;

    protected int N;
    protected int M;
    protected float S;
    protected long f;
    protected int payingCustomers;
    protected int lostCustomers;
    protected float unusedCashRegisterTime;
    protected float queueTime;

}
