list_item = []
def add_items(input):
	if type(input) == int:
		raise ValueError("Invalid Input Number Expected")
	list_item.append(input)
	return list_item

def remove_items(input):
	list_item.remove(input)
	return list_item
def disply_item():
	return list_item 

def print_user_InterFace():
	userInterface = ("""
	Welcome To Bustavo Stores Where You Can List Your TO-DO List
		>>>>> 1. Add Items
		>>>>> 2. Remove Items
		>>>>> 3. Display The List
		>>>>> 0. To Exit
	""")
	return userInterface
def mainInterface():
	print(print_user_InterFace())
	userInput = 15
	while(userInput != 0):
		userInput = int(input('Enter The Menu You Want Enter \n '))
		match userInput:
			case 1 : 
				userprompt = input('Enter The Item\n ').lower()
				add_items(userprompt)
				print('Added Succesfully')
				userprompt = input('Enter The 00 to Back ')
			case 2 :
				userprompt = input('Enter The Item You Want to Remove \n ').lower()
				remove_items(userprompt)
			case 3 :
				print(disply_item())
			case 0 :
				print('Exit')
			case _	:
				print("Invalid Items")
		if userInput != 0:
			print(print_user_InterFace())
mainInterface()


				

	
	
	
	