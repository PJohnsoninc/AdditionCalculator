package model;

/**
 * @author peterjohnson - pmjohnson5
 * CIS175-Fall 2022
 * September 17, 2022
 */
// This program takes user input of two whole numbers, adds them together, and shows the result.
// It then takes user input of a third whole number, adds the three numbers together, and shows 
// the total result.

public class AdditionCalculator {
	
	// Declare variables
	int firstNumber;
	int secondNumber;
	int thirdNumber;
	int result;
	int totalResult;

	// Default constructor
	public AdditionCalculator() {
		super();
	}
	
	// Constructor with two integer parameters
	public AdditionCalculator(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		addNumbers(firstNumber, secondNumber);
	}
	
	// Constructor with three integer parameters
	public AdditionCalculator(int firstNumber, int secondNumber, int thirdNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
		addTotalNumbers(firstNumber, secondNumber, thirdNumber);
	}

	// Getters and Setters
	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public int getThirdNumber() {
		return thirdNumber;
	}
	
	public void setThirdNumber(int thirdNumber) {
		this.thirdNumber = thirdNumber;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	public int getTotalResult() {
		return totalResult;
	}
	
	public void setTotalResult(int totalResult) {
		this.totalResult = totalResult;
	}
	
	// Method to add two numbers
	private void addNumbers(int firstNumber, int secondNumber) {		
		setResult(firstNumber + secondNumber);		
	}

	// Method to add three numbers
	private void addTotalNumbers(int firstNumber, int secondNumber, int thirdNumber) {		
		setTotalResult(firstNumber + secondNumber + thirdNumber);
	}
	
}






