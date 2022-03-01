package ShoppingSim;

import GeneralSim.State;
import ShoppingSim.CustomerThings.CustomerFactory;

public class ShoppingState extends State {
    protected CustomerFactory customerFactory;
    protected ShoppingQueue shoppingqueue;
    protected ArrivalRandom arrivalRandom;
    protected ShopRandom shopRandom;
    protected PayRandom paylRandom;

    protected int N; // antalet kunder i affären
    protected int M; // max kunder i affären
    protected float S; // stängningstid
    protected long f; // seed/frö
    
    protected int payingCustomers;
    protected int lostCustomers;
    protected float unusedCashRegisterTime;
    protected float queueTime;

}
