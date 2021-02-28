user1 = input("what is player1 name")
user2 = input("what is player2 name")

user1_answer = input(user1 + "what is your selection from rock, paper or scissors")
user2_answer = input(user2 + "what is your selection from rock, paper or scissors")

if user1_answer==user2_answer:
  print("its tie")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
        print("Rock wins")
    else:
        print("Paper wins")
elif user1_answer == "scissors":
        if user2_answer == 'paper':
            print("scissors win")
        else:
            print("Rock wins")
elif user1_answer == 'paper':
        if user2_answer == 'rock':
           print("paper wins")
        else:
            print("scissors wins")    
else:
     print("invalid input")
     repeat= input("do you want to play another round? Yes/No")
     if (repeat == "Yes"):
         pass
     elif (repeat == "No"):
            raise SystemExit
     else:
            print("You entered invalid option")
            raise SystemExit