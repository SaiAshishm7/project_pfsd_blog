import math

def cal():
   
    
    print("1. add, 2. sub, 3. mul, 4. div, 5. min, 6. max, 7. power, 8. remainder, 9. factorial, 10. sin, 11. cos, 12. tan, 13. degree, 14. radians, 15. log base 10, 16. square root")
    choice = int(input("Enter the choice: "))
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    if choice == 1:
        print("SUM =", a + b)
    elif choice == 2:
        print("SUB =", a - b)
    elif choice == 3:
        print("MUL = ", a * b)
    elif choice == 4:
        if b == 0:
            print("Cannot divide by zero")
        else:
            print("DIVISION = ", a / b)
    elif choice == 5:
        print("MIN =", min(a, b))
    elif choice == 6:
        print("MAX =", max(a, b))
    elif choice == 7:
        print("POWER =", a ** b)
    elif choice == 8:
        print("REMAINDER =", a % b)
    elif choice == 9:
        print("FACTORIAL OF", a, "is", math.factorial(a))
    elif choice == 10:
        print("SIN of", a, "is", math.sin(a))
    elif choice == 11:
        print("COS of", a, "is", math.cos(a))
    elif choice == 12:
        print("TAN of", a, "is", math.tan(a))
    elif choice == 13:
        print("Degree to Radians is", a * math.pi / 180)
    elif choice == 14:
        print("Radians to Degree is", b * 180 / math.pi)
    elif choice == 15:
        print("LOG base 10 of", a, "is", math.log10(a))
    elif choice == 16:
        print("Square root of", a, "is", math.sqrt(a))
    else:
        print("Invalid choice")

cal()