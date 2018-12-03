from easygui import*
import sys
while 1:
    msgbox("Welcome to Apna Bazaar")

    msg ="Which site would you like?"
    title = "Site names"
    choices = ["Amajaan", "Pepperfry", "Myntra"]
    choice = choicebox(msg, title, choices)
    if choice=="Amajaan":
            msg1="Which department?"
            title1="which section"
            choices1= ["clothes","footware","food"]
            choice1= choicebox(msg1,title1,choices1)
            if choice1=="clothes":
                        msg11="which brand"
                        title11="price range"
                        choices11=["gucci","vans"]
                        choice11= choicebox(msg11,title11,choices11)
                        if choice11=="gucci":
                                 msg111="you choose vendors"
                                 choices111=["$40-P","$56-X"]
                                 choice111= choicebox(msg111,choices111)
    elif choice=="Pepperfry":
            msg2="which deparrtment"
            title2="which section"
            choices2=["sofa","table","posters"]
            choice2= choicebox(msg2,title2,choices2)
    elif choice=="Myntra":
            msg3="which department"
            title3="which section"
            choices3=["men", "women","kids"]
            choice3= choicebox(msg3,title3,choices3) 
    # note that we convert choice to string, in case
    # the user cancelled the choice, and we got None.
    msgbox("You chose: " + str(choice), "shopping bag")

    msg = "Do you want to continue?"
    title = "Please Confirm"
    if ccbox(msg, title):     # show a Continue/Cancel dialog
        pass  # user chose Continue
    else:
        sys.exit(0)
