def futureInvestmentValue(investmentAmount, annualInterestRate, years):
    monthlyInterestRate = annualInterestRate / 12 / 100
    return investmentAmount * (1 + monthlyInterestRate) ** (12 * years)

investmentAmount = float(input("Enter the investment amount: "))
annualInterestRate = float(input("Enter the annual interest rate in percent: "))

print("Years\tFuture Value")
for i in range(1, 31):
    print(f"{i}\t{round(futureInvestmentValue(investmentAmount, annualInterestRate, i), 2)}")