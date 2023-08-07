# Order Calculation System!

An Order Calculation System using Spring Boot(Java framework) !

System to calculate the total value of an order, considering a percentage of discount and shipping. Calculating the total order value consists of applying the discount to the base order value and adding the shipping cost.

The discount percentage is entered by the user, as well as the base value of the order, and the identification code.

The rule for calculating shipping costs is as follows:


If the order value is below $100.00, shipping costs $20.00, if the order value is between $100.00 and $200.00, shipping costs $12.00 and if it is $200 or more, shipping is free.


The logic for calculating the total order value is implemented by components (services), each with its responsibility, as described below:

OrderService Service: responsible for operations related to orders.
ShippingService Service: responsible for operations related to freight.

This solution is implemented in Java with Spring Boot. The output is shown in the application's terminal log. Each service is implemented as a component registered with @Service.


|               SCREENSHOT             
:------------------------------------------------:
 ![](project-screenshot/ordering_system.png)


## How to use? 🔌
1. Press the **Fork** button (top right the page) to save copy of this project on your account.

2. Download the repository files (project) from the download section or clone this project by typing in the git bash the following command:

       git clone https://github.com/lopesmfelipe/Order-Calculation-System.git
3. Run the application in an IDE that has dedicated spring support such as Intellj, Eclipse, Netbeans.
 
4. You can also modify this project as you want.


## Contributing 💡
If you want to contribute to this project and make it better with new ideas, your pull request is very welcomed.
If you find any issue just put it in the repository issue section, let's code!

## Thank You
Please ⭐️ this repo and share it with others!


