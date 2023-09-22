package oppassignment;

import java.util.Scanner;

public class Oopassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name,design,date;
		Integer days,pay,bpay;
		System.out.print("Name: ");
		name = input.nextLine();
		System.out.print("Design: ");
		design = input.nextLine();
		System.out.print("Date: ");
		date = input.nextLine();
		System.out.print("Days: ");
		days = input.nextInt();
		System.out.print("Pay rate: ");
		pay = input.nextInt();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
		String employee = input.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.println("                      SHREE KRISHNA CHEMISTS AND DRUGGIST");
		System.out.println("                              SALARY MONTH 9 2013");
		System.out.println("");
		System.out.println("        EMP.NO.: " + employee + "             EMP.NAME: "  + name + "              DESIGNATION: " + design);
		System.out.println("        DAYS WORKED: " + days + "       GPAY RATE: "  + pay + "                GEN. DATE: " + date);
		String sums = new String(new char[80]).replace('\0', '_');
		System.out.println("        " + sums);
		System.out.println("        EARNINGS            AMOUNT(RS.)            DEDUCTIONS           AMOUNT(RS.)");
		bpay = days * pay;
		System.out.println("        " + sums);
		System.out.println("        BASIC PAY           " + bpay + "                  P.F.                 " + (int)(bpay / 10));
		System.out.println("                                                   PROF. TAX            " + (int)(0.2 * (bpay / 10)));
		System.out.println("");
		System.out.println("        " + sums);
		System.out.println("");
		System.out.println("        GROSS EARN.        "  + bpay + "                   TOTAL DEDUCT.        " + (int)((bpay / 10) + 0.2 * (bpay / 10)));
		System.out.println("                                                   NET PAY              " + (int)(bpay - ((bpay / 10) + 0.2 * (bpay / 10))));
		System.out.println("        " + sums);
	}
	
}