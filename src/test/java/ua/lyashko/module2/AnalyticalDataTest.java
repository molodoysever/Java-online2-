package ua.lyashko.module2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lyashko.module2.entity.Customer;
import ua.lyashko.module2.entity.Invoice;
import ua.lyashko.module2.entity.Telephone;
import ua.lyashko.module2.entity.Television;
import ua.lyashko.module2.services.AnalyticalData;

import java.util.Collections;
import java.util.List;

class AnalyticalDataTest {

    List<Invoice> invoices = List.of (new Invoice ( Collections.singletonList ( new Telephone ( "iPhone" , "Apple" , "LED" , 1050 ) ) ,
                    new Customer (1, "aboba", 15  ), Type.retail),
            new Invoice ( Collections.singletonList ( new Television ( "RTI" , 50 , "QLED" , "China" , 500 ) ) ,
                    new Customer ( 50, "wassup", 50 ), Type.wholesale ) );

    @Test
    void soldByCategory () {
        Assertions.assertEquals ("Televisions: 1 Telephones: 1" ,
                AnalyticalData.soldByCategory ( invoices ));
    }

    @Test
    void theSmallestCheck () {
        Assertions.assertEquals ( "The smallest check sum : 500 Customer{id=50, email='wassup', age=50}",
                AnalyticalData.theSmallestCheck ( invoices ) );
    }

    @Test
    void allPurchasesSum () {
        Assertions.assertEquals ("All purchases sum : 1550" ,
                AnalyticalData.allPurchasesSum ( invoices ) );
    }

    @Test
    void retailChecks () {
        Assertions.assertEquals ("Retail checks: 1" ,
                AnalyticalData.retailChecks ( invoices ));
    }

    @Test
    void oneTypeChecks () {
        Assertions.assertEquals ( """
                        One type checks: [
                        Invoice{goods=[Telephone{series='iPhone', screenType='LED', price='1050', model='Apple'}], customer=Customer{id=1, email='aboba', age=15}, type=retail}][
                        Invoice{goods=[Television{series='RTI', screenType='QLED', price='500', diagonal=50, country='China'}], customer=Customer{id=50, email='wassup', age=50}, type=wholesale}]""" ,
                AnalyticalData.oneTypeChecks ( invoices ));
    }

    @Test
    void firstThreeChecks () {
        Assertions.assertEquals ( """
                        First three checks: [
                        Invoice{goods=[Telephone{series='iPhone', screenType='LED', price='1050', model='Apple'}], customer=Customer{id=1, email='aboba', age=15}, type=retail},\s
                        Invoice{goods=[Television{series='RTI', screenType='QLED', price='500', diagonal=50, country='China'}], customer=Customer{id=50, email='wassup', age=50}, type=wholesale}]""" ,
                AnalyticalData.firstThreeChecks ( invoices ));
    }

    @Test
    void checksUnder18 () {
        Assertions.assertEquals ("Checks under 18: [\n" +
                        "Invoice{goods=[Telephone{series='iPhone', screenType='LED', price='1050', model='Apple'}], customer=Customer{id=1, email='aboba', age=15}, type=retail}]" ,
                AnalyticalData.checksUnder18 ( invoices ));
    }

    @Test
    void sortChecks () {
        Assertions.assertEquals ( """
                        Sorted checks by age: [
                        Invoice{goods=[Television{series='RTI', screenType='QLED', price='500', diagonal=50, country='China'}], customer=Customer{id=50, email='wassup', age=50}, type=wholesale},\s
                        Invoice{goods=[Telephone{series='iPhone', screenType='LED', price='1050', model='Apple'}], customer=Customer{id=1, email='aboba', age=15}, type=retail}]
                        Sorted checks by quantity: [
                        Invoice{goods=[Television{series='RTI', screenType='QLED', price='500', diagonal=50, country='China'}], customer=Customer{id=50, email='wassup', age=50}, type=wholesale},\s
                        Invoice{goods=[Telephone{series='iPhone', screenType='LED', price='1050', model='Apple'}], customer=Customer{id=1, email='aboba', age=15}, type=retail}]
                        Sorted checks by total sum: [
                        Invoice{goods=[Television{series='RTI', screenType='QLED', price='500', diagonal=50, country='China'}], customer=Customer{id=50, email='wassup', age=50}, type=wholesale},\s
                        Invoice{goods=[Telephone{series='iPhone', screenType='LED', price='1050', model='Apple'}], customer=Customer{id=1, email='aboba', age=15}, type=retail}]""" ,
                AnalyticalData.sortChecks ( invoices ));
    }
}