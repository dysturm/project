import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    void CalculatorTest(){
        Calculator mCalc = new Calculator();

        double num = mCalc.calculateMaaserOwed();

        assertEquals(num, 0);
    }
    @Test
    void DataStorageManagerTest(){
        DataStorageManager mDSM = new DataStorageManager();

        mDSM.addDeposit(0);
        double num = mDSM.getLastDeposit();

        assertEquals(num, 0);
    }
}
