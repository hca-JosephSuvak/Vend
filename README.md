## Vending Machine Project

This is a solution to create the MHO Vending Machine challenge in Java. Development is ongoing and the general schematics have been drawn. Requires to refactor and organize the solution. Structure subject to change as refactoring is ongoing.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

The `src` contains a folder called 'vendIT' which contains the following:

- `Calc.java`: the file to maintain the button.
- `CalcProps.java`: Calcs the Property values for the coins inputted in.
- `Coin.java`: Models & Feeds coins to CalcProps.
- `coinBundle.java`: Models & Feeds coins to CalcProps.
- `Main.java`: Kicks up the processes using tvint [stands for text vending interface]
- `Prdct.java`: Holds the product classes.
- `vcon.java`: [stands for 'vending controller'] Controller merging coinBundle.java and vreqsell.java.
- `vconclass.java`: Implement vcon and uses calculator.
- `vint.java`: [Stands for Virtual Interface] - Facilitates the process java needs to utilize.
- `vreqsell.java`: Product request for selling

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
