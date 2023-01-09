# HELLO WORLD PROGRAM 

print("Hi")

name = input("What is your name?")

print("It's nice to meet you", name)

answer = input("Are you enjoying the course?")

#Java: if(5<6){}
# no paranthesis needed just : 


if answer == "yes": 
    print("Thats awesome")
    
else:
    print("Oh No!!")
# 2 **3 means 2^3 
# 2 // 3 means the remainder 

#how to define and call a function 
def say_hi(): 
    print("hi")

say_hi()

#In python indentation is very important

def withdrawal_money(current_balance, amount):
    if(current_balance >= amount): 
        current_balance = current_balance - amount
    print("The balance is", current_balance)

withdrawal_money(500,35)


