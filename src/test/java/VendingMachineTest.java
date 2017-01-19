import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class VendingMachineTest {

    @Test
    public void createVendingMachine_isInitializedWithAName() {
        VendingMachine vendingMachine1 = new VendingMachine("Willow Plaza Machine");
        assertEquals("Willow Plaza Machine", vendingMachine1.name);


        VendingMachine vendingMachine2 = new VendingMachine("G2 Lab Machine");
         assertEquals("G2 Lab Machine", vendingMachine2.name);


    }

    // Add items to vending
    @Test
    public void addItemstoVendingMachineTest() {
        VendingMachine vm1 = new VendingMachine("G2 Lab Machine");
        vm1.addItem("Pretzel",2,2.50);
        assertFalse(vm1.isEmpty());

        VendingMachine vm2 = new VendingMachine("Willow Plaza Machine");
        assertTrue(vm2.isEmpty());
    }


    // vend particular item
    @Test
    public void vendParticularItem() {
        VendingMachine vm1 = new VendingMachine("G2 Lab Machine");
        vm1.addItem("Pretzel",2,2.50);
        vm1.addItem("Pretzel 1",12,2.50);
        vm1.addItem("Pretzel 2",29,2.50);
        vm1.addItem("Pretzel 3",20,2.50);

        vm1.vend("Pretzel");

        vm1.vend("Pretzel 1");
        vm1.vend("Pretzel 1");
        vm1.vend("Pretzel 2");

        assertEquals(1, vm1.getCount("Pretzel"));
        assertEquals(10, vm1.getCount("Pretzel 1"));
        assertEquals(28, vm1.getCount("Pretzel 2"));


    }




    //Remove items from Vending machine
   @Test
    public void removeItemfromVendingMachine() {
        VendingMachine vm1 = new VendingMachine("G2 Lab Machine");
        vm1.addItem("Pretzel",2,2.50);
        vm1.addItem("Pretzel 1",12,2.50);
        vm1.addItem("Pretzel 2",29,2.50);
        vm1.addItem("Pretzel 3",20,2.50);
        vm1.remove("Pretzel 1");

        assertEquals(0, vm1.getCount("Pretzel 1"));


    }

    //Total Value of Items in inventory for insurance claim
    @Test
    public void getTotalValueTest() {
        VendingMachine vm1 = new VendingMachine("G2 Lab Machine");
        vm1.addItem("Pretzel",2,2.50);
        vm1.addItem("Pretzel 1",2,3.50);
        vm1.addItem("Pretzel 2",1,2.50);
        vm1.addItem("Pretzel 3",3,2.50);

        assertEquals(22, vm1.getTotalValue(), 0.01);


    }


    //

}
