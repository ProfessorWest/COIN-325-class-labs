/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab18;

/**
 *
 * @author pwest
 */
public class Employee {
    private String mName, mSSN, mBDay, mDiversity;
    
    Employee(String name, String SSN, String BDay, String Diversity) {
        mName = name;
        mSSN = SSN;
        mBDay = BDay;
        mDiversity = Diversity;
    }
    
    public String getKey() {
        return mSSN + mDiversity;
    }
    
    public String getBDay() {
        return mBDay;
    }
}
