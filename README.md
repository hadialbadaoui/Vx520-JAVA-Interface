# Vx520-JAVA-Interface
An Example Interface: How you can communicate with Vx520. 

Objective: After you read this tutorial, you can use Vx520-JAVA-Interface to communicate with Vx520

We consider that you have:
- Vx520 POS Terminal
- Cable RS232
- Cable Connectivity
- Cable power charge

Easy steps to rich the Vx520-JAVA-Interface:
- Download it: if you want just to test your Vx520.
  Clone it: Clone with HTTPS, Use Git or checkout with SVN using the web URL: https://github.com/hadialbadaoui/Vx520-JAVA-Interface.git
- Open the project in netbeans.
- clean and build.
- A new folder named "dist" appear, in this folder we have the Executable Jar File (.jar) named "Vx520"
- Double click on it to run.

How Vx520-JAVA-Interface work?
- You should choose the right com name and put it in the COM Name.
- Click the button "Test Connection" to check the connection with Vx520 POS Terminal.
- Parameter 1: The reference should be 8 digits.
- Parameter 2: The amount should be 12 digits.
- Parameter 3: The currency should be just dollars($/USD) or Lebanese pound (LL/LBP).
- After you fill these 3 parameters, you can click to any of these buttons: "Sale", "Refund" and "Void".
- The button "Sale": Send to the Vx520 a sale transaction with the reference, amount and currency to pay. You can see the result on the     screen of Vx520 POS Terminal
- The button "Refund": it's not work for all client. So, we create it but we not use it.
- The button "Void": Send to the Vx520 a void transaction with the reference, amount and currency to return the payment. You can see the     result on the screen of Vx520 POS Terminal
- The button "Settlement": Send to the Vx520 a Settlement transaction to send all sale, refund and void transaction to the owner and empty   the batch.
- The button "Exit": Exit from Vx520-JAVA-Interface.
- Finally, all the result appears in the screen of Vx520-JAVA-Interface.

Thank you, I will continue later with all tricky happens.
