package Classes.Adapter_Pattern.example2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * BankCustomerAdapter
 */

public class BankCustomerAdapter extends BankDetail_Adaptee implements CreditCard_Target {

    @Override
    public void giveBankDetail() {
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername = br.readLine();

            System.out.println("Enter the account Number: ");
            long accNo = Long.parseLong(br.readLine());

            System.out.println("Enter the bank Name:");
            String bankName = br.readLine();

            setAccHolderName(customername);
            setAccNumber(accNo);
            setBankName(bankName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {

        long accNo = getAccNumber();
        String accHolderName = getAccHolderName();
        String bName = getBankName();

        return ("The Account Number " + accNo + " of " + accHolderName + " in " + bName
                + " bank is valid and authenticated for issuing the credit card.");

    }
}