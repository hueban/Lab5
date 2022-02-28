package ShoppingSim;

import ShoppingSim.CustomerThings.CustomerFactory;

public class ShoppingState {
    protected CustomerFactory customerFactory;
    protected ShoppingQueue shoppingqueue;
    protected ArrivalRandom arrivalRandom;
    protected ShopRandom shopRandom;
    protected PayRandom paylRandom;

    protected int N; // antalet kunder i affären
    protected int M; // max kunder i affären
    protected float S; // stängningstid
    protected long f; // seed
    protected int payingCustomers;
    protected int lostCustomers;
    protected float unusedCashRegisterTime;
    protected float queueTime;

}
