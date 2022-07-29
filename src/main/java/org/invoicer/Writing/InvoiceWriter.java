package org.invoicer.Writing;

import lombok.extern.slf4j.Slf4j;
import org.invoicer.model.Invoice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Slf4j
public class InvoiceWriter {


    protected boolean createNewFile(Invoice i) {

        int invoiceNumer = ((int) (Math.random() * 100))*(int)(Math.random()*100);
        String path = "C:\\Users\\Marco\\Documents\\Invoices\\Invoice"+invoiceNumer+".txt";
        try {
            File newInvoice = new File(path);

           //create context:
            String templateContent = "Dear "+i.getCustomerName()+", \n " +
                    "Thank you for purchasing the product. The invoice will be send by mail.";


            if (newInvoice.createNewFile()) {
                log.info("File created: " + newInvoice.getName()+ " with id: "+i.getId() );
                log.info("Writing invoice please wait");

                FileWriter fw = new FileWriter(path);
                fw.write(templateContent);
                fw.close();
                return true;
            } else {
                log.info("File already excists");
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
